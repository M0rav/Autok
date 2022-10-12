package hu.home.SportAutok;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List <Auto> autok = new ArrayList<>();
    public static void main(String[] args) {
        Porsche kocsi1= new Porsche("Porsche 911");
        Tesle kocsi2 = new Tesle("Tesla Model S");

        Auto auto = new Auto() {
            @Override
            public void gyorsul() {

            }

            @Override
            public double getSebesseg() {
                return 0;
            }
        };
        autok.add(kocsi1);
        autok.add(kocsi2);
        int cel = 100;

        while(cel == kocsi1.sebesseg | cel == kocsi1.sebesseg){
            kocsi1.gyorsul();
            kocsi2.gyorsul();
            if (kocsi1.getSebesseg()==cel){
                System.out.println("Kocsi1 nyerte a versenyt 100 kmh elérésében azaz a Porrsche");
            }
            if (kocsi2.getSebesseg()==cel){
                System.out.println("Kocsi2 nyerte a versenyt 100 kmh elérésében azaz a Tesla");
            }


        }


    }
}
