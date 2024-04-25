package com.oryshchych.qr.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),

    USERS_READ("users:read"),
    USERS_UPDATE("users:update"),
    USERS_CREATE("users:create"),
    ;

    @Getter
    private final String permission;
}