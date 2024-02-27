import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Ut5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> edad1 = new ArrayList<>();
        int edad;
        int cont = 0;
        int contMayor = 0;
        int contMenor = 0;
        float edadTotal = 0;
        do {
            System.out.println("Introduzca una edad");
            edad = sc.nextInt();
            if (edad > 0) {
                edad1.add(edad);
                cont++;
                edadTotal += edad;
            }
        } while (edad > 0);

        edadTotal /= cont;



        ListIterator<Integer> iterator = edad1.listIterator();

        while (iterator.hasNext()) {
            Integer edad3 = iterator.next();
            if (edad3 > edadTotal) {
                contMayor++;
            } else if (edad3<edadTotal) {
                contMenor++;
            }
        }

        System.out.println("La edad media es " + edadTotal);
        System.out.println("Hay " + contMayor + " por encima de la media.");
        System.out.println("Hay " + contMenor + " por debajo de la media.");

    }
}
