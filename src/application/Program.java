package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] notas = new Double[4];
        for (int i = 0; i < 4; i++){
            System.out.print("Informe a nota "+ (i+1) + " de 4: ");
            notas[i] = sc.nextDouble();
        }
        Double sum = 0.0;
        for (Double i : notas) {
            sum += i;
        }
        Double average = sum/notas.length;
        System.out.println("Média: " + average);
        System.out.print("Condição: ");
        if (average >= 7.0) {
            System.out.println("aprovado!");
        } else if (average >= 5.0) {
            System.out.println("em recuperação!");
        } else {
            System.out.println("reprovado!");
        }
        sc.close();
    }
}
