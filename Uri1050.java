import java.util.Scanner;

public class Uri1050{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        int entradaInt;
        
        entradaInt = entrada.nextInt();

        if (entradaInt == 61){
            System.out.println("Brasilia");
        }
        else if (entradaInt == 71){
            System.out.println("Salvador");
        }
        else if (entradaInt == 11){
            System.out.println("Sao Paulo");
        }
        else if (entradaInt == 21){
            System.out.println("Rio de Janeiro");
        }
        else if (entradaInt == 32){
            System.out.println("Juiz de Fora");
        }
        else if (entradaInt == 19){
            System.out.println("Campinas");
        }
        else if (entradaInt == 27){
            System.out.println("Vitoria");
        }
        else if (entradaInt == 31){
            System.out.println("Belo Horizonte");
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
    }
}