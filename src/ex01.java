/*programa exemplo para calcular
 a media entre duas notas e imprimir a situação do alubo
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media;

        System.out.println("Digite a sua nota1");
        nota1 = sc.nextInt();
        System.out.println("Digite a sua nota2");
        nota2 = sc.nextInt();

        media = (nota1 + nota2) / 2;

        System.out.println("A sua media é : " + df.format(media));

        if(media >= 6){
            System.out.println("Você está aprovado");
        }
        if(media < 6 ){
            System.out.println("Você não está aprovado");
        }

    }
}
