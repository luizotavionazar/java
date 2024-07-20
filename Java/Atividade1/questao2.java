package Java.Atividade1;

import java.util.Scanner;

public class questao2 {
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
        System.out.println("                         MÉDIA DE NÚMEROS INTEIROS DO LUIZ");
        metodo.linha();
        System.out.println("Informe quantos números inteiros quiser, encerre informando um número negativo.");
        System.out.println("Ao final, será realizada o cálculo da média desses valores.");
        metodo.spc();
        int i= 1, valor;
        System.out.print(i+"º valor: ");
        valor= entrada.nextInt();
        int soma= valor;
        while (valor>=0) {
            i++;
            System.out.print(i+"º valor: ");
            valor= entrada.nextInt();
            if (valor>=0){
                soma= soma+valor;}}
        i= i-1;
        float media= soma/i;
        metodo.linha();
        metodo.spc();
        System.out.println("Valor total: "+soma);
        System.out.println("Média total: "+media);
        metodo.linhad();
        metodo.spc();
        entrada.close();}}