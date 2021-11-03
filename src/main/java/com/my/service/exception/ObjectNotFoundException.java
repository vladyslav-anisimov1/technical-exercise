package com.my.service.exception;

import org.apache.commons.lang3.StringUtils;

public class ObjectNotFoundException extends RuntimeException {

    protected Object id;
    protected Class<?> objectClass;

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(Object id, Class<?> objectClass) {
        this.id = id;
        this.objectClass = objectClass;
    }

    public Object getId() {
        return id;
    }

    public Class<?> getObjectClass() {
        return objectClass;
    }

    public boolean isMessagePresent() {
        return StringUtils.isNotEmpty(this.getMessage());
    }
}
