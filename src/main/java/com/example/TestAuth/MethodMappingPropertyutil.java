package com.example.TestAuth;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MethodMappingPropertyutil {

    public static String getPropertyValue(String propertyName) {
        Properties prop = new Properties();
        String propertyValue = "";
        try (InputStream inputStream = MethodMappingPropertyutil.class.getClassLoader().getResourceAsStream("methodRoleMapping.properties")) {
            prop.load(inputStream);
            propertyValue = prop.getProperty(propertyName);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(propertyValue);
        return propertyValue;
    }
}
