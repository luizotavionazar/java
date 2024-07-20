package Java.Atividade1;

import java.util.Scanner;

public class questao3 {
    public void linha() {
        System.out.println("-----------------------------------");}

    public void linhad() {
        System.out.println("===================================");}

    public void spc() {
        System.out.println("");}
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        questao1 metodo= new questao1();
        metodo.spc();
        metodo.linhad();
        System.out.println("VALORES ÍMPARES ENTRE 100 E 200");
        metodo.linha();
        metodo.spc();
        for (int i=100; i<=200; i++){
            if (i%2!=0){
                System.out.println(i);}}
        metodo.spc();
        metodo.linhad();
        metodo.spc();
        entrada.close();}}