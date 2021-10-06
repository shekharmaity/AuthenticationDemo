package com.example.TestAuth;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Component
public class AuthUtil implements PermissionEvaluator {
    public boolean allowAuth(String endPoint, String role) {
        System.out.println("Auth Called");
        List roles = Arrays.asList(MethodMappingPropertyutil.getPropertyValue(endPoint).split(","));
        if (roles.contains(role)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        HttpServletRequest request = (HttpServletRequest) targetDomainObject;
        String role = request.getHeader("user-role");
        System.out.println(authentication.getName());
        System.out.println();
        System.out.println(permission);
        System.out.println("1");
        return allowAuth(permission.toString(), role);
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        System.out.println("2");
        return false;
    }
}
