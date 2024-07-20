package Java.Revisão;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Informe um número para que seja exibida sua tabuada");
        System.out.print("Número: ");
        int num1= 0, resul= 0;
        num1= in.nextInt();

        for (int i = 1; i < 11; i++) {
            resul= num1*i;
            System.out.println(num1+"*"+i+": "+resul);}
        }
    }