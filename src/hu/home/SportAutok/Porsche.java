package hu.home.SportAutok;

public class Porsche implements Auto{
    String name;

    public Porsche(String name) {
        this.name = name;
    }

    double sebesseg;
    double kezdetiSebesseg;

    public Porsche(double sebesseg) {
        this.kezdetiSebesseg = sebesseg;
    }

    @Override
    public void gyorsul() {
    this.kezdetiSebesseg = kezdetiSebesseg+10;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }

}
