import java.util.Scanner;

public class Exercicio2C{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Area do triangulo\n");
        System.out.println("Digite a base e a altura do triangulo:");
        System.out.print("Base: ");
        base = entrada.nextDouble();
        System.out.print("Altura: ");
        altura = entrada.nextDouble();
        area  = base * altura / 2;
        System.out.printf("O triangulo de base %.2f e altura %.2f possui area %.2f.\n", base, altura, area);
    }
}