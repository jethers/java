import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        int segundosInt, horas, minutos, segundos, horasResto, minutosResto;

        segundosInt = entrada.nextInt();

        horas = segundosInt / 3600;
        horasResto = segundosInt % 3600;

        minutos = horasResto / 60;
        minutosResto = horasResto % 60;

        segundos = minutosResto;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}    