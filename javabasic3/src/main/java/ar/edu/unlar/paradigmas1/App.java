package ar.edu.unlar.paradigmas1;

import java.util.ArrayList;

import ar.edu.unlar.paradigmas1.objetos.Circulo;
import ar.edu.unlar.paradigmas1.objetos.ICalculo;
import ar.edu.unlar.paradigmas1.objetos.Rectangulo;
import ar.edu.unlar.paradigmas1.objetos.Triangulo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ArrayList<ICalculo> formas = new ArrayList<>();
        formas.add(new Rectangulo(2, 4));
        formas.add(new Circulo(4));
        formas.add(new Triangulo(3, 3));
        // for each
        for (ICalculo a : formas) {
            System.out.println(a.getClass().getSimpleName());
            System.out.println(a.calcularArea());
        }
        // for con if por cada clase
        for (int i = 0; i < formas.size(); i++) {
            if (formas.get(i) instanceof Rectangulo) {
                System.out.println("RECTANGULO:");
                Rectangulo r = (Rectangulo) formas.get(i);
                System.out.println(r.calcularArea());

            }
            if (formas.get(i) instanceof Circulo) {
                System.out.println("CIRCULO");
                Circulo c = (Circulo) formas.get(i);
                System.out.println(c.calcularArea());
            }
        }

    }
}
