import java.util.Scanner;

public class Math_método {
    public static void main(String[] args) {
        //Método sqrt de Math, raíz cuadrada
        int raiz = (int)Math.sqrt(37);

/*Debe ser double, pero puedes 
hacer la conversión al tipo de dato que se desée
normal: 
double raiz = Math sqrt (9);
Es mejor dejarlo en double, a menos
que saques raíces exactas siempre
*/
    System.out.println(raiz);

    //Método pow de Math, para elevar un número a una potencia
    double base = 5, exponente = 2;
    double resultado = Math.pow(base, exponente);
    //Primero base y luego exponente
    System.out.println(resultado);

    //Método round de Math
    float numero = 4.56f;
    long redondeado = Math.round(numero);
    /*Nota: si quieres pasar un double
    como parámetro, debes tener un valor
    de tipo long (número entero) */
    System.out.println(redondeado);

    //Método random de Math, números aleatorios

    double num = Math.random();
    System.out.println(num);
    }
    
}
