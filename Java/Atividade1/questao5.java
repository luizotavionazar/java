package Java.Atividade1;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        voids metodo= new voids();
        metodo.spc();
        metodo.linha();
        System.out.println("INFORME AS IDADES QUE DESEJAR, DIGITE 0 PARA ENCERRAR");
        int idade, media=0, ii=0;
        do {
            idade= entrada.nextInt();
            if (idade>18) {
                media= media+idade;
                ii++;}
        } while (idade!=0);
        try {
            media= media/ii;
        } catch (Exception e) {
            metodo.spc();
            System.out.println("Nem quis tentar... que pena, até mais!");}
        if (media!=0) {
            metodo.spc();
            metodo.linha();
            metodo.spc();
            System.out.println("Resultado:");
            System.out.println("Pessoas com mais de 18 anos: "+ii);
            System.out.println("Idade média delas: "+media);}
        metodo.spc();
        metodo.linhad();
        entrada.close();}}