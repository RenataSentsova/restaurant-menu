package restaurant.model;

import java.time.LocalDate;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private CategoryName categoryName;
    private LocalDate dateOfAdding; // yyyy-MM-dd

    public MenuItem(String name, double price, String description, CategoryName categoryName, LocalDate dateOfAdding) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.categoryName = categoryName;
        this.dateOfAdding = dateOfAdding;
    }

    public MenuItem(String name, double price, String description, CategoryName categoryName) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.categoryName = categoryName;
        this.dateOfAdding = LocalDate.now();
    }

    public String getName () {
        return name;
    }
    public double getPrice () {
        return price;
    }
    public String getDescription () {
        return description;
    }
    public CategoryName getCategoryName () {
        return categoryName;
    }
    public LocalDate getDateOfAdding () {
        return dateOfAdding;
    }

    public void print () {
        if (getDateOfAdding().isAfter(LocalDate.parse("2020-01-01"))) {
            System.out.println("*NEW*");
        }
        System.out.println(getName());
        System.out.println(getCategoryName());
        System.out.println(getDescription());
        System.out.println(getPrice() + "$");
    }
}
