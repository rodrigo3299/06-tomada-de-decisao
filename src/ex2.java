/*programa exemplo para calcular
 a media entre duas notas e imprimir a situação do alubo
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        double valorcp,desconto1,desconto2;

        System.out.println("Digite o valor da compra");
        valorcp = sc.nextInt();

        desconto1 = (valorcp - (valorcp *0.15));
        desconto2 = (valorcp - (valorcp *0.08));



        if(valorcp >= 1000){
            System.out.println("Valor final é "  +df.format(desconto1));
        }
        if(valorcp < 1000){
            System.out.println("Valor final é "  +df.format(desconto2));
        }

    }
}