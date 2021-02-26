import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int inteiros, contaPares;
        contaPares = 0;
        for (int contador=1; contador <= 5; contador++){
            inteiros = teclado.nextInt();
            if (inteiros % 2 == 0){
                contaPares++;
            }
        }
        System.out.printf("%d valores pares\n", contaPares);
    }
    
}