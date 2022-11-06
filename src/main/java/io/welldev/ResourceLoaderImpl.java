package io.welldev;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component("resourceLoaderImpl")
public class ResourceLoaderImpl implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void showResourceDataUsingFilePath() throws IOException {
        Resource resource = resourceLoader.getResource("Hello.txt");
        InputStream stream = resource.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        while(true) {
            String line = reader.readLine();

            if (line == null)
                break;
            System.out.println(line);
        } reader.close();
    }
}
