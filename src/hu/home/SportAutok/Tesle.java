package hu.home.SportAutok;

public class Tesle implements Auto{
    String name;

    public Tesle(String name) {
         this.name = name;
    }

    double sebesseg;

    public Tesle(double sebesseg) {
        this.sebesseg = sebesseg;
    }



    public Tesle() {
        double kezdetiSebesseg = Math.random() * 60;

    }

    @Override
    public void gyorsul() {
    double randomGyorsul = ((Math.random() * 10)+5);
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
