package com.epam.iryna_vasylenko.java.lesson2.task1;


import com.epam.iryna_vasylenko.java.lesson2.task1.toys.*;

public class ToyRoom {

    static int maxCost = 1000;
    private static final int PRICE_FOR_TOYS_OF_ONE_KIND = maxCost / 4;

    public static Child[] children = new Child[6];

    public static void main(String[] args) {
        childrenInRoom();
        System.out.println("All children in toy room: ");
        System.out.println();
        displayAgeDistribution();
        System.out.println();

        System.out.println("Toy prices: ");
        System.out.println();

        Toys car = new Car();
        System.out.println("One car costs: " + car.getCost());

        Toys doll = new Doll();
        System.out.println("One doll costs: " + doll.getCost());

        Toys ball = new Ball();
        System.out.println("One ball costs: " + ball.getCost());

        Toys cube = new Cube();
        System.out.println("One cube costs: " + cube.getCost());
        System.out.println();

        System.out.println("A total of toys in the room allocated budget: " + maxCost);
        System.out.println("How many cars: ");
        howManyDifferentToys(car);
        System.out.println("How many dolls: ");
        howManyDifferentToys(doll);
        System.out.println("How many balls: ");
        howManyDifferentToys(ball);
        System.out.println("How many cubes: ");
        howManyDifferentToys(cube);
        System.out.println();

        Toys[] toys = {car, doll, ball, cube};
        ToyRoom room = new ToyRoom();
        room.sumOfRest(toys);

        int howManyCubesBoughtOnTheRest = room.sumOfRest(toys) / (cube.getCost());
        System.out.println("How many cubes bought on the rest: " + howManyCubesBoughtOnTheRest);

        int howManyCubes = howManyCubesBoughtOnTheRest + howManyDifferentToys(cube);
        System.out.println("So the number of cubes will be: " + howManyCubes);

    }



    private static int howManyDifferentToys(Toys toy) {
           //Price for toys of one kind

        int howManyToys = PRICE_FOR_TOYS_OF_ONE_KIND / (toy.getCost());
        System.out.println(howManyToys);
        return howManyToys;
    }


    private int sumOfRest(Toys[] toys) {
        int sumRestOfMoney = 0;
        for (int i = 0; i < toys.length; i++) {
            int restOfMoney = PRICE_FOR_TOYS_OF_ONE_KIND % (toys[i].getCost());
            sumRestOfMoney += restOfMoney;

        }
        System.out.println("Total money left: " + sumRestOfMoney);
        return sumRestOfMoney;
    }



    private static void childrenInRoom() {
        children[0] = new Child("Liza", 3);
        children[1] = new Child("Petro", 8);
        children[2] = new Child("Anna", 2);
        children[3] = new Child("Vitya", 6);
        children[4] = new Child("Margo", 5);
        children[5] = new Child("Igor", 11);
    }

    private static void displayAgeDistribution() {
        children[0].ageDistribution();
        children[1].ageDistribution();
        children[2].ageDistribution();
        children[3].ageDistribution();
        children[4].ageDistribution();
        children[5].ageDistribution();
        for (Child child : children) {
            System.out.println(child);
        }
    }
}