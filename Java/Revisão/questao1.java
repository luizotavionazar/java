package Java.Revisão;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
    
        System.out.println("Informe a idade da pessoa para que seja definida sua categoria");
        System.out.print("Idade: ");

        int idade= entrada.nextInt();
        String categ= null;

        if (idade < 13) {
            categ= "CRIANÇA";}
            else if (idade <= 17) {
                categ= "ADOLESCENTE";}
            else if (idade <= 64) {
                categ= "ADULTO";}
            else if (idade > 65) {
                categ= "IDOSO";}
    
        System.out.println("Essa pessoa é "+categ);
    
    entrada.close();}}