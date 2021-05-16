package com.dogcollars;

public class Main {
    public static void main(String[] arg){
        DogCollar collar_1 = new DogCollar();
        DogCollar collar_2 = new DogCollar("Dog", Color.BLACK, 100, 45);
        DogCollar collar_3 = new DogCollar("Purina", Color.BLUE, 28, 60,3,1,true,Materials.METAL, 23,"Purina super collar",4);

        collar_1.printPeriodOfValidityYears();
        System.out.println(collar_1);
        System.out.println(collar_2);
        System.out.println(collar_3);

        collar_2.resetValues("Doggy",Color.RED, 24, 47,3,1,true,Materials.RUBBER, 23,"Purina mega collar",4);
        System.out.println(collar_2);

    }
}
