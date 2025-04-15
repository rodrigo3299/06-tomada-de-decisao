import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1,lado2,lado3;

        System.out.print("Digite o valor de lado1 :");
        lado1 = sc.nextDouble();
        System.out.print("Digite o valor de lado2 :");
        lado2 = sc.nextDouble();
        System.out.print("Digite o valor de lado3 :");
        lado3 = sc.nextInt();

        // condição para ser um triangulo
        if( lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado3)
        {
            System.out.println("Os valores formam um trinagulo");
        }
        else{
            System.out.println("Os valores não formam um trinagulo");
        }
        if( lado1 > lado2 + lado3 && lado2 > lado1 + lado3 && lado3 > lado1 + lado3)
        {
            System.out.println("Os valores não formam um trinagulo");
        }
        else{
            System.out.println("Os valores formam um trinagulo");
        }




    }
}
