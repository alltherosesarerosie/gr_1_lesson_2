package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        1
        System.out.println(permission(36, 29));
        System.out.println(permission(10, 10));
        System.out.println(permission(100, 20));
        System.out.println(permission(15, -15));
        System.out.println(permission(25, -25));


//        2
        System.out.println("The outside temperature is "+15+"\n"+
                permission(randomAge(),15));
        System.out.println("The outside temperature is "+-20+"\n"+
                permission(randomAge(), -20));

//
        System.out.println(permission(randomAge(), randomTemp()));
        System.out.println(permission(randomAge(), randomTemp()));

    }

    public static String permission(int age, double temperature) {
        String per = "";
        if (((20 < age && age < 45) && (-20 < temperature && temperature < 30))
                || (age < 20 && (0 < temperature && temperature < 28))
                || (age > 45 && (-10 < temperature && temperature < 25))) {
            per = "You can go for a walk";
        } else {
            per = "Stay at home";
        }
        return per;
    }

    public  static  int randomAge(){
        Random rd = new Random();
        int age = rd.nextInt(0,101);
        System.out.println("\nAge of person is "+age);
        return age;
    }

    public  static  int randomTemp(){
        Random rd = new Random();
        int temp = rd.nextInt(-20,45);
        System.out.println("The outside temperature is "+temp);
        return temp;
    }
}
