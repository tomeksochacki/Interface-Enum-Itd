package com.test.enumexample;
import static com.test.enumexample.OtherOrders.SOUP;


public class Orders implements Executionable {

    @Override
    public void notpossibleToDo() {
        System.out.println("Orders possible to do.");
    }

    @Override
    public void possibleToDO() {
        System.out.println("Not possible to do.");
    }

    public static void main(String[] args) {
        DoughThickness doughThickness = DoughThickness.MEDIUM;
        System.out.println("Castomer bay pizza " + doughThickness + ", diameter: " + doughThickness.getDiameter() + ", thickness: " + doughThickness.getThickness());

        System.out.println("Castomer bay other order: " + SOUP);




    }
}
