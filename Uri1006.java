import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        double A, B, C, MEDIA, pesoA, pesoB, pesoC;
        pesoA = 2;
        pesoB = 3;
        pesoC = 5;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        MEDIA = (pesoA * A + pesoB * B + pesoC * C)/(pesoA + pesoB + pesoC);
        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }

}
