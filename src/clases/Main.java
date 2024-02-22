

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Stack<?> stack = null;
        List<?> lista = null;
        while (true) {
        	
            System.out.println("Bienvenido a la calculadora de postfix");
            System.out.println("Por favor seleccione una opcion");
            System.out.println("1. Para el uso de una lista simple");
            System.out.println("2. Para lista doblemente enlazada");
            System.out.println("3. Para el uso de un vector");
            System.out.println("4. Para el uso de un ArrayList");
            System.out.println("5. Para salir");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2) {
                lista = DataStructureFactory.getList(opcion);
                Calculadora.leerYCalcular("datos.txt");
              
            }
            else if (opcion == 3 || opcion == 4) {
                stack = DataStructureFactory.getStack(opcion);
                Calculadora.leerYCalcular("datos.txt");
            }
            else if (opcion == 5) {
                System.out.println("Gracias por usar la calculadora");
                break;
            }
            else {
                System.out.println("Opcion no valida");
                continue;
                
               
            }
        }

    }
}
