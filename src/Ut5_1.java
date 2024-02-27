import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ut5_1 {
    public static void main(String[] args) {
        Random r= new Random();
        Set<Integer> primitiva = new TreeSet<>();
        int numeroRandom;
        for (int i=0;i<=7;i++){
            numeroRandom=r.nextInt(49)+1;
            primitiva.add(numeroRandom);
        }
        System.out.println("Apuesta: " + primitiva);
        System.out.printf("            ");
        for (int i =1;i<50;i++){
            if(primitiva.contains(i)){
                System.out.printf("XX  ");
            } else {
                System.out.printf("%d  ", i);
            }
            if(i==9||i==19||i==29||i==39){
                System.out.println();
            }
        }
    }
}
