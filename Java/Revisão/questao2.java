package Java.Revisão;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Informe a idade completa da pessoa para que seja calculado seus dais de vida");
        System.out.print("Anos: ");
        int ano= in.nextInt();
        System.out.print("Meses: ");
        int mes= in.nextInt();
        System.out.print("Dias: ");
        int dia= in.nextInt();

        int vida= (ano*360)+(mes*30)+dia;

        System.out.println("Essa pessoa possui "+vida+" dias de vida");

    }

}
