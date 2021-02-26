import java.util.Scanner;

public class Uri2780{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int pontos = 0;
        int D = entrada.nextInt();

        if (D <= 800){
            pontos = 1;
        }
        else if (D > 800 && D <= 1400){
            pontos = 2;            
        }
        else if (D > 1400 && D <= 2000){
            pontos = 3;            
        }
        System.out.println(pontos);
    }

}