package com.design.patterns.creational.builder.ex2.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
