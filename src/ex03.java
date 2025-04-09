/*programa exemplo para calcular
 a media entre duas notas e imprimir a situação do alubo
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex03{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double trabalho1,trabalho2,trabalho3,prova1,prova2,media;


        System.out.println("Digite a nota do seu trabalho1");
        trabalho1 = sc.nextInt();
        System.out.println("Digite a nota do seu trabalho2");
        trabalho2 = sc.nextInt();
        System.out.println("Digite a nota do seu trabalho3");
        trabalho3 = sc.nextInt();
        System.out.println("Digite a sua nota da prova1");
        prova1 = sc.nextInt();
        System.out.println("Digite a sua nota da prova2");
        prova2 = sc.nextInt();


        media = ((prova1 + prova2)*0.7) /2 + ((trabalho1 + trabalho2 + trabalho3)*0.3) / 3;

        System.out.println("A sua media é : " + df.format(media));

        if(media >= 6){
            System.out.println("Você está aprovado");
        }
        if(media < 6 ){
            System.out.println("Você não está aprovado");
        }

    }
}

