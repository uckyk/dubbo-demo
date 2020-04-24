package com.provider.service;

import com.api.service.DemoApi;

import java.security.spec.ECField;
import java.util.Random;

public class DemoApiImpl implements DemoApi {
    @Override
    public String sayHi() {
        return "hi there~ ";
    }
}
