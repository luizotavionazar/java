package Java.Atividade1;

import java.util.Scanner;

public class questao1 {
    public void linha() {
        System.out.println("------------------------------------------------------------------------------------");}

    public void linhad() {
        System.out.println("====================================================================================");}

    public void spc() {
        System.out.println("");}

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        questao1 metodo= new questao1();
        metodo.spc();
        metodo.linhad();
        System.out.println("                             ADIVINHADOR DE NÚMERO DO LUIZ");
        metodo.linha();
        System.out.println("Acerte o número, ele está entre 1 e 100, você terá inumeras chances para acertar!");
        metodo.spc();
        int i= 1;
        System.out.print(i+"º tentativa: ");
        int escolha= entrada.nextInt();
        if (i==1&&escolha==34){
            metodo.spc();
            metodo.linha();
            metodo.spc();
            System.out.println("Parabéns, acertou de primeira!");
            metodo.spc();}
        while (escolha!=34) {
            if (escolha<34) {
                if (i==1){
                    metodo.spc();}
                System.out.println("Errou, o número é maior que "+escolha);}
                if (escolha>=0&&escolha<=20) {
                    System.out.println("Nem tão perto, tente novamente...");
                    metodo.spc();}
                else if (escolha>20&&escolha<=33) {
                    System.out.println("Ta bem perto, tente novamente...");
                    metodo.spc();}
            if (escolha>34) {
                if (i==1){
                    metodo.spc();}
                System.out.println("Errou, o número é menor que "+escolha);}
                if (escolha>=35&&escolha<=50) {
                    System.out.println("Ta quase, tente novamente...");
                    metodo.spc();}
                else if (escolha>=51&&escolha<=70) {
                    System.out.println("Nem perto, tente novamente...");
                    metodo.spc();}
                else if (escolha>=71&&escolha<=90) {
                    System.out.println("Ta longe, tente novamente...");
                    metodo.spc();}
                else if (escolha>=91&&escolha<=100) {
                    System.out.println("Passou dos limites, tente novamente...");
                    metodo.spc();}
            i++;
            System.out.print(i+"º tentativa: ");
            escolha= entrada.nextInt();
            metodo.spc();
            if (escolha==34){
                metodo.linha();
                metodo.spc();
                System.out.println("Acertou, parabéns!");
                metodo.spc();}}
        metodo.linhad();
        entrada.close();}}