import model.Intro;

import java.util.Scanner;

public class OpenFile {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        boolean trigger = true;

        while (trigger){
            System.out.println("Zmiana liczb między systmami liczbowymi\n\n"+
                    "Z jakiego systemu?\n"+
                    "\t 1 dwójkowy \n" +
                    "\t 2 ósemkowy\n" +
                    "\t 3 dziesiętny\n" +
                    "\t 4 szesnastkowy");

            String odp = input.nextLine();

            switch(odp){
                case "1":
                    Intro q = new Intro();
                    q.bin();
                    break;
                case "2":
                    Intro w = new Intro();
                    w.okt();
                    break;
                case "3":
                    Intro e = new Intro();
                    e.dec();
                    break;
                case "4":
                    Intro r = new Intro();
                    r.heks();
                    break;
                case "Q":
                    trigger = false;
                    break;

    }

        }
    }
}