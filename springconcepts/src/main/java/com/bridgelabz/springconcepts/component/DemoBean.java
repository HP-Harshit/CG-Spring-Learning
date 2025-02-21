package com.bridgelabz.springconcepts.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    public DemoBean() {
        System.out.println("DemoBean instance created");
    }

    @Override
    public String toString() {
        return "DemoBean{}";
    }
}
