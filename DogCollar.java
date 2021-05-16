package com.dogcollars;
import java.lang.String;

public class DogCollar {
    String producer;
    Color collar_color;
    int max_length_meters;
    int max_animal_weight_kg;
    private int normal_length_meters;
    private int width_of_handle_meters;
    private boolean waterproof;
    private Materials made_of;
    private float price;
    protected String name;
    protected int min_animal_weight_kg;
    public static int period_of_validity_years=5;

    public DogCollar(String producer, Color collar_color, int max_length_meters, int max_animal_weight_kg,
                     int normal_length_meters, int width_of_handle_meters, boolean waterproof,
                     Materials made_of, float price, String name, int min_animal_weight_kg){
        this.producer=producer;
        this.collar_color=collar_color;
        this.max_length_meters=max_length_meters;
        this.max_animal_weight_kg=max_animal_weight_kg;
        this.normal_length_meters=normal_length_meters;
        this.width_of_handle_meters=width_of_handle_meters;
        this.waterproof=waterproof;
        this.made_of=made_of;
        this.price=price;
        this.name=name;
        this.min_animal_weight_kg=min_animal_weight_kg;
    }

    public DogCollar(String producer, Color collar_color, int max_length_meters, int max_animal_weight_kg){
        this(producer, collar_color, max_length_meters, max_animal_weight_kg,
                0,0,false,null,0f,null,0);
    }
    public DogCollar(){}

    public void resetValues(String producer, Color collar_color, int max_length_meters, int max_animal_weight_kg,
                     int normal_length_meters, int width_of_handle_meters, boolean waterproof,
                     Materials made_of, float price, String name, int min_animal_weight_kg){
        this.producer=producer;
        this.collar_color=collar_color;
        this.max_length_meters=max_length_meters;
        this.max_animal_weight_kg=max_animal_weight_kg;
        this.normal_length_meters=normal_length_meters;
        this.width_of_handle_meters=width_of_handle_meters;
        this.waterproof=waterproof;
        this.made_of=made_of;
        this.price=price;
        this.name=name;
        this.min_animal_weight_kg=min_animal_weight_kg;
    }


    public static void printStaticPeriodOfValidityYears() {
        System.out.println(DogCollar.period_of_validity_years);
    }

    public void printPeriodOfValidityYears(){
        System.out.println("\nPeriod of validity " + DogCollar.period_of_validity_years);
    }
    public int getNormal_length_meters(int normal_length_meters) {
        return this.normal_length_meters;
    }

    public void setNormal_length_meters(int normal_length_meters) {
        this.normal_length_meters = normal_length_meters;
    }

    public int getWidth_of_handle_meters() {
        return this.width_of_handle_meters;
    }

    public void setWidth_of_handle_meters(int width_of_handle_meters) {
        this.width_of_handle_meters = width_of_handle_meters;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public Materials getMade_of() {
        return made_of;
    }

    public void setMade_of(Materials made_of) {
        this.made_of = made_of;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getPeriod_of_validity_years() {
        return period_of_validity_years;
    }

    public static void setPeriod_of_validity_years(int period_of_validity_years) {
        DogCollar.period_of_validity_years = period_of_validity_years;
    }

    @Override
    public String toString() {
        return "DogCollar{"
                + "producer='" + producer + '\''
                + ", collar_color=" + collar_color
                + ", max_length_meters=" + max_length_meters
                + ", max_animal_weight_kg=" + max_animal_weight_kg
                + ", normal_length_meters=" + normal_length_meters
                + ", width_of_handle_meters=" + width_of_handle_meters
                + ", waterproof=" + waterproof
                + ", made_of=" + made_of
                + ", price=" + price
                + ", name=" + name+ '\''
                + ", min_animal_weight_kg=" + min_animal_weight_kg
                + '}';
    }
}

enum Materials{
    RUBBER,
    CLOTH,
    METAL,
    NOTHING
}

enum Color{
    BLUE,
    BLACK,
    PINK,
    YELLOW,
    RED,
    PURPLE,
    NOTHING
}