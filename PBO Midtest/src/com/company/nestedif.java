package com.company;
import java.util.Scanner;


public class nestedif {

    static float Hitung(float beratBadan, float tinggiBadan) {
        float BMI;
        BMI = beratBadan/(tinggiBadan*tinggiBadan);
        if (BMI < 18.5){
            System.out.println("Berat Badan : "+BMI);
            System.out.println("Berat Badan anda Underweight");
        }else if (BMI > 22.9){
            System.out.println("Berat Badan : "+BMI);
            System.out.println("Berat Badan anda Overweight");
        }else if ((BMI >= 18.5)&&(BMI <= 22.5)){
            System.out.println("Berat Badan : "+BMI);
            System.out.println("Berat Badan anda Ideal");
        }else{
            System.out.println("Error occured! Please Try Again");
        }
        return BMI;
    }

    public static void main(String[] args){
        float beratBadan, tinggiBadan, BMI;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan berat badan anda");
        beratBadan = input.nextFloat();
        System.out.println("Masukan tinggi badan anda");
        tinggiBadan = input.nextFloat();
        Hitung(beratBadan, tinggiBadan);


    }
}
