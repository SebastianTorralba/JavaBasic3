package ar.edu.unlar.paradigmas1.objetos;

public class Rectangulo extends Forma implements ICalculo {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return this.base * this.altura;
    }

}
