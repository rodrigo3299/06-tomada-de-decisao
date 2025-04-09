/*programa exemplo para calcular
 a media entre duas notas e imprimir a situação do alubo
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double trabalho1,trabalho2,trabalho3;
        double prova1,prova2;
        double mediaFinal, mediaProva, mediaTrabalho;


        System.out.println("Digite a nota da prova1");
        prova1 = sc.nextInt();
        System.out.println("Digite a nota dq prova2");
        prova2 = sc.nextInt();
        System.out.println("Digite a nota do seu trabalho1");
        trabalho1 = sc.nextInt();
        System.out.println("Digite a nota do seu trabalho2");
        trabalho2 = sc.nextInt();
        System.out.println("Digite a nota do seu trabalho3");
        trabalho3 = sc.nextInt();

        mediaProva = (prova1 + prova2) / 2;
        mediaTrabalho = (trabalho1 + trabalho2 + trabalho3) / 3;
        mediaFinal = mediaProva * 0.7 + mediaTrabalho * 0.3;

        System.out.println("A sua media final é : " + df.format(mediaFinal));

        if(mediaFinal >= 6){
            System.out.println("Você está aprovado");
        }
        if(mediaFinal < 6 ){
            System.out.println("Você não está aprovado");
        }

    }
}

