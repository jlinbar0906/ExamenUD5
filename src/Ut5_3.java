
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.LinkedHashSet;
import  java.util.Scanner;
import java.util.Set;

public class Ut5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<LocalDate> almacen= new LinkedHashSet<>();

        String linea;

        do{
            linea= sc.nextLine();
            if(!linea.equalsIgnoreCase("FIN")){
                Producto p = new Producto(linea);
            }

        }while(linea.equalsIgnoreCase("FIN"));


    }
}
