import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        for (int contador = 1; contador <= N; contador++){
            System.out.printf("%d %d %d\n", contador, contador * contador, contador * contador * contador);                
        }
    }
}