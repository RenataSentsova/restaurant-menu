package restaurant.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {
    private ArrayList<MenuItem> items;
    private LocalDate lastUpdate;

    public Menu (ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdate = LocalDate.now();
    }

    public ArrayList<MenuItem> getItems () {
        return items;
    }
    public LocalDate getLastUpdate () {
        return lastUpdate;
    }

    public void addItem (MenuItem newItem) {
        getItems().add(newItem);
    }

    public void deleteItem (String name) {
        for (int i = 0; i < getItems().size(); i++) {
            if (getItems().get(i).getName().equals(name)) {
                getItems().remove(getItems().get(i));
                break;
            }
        }
    }

    public boolean checkFoDuplicate (String name) {
        for (int i = 0; i < getItems().size(); i++) {
            if (getItems().get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void print () {
        System.out.println("-----MENU-----");
        System.out.println("Last updated: " + getLastUpdate());

        for (int i = 0; i < getItems().size(); i++) {
            System.out.println("----------");
            System.out.print(i + ": ");
            getItems().get(i).print();
            System.out.println("----------");
        }
    }
}
