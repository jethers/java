import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        double salario, rendaImposto;

        salario = teclado.nextDouble();
        rendaImposto = 0;
        if (salario > 4500.00){
            rendaImposto = rendaImposto + 0.28 * (salario - 4500.00);
            salario = 4500.00;
        }
        if (salario >= 3000.01 && salario <= 4500.00){
            rendaImposto = rendaImposto + 0.18 * (salario - 3000.01);
            salario = 3000.00;
        }
        if (salario >= 2000.01 && salario <= 3000.00){
            rendaImposto = rendaImposto + 0.08 * (salario - 2000.01);
            salario = 2000.00;
        }
        if (rendaImposto == 0){
            System.out.println("Isento");
        }
        else{
            System.out.printf("R$ %.2f\n", rendaImposto);
        }
    }
}