package Java.Atividade1;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        voids metodo= new voids();
        
        metodo.spc();
        System.out.println("==================MENU==================");
        System.out.println("|CÓDIGO|     DESCRIÇÃO     |   VALOR   |");
        System.out.println("|------+-------------------+-----------|");
        System.out.println("| -101 | CHÁS..............| R$  5,99  |");
        System.out.println("| -102 | CAFÉ CAPUCCINO....| R$ 15,99  |");
        System.out.println("| -105 | CHOCOLATE QUENTE..| R$ 20,99  |");
        System.out.println("| -200 | SALGADO...........| R$  7,99  |");
        System.out.println("========================================");
        metodo.spc();
        System.out.print("Deseja iniciar o pedido? s/n: ");
        char i= entrada.next().charAt(0);

        int ped= 0, cod, quant;
        String desc;
        double total;

        while (i!='n') {
            ped++;
            metodo.linhad();
            System.out.println("                PEDIDO Nº "+ped);
            boolean control= true;

            while (control) {
                metodo.spc();
                System.out.print("Informe o código do Item: ");
                cod= entrada.nextInt();

                if (cod==101|cod==102|cod==105|cod==200) {
                    control= false;
                    System.out.print("Quantidade: ");
                    quant= entrada.nextInt();

                    if (cod==101) {
                        total= quant*5.99;
                        desc= "CHÁS";}

                        else if (cod==102) {
                            total= quant*15.99;
                            desc= "CAFÉ CAPUCCINO";}

                        else if (cod==105){
                            total= quant*20.99;
                            desc= "CHOCOLATE QUENTE";}

                        else {
                            total= quant*7.99;
                            desc= "SALGADO";}

                    metodo.spc();
                    metodo.linha();
                    metodo.spc();
                    System.out.println("         TOTALIZAÇÃO PEDIDO Nº "+ped);
                    metodo.spc();
                    System.out.println("Item: "+cod+" - "+desc+" - "+quant+" unidades");
                    System.out.println("Valor Total:................... R$ "+total);
                    metodo.spc();
                    System.out.print("Deseja iniciar um novo pedido? s/n: ");
                    i= entrada.next().charAt(0);
                    metodo.spc();

                    if (i=='n') {
                        control= false;}}

                else {
                    metodo.spc();
                    System.out.println("Código Inválido, escolha novamente!");
                    control= true;}}}

        metodo.linha();
        metodo.spc();
        System.out.println("Até a próxima!");
        metodo.spc();
        metodo.linhad();
        entrada.close();}}