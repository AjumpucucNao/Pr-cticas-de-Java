import java.util.Scanner;
/* 
La calificación final de un estudiante de informática 
se calcula con base a las calificaciones de cuatro
aspectos de su rendimiento académico: participación,
primer examen parcial, segundo examen parcial y examen
final. Sabiendo que las calificaciones anteriores
entrar a la calificación final con ponderaciones
10%, 25%, 25% y 40%. Hacer un programa que calcule
e imprima la calificación final obtenida por
un estudiante.
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    float participación, primer_examen, segundo_examen, examen_final, notaFinal;
    //pedir los datos necesarios
    System.out.println("Digite la nota de participación: ");
    participación = entrada.nextFloat();

    System.out.println("Digite la nota del primer examen parcial: ");
    primer_examen = entrada.nextFloat();

    System.out.println("Digite la nota del segundo examen parcial: ");
    segundo_examen = entrada.nextFloat();

    System.out.println("Digite la nota del examen final: ");
    examen_final = entrada.nextFloat();

//Sacar calculos
    participación = participación * 0.10f;
    primer_examen = primer_examen * 0.25f;
    segundo_examen = segundo_examen * 0.25f;
    examen_final = examen_final * 0.40f;
     //sumamos las calificaciones
    notaFinal = participación + primer_examen + segundo_examen + examen_final;
    System.out.println("La nota final es: " +notaFinal);

    }
    
}
