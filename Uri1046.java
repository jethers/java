import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int horaini, horafim, duracao;

        horaini = entrada.nextInt();
        horafim = entrada.nextInt();
        duracao = 0;
        if (horafim > horaini){
            duracao = horafim - horaini;
        }
        else if (horafim < horaini){
            duracao = 24 - horaini + horafim;
        }   
        else if (horafim == horaini){
            duracao = 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}