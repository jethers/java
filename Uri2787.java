import java.util.Scanner;
public static  
public class Uri2787{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int L, C;

        L = teclado.nextInt();
        C = teclado.nextInt();

        if (L % 2 != 0 && C % 2 != 0){
            System.out.println(1);
        }
        else if (L % 2 == 0 && C % 2 == 0){
            System.out.println(1);
        }
        else if (L % 2 != 0 && C % 2 == 0){
            System.out.println(0);
        }
        else if (L % 2 == 0 && C % 2 != 0){
            System.out.println(0);
        }
        //Linhas �mpares e colunas �mpares: brancas (1)
        //Linhas pares e colunas pares: brancas (1)
        //Linhas �mpares e colunas pares: pretas (0)
        //Linhas pares e colunas �mpares: pretas (0)
    }
}