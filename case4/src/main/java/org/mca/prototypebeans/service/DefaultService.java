package org.mca.prototypebeans.service;

public class DefaultService {

    private final String value;

    public DefaultService(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
