package Java.Pizzaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Metodos func= new Metodos();

        boolean control1= true, control2= true; //Foi necessário criar a control2 para que ao selecionar que não deseja incluir outra pizza, não fosse pulada a pergunta se deseja bebida
        int pizza= 0;
        int opc= 3;

        func.spc();
        func.menu_pizza();
        func.spc();

        do { //Inicia o programa
            System.out.println("Deseja visualizar os ingredientes ou iniciar o pedido?");
            System.out.print("   [1]Ver Ingredientes | [0]Iniciar Pedido : ");
            try {
                opc= in.nextInt();
                func.spc();
                control1= true;
            } catch (InputMismatchException e) {
                func.spc();
                System.out.println("Informe um valor válido!");
                in.next();
                control1=false;}} while (!control1);
        while (opc!=0&&opc!=1) {
            if (control1) { //Necessário incluir o if para que não seja repetido o "Opção inválida" em seguida do "Informe um valor válido"
                System.out.println("                 Opção Inválida!");}
                System.out.print("   [1]Ver Ingredientes | [0]Iniciar Pedido : ");
            try {
                opc= in.nextInt();
                func.spc();
                control1= true;
            } catch (InputMismatchException e) {
                func.spc();
                System.out.println("              Informe um valor válido!");
                in.next();
                control1=false;}}
        if (opc==0) {
            control1= false;}

        while (control1) { //Visualização das Pizzas
            do {
                System.out.print("Código da Pizza: ");
                try {
                    pizza= in.nextInt();
                    control1= true;
                } catch (InputMismatchException e) {
                    func.spc();
                    System.out.println("Informe um valor válido!");
                    in.next();
                    control1=false;}} while (!control1);
            switch (pizza) {
                case 1:
                    func.linha();
                    System.out.println("Pizza.......: JAVA");
                    System.out.println("Valor.......: R$75,90");
                    System.out.println("Ingredientes: Mussarela, Chocolate Branco e Café Granulado");
                    func.linha();
                    func.spc();
                    do {
                        System.out.print("Visualizar outra Pizza? [1]Sim | [0]Iniciar Pedido ");
                        try {
                            opc= in.nextInt();
                            func.spc();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    while (opc!=0&&opc!=1) {
                        if (control1) { //Necessário incluir o if para que não seja repetido o "Opção inválida" em seguida do "Informe um valor válido"
                            System.out.println("Opção Inválida!");}
                            System.out.print("Visualizar outra Pizza? [1]Sim | [0]Iniciar Pedido ");
                        try {
                            opc= in.nextInt();
                            func.spc();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}}
                    break;
                case 2:
                    func.linha();
                    System.out.println("Pizza.......: C++");
                    System.out.println("Valor.......: R$88,15");
                    System.out.println("Ingredientes: Molho de Tomate, Mussarela, Calabresa, Cebola, Orégano e Muita Pimenta");
                    func.linha();
                    func.spc();
                    do {
                        System.out.print("Visualizar outra Pizza? [1]Sim | [0]Iniciar Pedido ");
                        try {
                            opc= in.nextInt();
                            func.spc();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    while (opc!=0&&opc!=1) {
                        if (control1) { //Necessário incluir o if para que não seja repetido o "Opção inválida" em seguida do "Informe um valor válido"
                            System.out.println("Opção Inválida!");}
                            System.out.print("Visualizar outra Pizza? [1]Sim | [0]Iniciar Pedido ");
                        try {
                            opc= in.nextInt();
                            func.spc();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}}
                    break;
                case 3:
                    func.linha();
                    System.out.println("Pizza.......: PYTHON");
                    System.out.println("Valor.......: R$79,90");
                    System.out.println("Ingredientes: Molho de Tomate Rústico, Mussarela, Carne de Cobra, Cebola e Orégano");
                    func.linha();
                    func.spc();
                    do {
                        System.out.print("Visualizar outra Pizza? [1]Sim | [0]Iniciar Pedido ");
                        try {
                            opc= in.nextInt();
                            func.spc();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    while (opc!=0&&opc!=1) {
                        if (control1) { //Necessário incluir o if para que não seja repetido o "Opção inválida" em seguida do "Informe um valor válido"
                            System.out.println("Opção Inválida!");}
                            System.out.print("Visualizar outra Pizza? [1]Sim | [0]Iniciar Pedido ");
                        try {
                            opc= in.nextInt();
                            func.spc();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}}
                    break;
                case 4:
                    func.linha();
                    System.out.println("Pizza.......: SQL");
                    System.out.println("Valor.......: R$90,87");
                    System.out.println("Ingredientes: Molho, Mussarela, Calabresa, Tomate, Pimentão, Cogumelos, Cebola e Orégano");
                    func.linha();
                    func.spc();
                    do {
                        System.out.print("Visualizar outra Pizza? [1]Sim | [0]Iniciar Pedido ");
                        try {
                            opc= in.nextInt();
                            func.spc();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    while (opc!=0&&opc!=1) {
                        if (control1) { //Necessário incluir o if para que não seja repetido o "Opção inválida" em seguida do "Informe um valor válido"
                            System.out.println("Opção Inválida!");}
                            System.out.print("Visualizar outra Pizza? [1]Sim | [0]Iniciar Pedido ");
                        try {
                            opc= in.nextInt();
                            func.spc();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}}
                    break;
                default:
                    func.spc();
                    System.out.println("Opção inválida!");
                    break;}
            if (opc==0) {
                control1= false;}}
        
        control1= true; //Selecionando as Pizzas do pedido
        int i= 0, j= 1, meia1[]= new int[10], meia2[]= new int[10], inteira[]= new int[10], qtd_p[]= new int[10];
        double valor_p[]= new double[10];
        while (control1) { 
            func.pontos();
            System.out.println("-----Item "+j);
            func.spc();
            System.out.print("Deseja a Pizza Inteira ou Meia? [0]Inteira | [1]Meia ");
            opc= in.nextInt();
            func.spc();
            while (opc!=0&&opc!=1) {
                System.out.println("Opção Inválida!");
                System.out.print("Deseja a Pizza Inteira ou Meia? [0]Inteira | [1]Meia ");
                opc= in.nextInt();
                func.spc();}
            if (opc==1) {
                do {
                    System.out.print("Informe o Código da Pizza da 1º metade: ");
                    meia1[i]= in.nextInt();
                    switch (meia1[i]) {
                        case 1:
                            valor_p[i]= 37.95;
                            control1= true;
                            break;
                        case 2:
                            valor_p[i]= 44.075;
                            control1= true;
                            break;
                        case 3:
                            valor_p[i]= 39.95;
                            control1= true;
                            break;
                        case 4:
                            valor_p[i]= 45.435;
                            control1= true;
                            break;   
                        default:
                            func.spc();
                            System.out.println("Opção Inválida!");
                            control1= false;
                            break;}} while (!control1);
                do {
                    System.out.print("Informe o Código da Pizza da 2º metade: ");
                    meia2[i]= in.nextInt();
                    switch (meia2[i]) {
                        case 1:
                            valor_p[i]= valor_p[i]+37.95;
                            control1= true;
                            break;
                        case 2:
                            valor_p[i]= valor_p[i]+44.075;
                            control1= true;
                            break;
                        case 3:
                            valor_p[i]= valor_p[i]+39.95;
                            control1= true;
                            break;
                        case 4:
                            valor_p[i]= valor_p[i]+45.435;
                            control1= true;
                            break;   
                        default:
                            func.spc();
                            System.out.println("Opção Inválida!");
                            control1= false;
                            break;}} while (!control1);
                do {
                    System.out.print("Quantidade: ");
                    try {
                        qtd_p[i]= in.nextInt();
                        control1= true;
                    } catch (InputMismatchException e) {
                        func.spc();
                        System.out.println("Informe um valor válido!");
                        in.next();
                        control1=false;}} while (!control1);}
                else if (opc==0){
                    do {
                        System.out.print("Informe o Código da Pizza desejada: ");
                        inteira[i]= in.nextInt();
                        switch (inteira[i]) {
                            case 1:
                                valor_p[i]= 75.90;
                                control1= true;
                                break;
                            case 2:
                                valor_p[i]= 88.15;
                                control1= true;
                                break;
                            case 3:
                                valor_p[i]= 79.90;
                                control1= true;
                                break;
                            case 4:
                                valor_p[i]= 90.87;
                                control1= true;
                            break;   
                            default:
                                System.out.println("Opção Inválida!");
                                func.spc();
                                control1= false;
                                break;}} while (!control1);
                do {
                    System.out.print("Quantidade: ");
                    try {
                        qtd_p[i]= in.nextInt();
                        control1= true;
                    } catch (InputMismatchException e) {
                        func.spc();
                        System.out.println("Informe um valor válido!");
                        in.next();
                        control1=false;}} while (!control1);}
            func.spc();
            func.linha();
            func.spc();
            System.out.print("Deseja selecionar outra Pizza? [1]Sim | [0]Não ");
            opc= in.nextInt();
            while (opc!=0&&opc!=1) {
                System.out.println("Opção Inválida!");
                System.out.print("Deseja selecionar outra Pizza? [1]Sim | [0]Não ");
                opc= in.nextInt();
                func.spc();}
            if (opc==0) {
                control1= false;
                control2= true;
                func.spc();
                func.linhad();
                func.spc();}
            i++; j++;}

        int bebida[]= new int[10], qtd_b[]= new int[10], valor_b[]= new int[10];

        while (control2) {
            System.out.print("Deseja incluir bebidas no seu pedido? [1]Sim | [0]Não "); //Incluir bebidas no pedido
            opc= in.nextInt();
            while (opc!=0|opc!=1) {
                System.out.println("Opção Inválida!");
                System.out.print("Deseja incluir bebidas no seu pedido? [1]Sim | [0]Não ");
                opc= in.nextInt();
                func.spc();}
            func.spc();
            if (opc==1) {
                control1= true;}
            
            func.menu_bebidas();
            
            while (control1) { // Selecionando as bebidas do pedido
                func.spc();
                func.linhad();
                System.out.println("-----Item "+j);
                func.spc();
                System.out.print("Informe o código da Bebida desejada: ");
                bebida[i]= in.nextInt();
                switch (bebida[i]) {
                    case 303:
                    do {
                        System.out.print("Quantidade: ");
                        try {
                            qtd_p[i]= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                        valor_b[i]= 5;
                        func.spc();
                        func.linha();
                        func.spc();
                        System.out.print("Deseja selecionar outra Bebida? [1]Sim | [0]Não ");
                        opc= in.nextInt();
                        break;
                    case 304:
                    do {
                        System.out.print("Quantidade: ");
                        try {
                            qtd_p[i]= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                        valor_b[i]= 10;
                        func.spc();
                        func.linha();
                        func.spc();
                        System.out.print("Deseja selecionar outra Bebida? [1]Sim | [0]Não ");
                        opc= in.nextInt();
                        break;
                    case 310:
                    do {
                        System.out.print("Quantidade: ");
                        try {
                            qtd_p[i]= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                        valor_b[i]= 12;
                        func.spc();
                        func.linha();
                        func.spc();
                        System.out.print("Deseja selecionar outra Bebida? [1]Sim | [0]Não ");
                        opc= in.nextInt();
                        break;
                    case 315:
                    do {
                        System.out.print("Quantidade: ");
                        try {
                            qtd_p[i]= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                        valor_b[i]= 12;
                        func.spc();
                        func.linha();
                        func.spc();
                        System.out.print("Deseja selecionar outra Bebida? [1]Sim | [0]Não ");
                        opc= in.nextInt();
                        break;
                    default:
                        func.spc();
                        func.linha();
                        System.out.println("Opção inválida!");
                        func.linha();
                        break;}
                if (opc==0) {
                    control1= false;
                    control2= false;
                    func.spc();
                    func.linhad();
                    func.spc();}
                i++; j++;}}
        
                double total= 0;
                for (int k = 0, l= 1; k < 10; k++, l++) {
                    func.linhad();
                    System.out.println("-----Item "+l);
                    func.spc();
                    System.out.println("Pizza: "+inteira[k]+" / "+meia1[k]+" / "+meia2[k]);
                    System.out.println("Valor: "+valor_p[k]);
                    System.out.println("Quantidade: "+qtd_p[k]);
                    func.spc();
                    System.out.println("Bebida: "+bebida[k]);
                    System.out.println("Valor: "+valor_b[k]);
                    System.out.println("Quantidade: "+qtd_b[k]);
                    func.spc();
                    total= total+((valor_p[k]*qtd_p[k])+(valor_b[k]*qtd_b[k]));}
                System.out.println("Valor Total: "+total);
                func.spc();
                    
    in.close();}}