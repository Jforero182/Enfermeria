package com.example.notasenfermeria.models;
import java.util.List;
public class Menu {
    public String name;
    public List<String> options;

    public Menu(String name, List<String> options) {
        this.name = name;
        this.options = options;
    }
}
