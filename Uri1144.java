import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int contador = 1;
        while (contador <= N){
            System.out.printf("%d %d %d\n", contador, contador * contador, contador * contador * contador);
            System.out.printf("%d %d %d\n", contador, (contador * contador) + 1, contador * ((contador * contador) + 1) - (contador - 1));            
            contador++;
        }
    }
}