import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        int numero, numPares = 0, numImpares = 0, numPos = 0, numNeg = 0;
        
        for (int contador=1; contador <= 5; contador++){
            numero = entrada.nextInt();
            if (numero % 2 == 0){
                numPares++;
            }
            else{
                numImpares++;
            }
            if (numero > 0){
                numPos++;
            }
            else if (numero < 0){
                numNeg++;
            }            
        }
        System.out.printf("%d valor(es) par(es)\n", numPares);
        System.out.printf("%d valor(es) impar(es)\n", numImpares);
        System.out.printf("%d valor(es) positivo(s)\n", numPos);
        System.out.printf("%d valor(es) negativo(s)\n", numNeg);                        
    }
    
}
