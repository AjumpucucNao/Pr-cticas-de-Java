import java.util.Scanner;
/* Guillermo tiene N dólares. Luis tiene la 
mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad
de dinero que tienen entre los 3.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    float guillermo, luis, juan, total;
    System.out.println("Digite la cantidad de dinero que tiene Guillermo");
    guillermo = entrada.nextFloat();

    luis = guillermo/2;
    juan = (guillermo + luis) /2;
    total = guillermo + luis + juan;

    System.out.println("La cantidad de dinero que tienen los 3 es " + total);


    }
    
}
