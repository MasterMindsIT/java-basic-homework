import clases.SmartDevice;
import herencia.SmartPhone;
import herencia.SmartWatch;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        SmartDevice smartPhone = new SmartPhone("Samsung","S4","Plateado",2020,"Android",8,126);
        SmartDevice smartWatch = new SmartWatch("Caterpillar","CAT-4000","Azul",2022,"5G",true ,"Platino");
        System.out.println("SmartPhone" + smartPhone.toString());
        System.out.println("SmartWatch" + smartWatch.toString());
    }
}

