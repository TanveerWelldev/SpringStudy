package io.welldev;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogInput implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String className = target.getClass().getName();
        String methodName = method.getName();

        System.out.println("Executing method "+methodName+" of class "+className+" with following parameters");
        for(Object parameter: args){
            System.out.println(parameter.getClass().getName() + " = "+parameter.toString());
        }
    }
}
