package testExecutionEngine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class KeywordDrivenTemplate {
    /*
    keyword driver -> will drive with keywords(method name)
    eg -> launchBrowser, loadGoogleURL, searchKeyword, ValidateSearch

    1. We need to know what are all the class files contains Testcases
    2. We need to convert classfile string to class
     */
    public static void main(String[] args) {
        try {
            Class<?> className= Class.forName("com.google.TestCases");
            Method[] methodName = className.getDeclaredMethods();
            for(Method met: methodName){
                met.invoke(className.getDeclaredConstructor().newInstance(),(Object[])met.getParameters());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
