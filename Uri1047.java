import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int horaIni, minutoIni, horaFim, minutoFim, minutoTotalIni, minutoTotalFim, minutoDuracao, saidaHora, saidaMinuto;
        horaIni = teclado.nextInt();
        minutoIni = teclado.nextInt();
        horaFim = teclado.nextInt();
        minutoFim = teclado.nextInt();
        minutoTotalIni = 60 * horaIni + minutoIni;
        minutoTotalFim = 60 * horaFim + minutoFim;
        if (minutoTotalFim > minutoTotalIni){
            minutoDuracao = minutoTotalFim - minutoTotalIni;
        }
        else if (minutoTotalFim < minutoTotalIni){
            minutoDuracao = 1440 - minutoTotalIni + minutoTotalFim;
        }
        else {
            minutoDuracao = 1440;
        }
        saidaHora = minutoDuracao / 60;
        saidaMinuto = minutoDuracao % 60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", saidaHora, saidaMinuto);
    }
}