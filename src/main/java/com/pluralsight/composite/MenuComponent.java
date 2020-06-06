package com.pluralsight.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class MenuComponent {

    String name;
    String url;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public abstract String toString();

    String print (MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        return builder
                .append(": ")
                .append(url)
                .append("\n")
                .toString();
    }
}
