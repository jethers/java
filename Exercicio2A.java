import java.util.Scanner;

public class Exercicio2A{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        double lado, area;
        System.out.println("Area do quadrado\n");
        System.out.print("Digite o lado do quadrado: ");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.println("O quadrado de lado " + lado + " possui area " + area + ".");
    }
}