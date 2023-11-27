/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ANIMALS;

/**
 * Nama: Rachma Fadilah Kunianto
 * NIM: 22166019
 * Kelas: SISTEM INFORMASI
 * Semester: Tiga
 * Mata Kuliah: PBO1
 */
    
class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}

class Rabbit extends Animal {
    private String color;
    private String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}

public class Rabbits {
    public static void main(String[] args) {
        Rabbit peter = new Rabbit("Peter", false, "grass", 4, "grey");

        System.out.println("Hello, His name is " + peter.getName());
        System.out.println(peter.getName() + " is Vegetarian? " + peter.isVegetarian());
        System.out.println(peter.getName() + " eats " + peter.getEats());
        System.out.println(peter.getName() + " has " + peter.getNoOfLegs() + " legs");
        System.out.println(peter.getName() + "'s color is " + peter.getColor());
    }
}
