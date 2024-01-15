package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, horaTotal;

        System.out.println("Hora inicial:");
        horaInicial = sc.nextInt();

        System.out.println("Hora final:");
        horaFinal = sc.nextInt();

        //*if - Calculou a hora começando pela madrugada */ //*Else calculou o restante dos horarios */
        if (horaInicial < horaFinal){
            horaTotal = horaFinal - horaInicial;
        } else {
            horaTotal = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou por " + horaTotal + " Horas");

        sc.close();
    }
}
