package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //in 1 cup of ingredients
        int milkCup = 50;
        int waterCup = 200;
        int beansCup = 15;
        //enter sum of ingredients
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterSum = s.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkSum = s.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beansSum = s.nextInt();

        int milk = milkSum / milkCup;
        int water = waterSum / waterCup;
        int beans = beansSum / beansCup;

        int min;
        if (beans < milk && beans < water)
        {
            min = beans;
        }
        else if (milk < beans && milk < water)
        {
            min = milk;
        }
        else
        {
            min = water;
        }

        System.out.println("Write how many cups of coffee you will need:");
        int cup;

        while(min!=0)
        {

            cup = s.nextInt();

            if (min >0 && min>cup)
            {
                System.out.println("Yes, I can make that amount of coffee (and even " + (min - cup) + " more than that)");
                min -= cup;
            }
            else if(min==1 && min==cup)
            {
                System.out.println("Yes, I can make that amount of coffee");
                min -= cup;
            }
            else
            {
                System.out.print("No, I can make only " + min + " cup(s) of coffee\n");
            }
            waterSum -= cup*waterCup;
            milkSum -= cup*milkCup;
            beansSum -= cup*beansCup;

        }



    }
}
