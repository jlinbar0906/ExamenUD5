import java.util.HashSet;
import java.util.Set;
import  java.util.Scanner;


public class Ut5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantPedidos, contPedidos;
        String pedInd;
        do {
        System.out.println("Cuantos productos se ha encontrado");
        cantPedidos= sc.nextInt();
        contPedidos=cantPedidos;
        sc.nextLine();
        if(cantPedidos>0) {
            if (cantPedidos > 150000) {
                System.out.println("No hay tantos productos");
            } else {
                Set<String> pedido= new HashSet<>();
                do {
                    System.out.println("Que producto se ha encontrado");
                    pedInd = sc.nextLine();

                    if (pedInd.length() > 20) {
                        System.out.println("No puede ser tan largo");
                    } else {
                        pedido.add(pedInd);
                    }
                    contPedidos--;
                } while (contPedidos != 0);
                System.out.println(pedido.size());
            }
        }
        }while(cantPedidos!=0);




    }
}
