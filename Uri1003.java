import java.util.Scanner;
public class Uri1003{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        int A, B, SOMA;

        A = entrada.nextInt();
        B = entrada.nextInt();
        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}