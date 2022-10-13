package ar.edu.unlar.paradigmas1.objetos;

public class Circulo extends Forma implements ICalculo {
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float) Math.PI * this.radio;
    }

}
