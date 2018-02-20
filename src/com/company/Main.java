package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 6a.
        //​
        // Sukurti žaidimą kurio tikslas atspėti skaičių nuo 1 iki 10. Kaskart spėjant skaičių ir
        //neatspėjus yra generuojamas naujas skaičius.  Žaidimas baigiasi kuomet skaičius yra
        //atspėjamas arba vartotojas kaip spėjamą skaičių įveda 0.
        //            Random rand = new Random();
        //int randomNumber  = rand.nextInt(10) + 1;

        Scanner in = new Scanner(System.in);
        int skaicius;
        Random rand = new Random();
        int atsitiktinisSkaicius = rand.nextInt(10) + 1;
        boolean arTesti = true;



        do {
            System.out.println("Atsitiktinis skaicius " + atsitiktinisSkaicius);

            System.out.print("Iveskite skaiciu: ");
            skaicius = in.nextInt();

            if(skaicius == 0 || skaicius == atsitiktinisSkaicius){
                arTesti = false;
                System.out.println("Pabagia");
            }

            atsitiktinisSkaicius = rand.nextInt(10) + 1;
        }while(arTesti);
    }
}
