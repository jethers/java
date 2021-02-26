import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){

        Scanner entrada;
        entrada = new Scanner(System.in);

        int numero, horas;
        double valor, salario;

        numero = entrada.nextInt();
        horas = entrada.nextInt();
        valor = entrada.nextDouble();

        salario = horas * valor;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
    
}