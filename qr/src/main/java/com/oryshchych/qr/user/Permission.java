package com.oryshchych.qr.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
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

    private final String permission;
}