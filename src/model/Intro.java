package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Intro {
    Scanner input = new Scanner(System.in);
    Binarny one = new Binarny();
    Oktalny two = new Oktalny();
    Decymalny three = new Decymalny();
    Heksadecymalny four = new Heksadecymalny();


    public void bin (){
        System.out.println("Podaj liczbę: \n");
        String a = input.nextLine();
        String liczba = a;
         int b = liczba.length();
         int sum = 0;



//        OBSŁUGA BŁĘDÓW1
            boolean trigger = true;
            String system = "Q";
            for(int i=0; i < b; i++){
                if (liczba.substring(i, i+1).equals("0")||liczba.substring(i,i+1).equals("1")){
                    sum = sum+1;
                }}
                if (sum == b){
                    System.out.println("Na jaki system przeliczamy? \n\n" +
                            "\t1 - oktalny (ósemkowy)\n" +
                            "\t2 - decymalny (dziesiętny)\n" +
                            "\t3 - heksadecymalny (szesnastkowy)\n" +
                            "\tQ - wyjdź");

                     system = input.nextLine();                }
                else{
                    System.out.println("Podana liczba nie jest liczbą binarną\nJeszcze raz!\n\n\n");
                    trigger = false;
                }



        switch (system){
            case "1":
                one.okt(liczba);
                break;
            case "2":
                one.dec(liczba);
                break;
            case "3":
                one.heksa(liczba);
                break;
            case "Q":
                trigger = false;
                break;
        }
    }

    public void okt(){
        System.out.println("Podaj liczbę: \n");
        String a = input.nextLine();
        String liczba = a;
        int b = liczba.length();
        int sum = 0;
        String system = "Q";
        boolean trigger = true;


        List <String> sys8 = new ArrayList<String>();
        sys8.add("0");
        sys8.add("1");
        sys8.add("2");
        sys8.add("3");
        sys8.add("4");
        sys8.add("5");
        sys8.add("6");
        sys8.add("7");

        for (int i=0; i < b ; i++){
            if(sys8.contains(liczba.substring(i,i+1))){
                sum++;
            }}
            if (sum==b){
                System.out.println("Na jaki system przeliczamy? \n\n" +
                        "\t1 - binarny (dwójkowy)\n" +
                        "\t2 - decymalny (dziesiętny)\n" +
                        "\t3 - heksadecymalny (szesnastkowy)\n" +
                        "\tQ - wyjdź");

                system = input.nextLine();
            }
            else{
                System.out.println("Podana liczba nie jest liczbą oktalną\nJeszcze raz!\n\n\n");
                trigger = false;
            }


        switch (system){
            case "1":
                two.bin(liczba);
                break;
            case "2":
                two.dec(liczba);
                break;
            case "3":
                two.heksa(liczba);
                break;
            case "Q":
                trigger = false;
                break;
        }



    }
    public void dec(){
        System.out.println("Podaj liczbę: \n");
        String a = input.nextLine();
        String liczba = a;
        int b = liczba.length();
        int sum = 0;
        String system = "Q";
        boolean trigger = true;

        List<String> sys10 = new ArrayList<String>();
        sys10.add("0");
        sys10.add("1");
        sys10.add("2");
        sys10.add("3");
        sys10.add("4");
        sys10.add("5");
        sys10.add("6");
        sys10.add("7");
        sys10.add("8");
        sys10.add("9");

        for (int i=0; i < b ; i++){
            if(sys10.contains(liczba.substring(i,i+1))){
                sum++;
            }}
        if (sum==b){
            System.out.println("Na jaki system przeliczamy? \n\n" +
                    "\t1 - binarny (dwójkowy)\n" +
                    "\t2 - decymalny (dziesiętny)\n" +
                    "\t3 - heksadecymalny (szesnastkowy)\n" +
                    "\tQ - wyjdź");

            system = input.nextLine();
        }
        else{
            System.out.println("Podana liczba nie jest liczbą oktalną\nJeszcze raz!\n\n\n");
            trigger = false;
        }


        switch (system){
            case "1":
                three.bin(liczba);
                break;
            case "2":
                three.okt(liczba);
                break;
            case "3":
                three.heksa(liczba);
                break;
            case "Q":
                trigger = false;
                break;
        }
    }

    public void heks(){
        System.out.println("Podaj liczbę: \n");
        String a = input.nextLine();
        String liczba = a;


        HashMap<Integer, String> sys16 = new HashMap<Integer, String>();
        sys16.put(0,"0");
        sys16.put(1,"1");
        sys16.put(2,"2");
        sys16.put(3,"3");
        sys16.put(4,"4");
        sys16.put(5,"5");
        sys16.put(6,"6");
        sys16.put(7,"7");
        sys16.put(8,"8");
        sys16.put(9,"9");
        sys16.put(10,"A");
        sys16.put(11,"B");
        sys16.put(12,"C");
        sys16.put(13,"D");
        sys16.put(14,"E");
        sys16.put(15,"F");



        System.out.println("Na jaki system przeliczamy? \n\n" +
                "\t1 - binarny (dwójkowy)\n" +
                "\t2 - oktalny (ósemkowy)\n"+
                "\t3 - decymalny (dziesiętny)\n" +
                "\tQ - wyjdź");
        String system = input.nextLine();

        boolean trigger = true;

        switch (system){
            case "1":
                four.bin(liczba);
                break;
            case "2":
                four.okt(liczba);
                break;
            case "3":
                four.dec(liczba);
                break;
            case "Q":
                trigger = false;
                break;
        }
    }
}
