/*programa exemplo para calcular
 a media entre duas notas e imprimir a situação do alubo
 */


import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double x, y;

        System.out.println("Informe o valor de x :");
        x = sc.nextDouble();
        if( x > 5 || x < -5) {
            y = 8 / Math.sqrt(x*x - 25);
            System.out.println("y = " +y);
        }
        else{
            System.out.println("Valor invalido para x  ");
        }



    }
}

