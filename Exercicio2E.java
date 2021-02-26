import java.util.Scanner;

public class Exercicio2E{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        double baseMenor, baseMaior, altura, area;
        System.out.println("Área do trapezio\n");
        System.out.println("Digite a base maior, a base menor e a altura do trapezio:");
        System.out.print("Base menor:");
        baseMenor = entrada.nextDouble();
        System.out.print("Base maior:");
        baseMaior = entrada.nextDouble();
        System.out.print("Altura:");
        altura = entrada.nextDouble();
        area  = (baseMenor + baseMaior) * altura / 2;
        System.out.printf("O trapezio de base menor %.2f, base maior %.2f e altura %.2f possui area %.2f.", baseMenor, baseMaior, altura, area);
    }
}