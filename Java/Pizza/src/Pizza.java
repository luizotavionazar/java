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

        System.out.println("Deseja visualizar os ingredientes ou iniciar o pedido?"); //Inicia o programa
        do {
            System.out.print("   [1]Ver Ingredientes | [0]Iniciar Pedido : ");
            try {
                opc= in.nextInt();
                func.spc();
                control1= true;
            } catch (InputMismatchException e) {
                func.spc();
                System.out.println("              Informe um valor válido!");
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
                        break;
                    case 2:
                        func.linha();
                        System.out.println("Pizza.......: C++");
                        System.out.println("Valor.......: R$88,15");
                        System.out.println("Ingredientes: Molho de Tomate, Mussarela, Calabresa, Cebola, Orégano e Muita Pimenta");
                        func.linha();
                        func.spc();
                        break;
                    case 3:
                        func.linha();
                        System.out.println("Pizza.......: PYTHON");
                        System.out.println("Valor.......: R$79,90");
                        System.out.println("Ingredientes: Molho de Tomate Rústico, Mussarela, Carne de Cobra, Cebola e Orégano");
                        func.linha();
                        func.spc();
                        break;
                    case 4:
                        func.linha();
                        System.out.println("Pizza.......: SQL");
                        System.out.println("Valor.......: R$90,87");
                        System.out.println("Ingredientes: Molho, Mussarela, Calabresa, Tomate, Pimentão, Cogumelos, Cebola e Orégano");
                        func.linha();
                        func.spc();
                        break;
                    case 5:
                        func.linha();
                        System.out.println("Pizza.......: FRANGO");
                        System.out.println("Valor.......: R$17,90");
                        System.out.println("Ingredientes: Massa de Frango com Catupiry");
                        func.linha();
                        func.spc();
                        break;
                    default:
                        func.spc();
                        System.out.println("Opção inválida!");
                        control1= false;
                        break;}} while (!control1);
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
            if (opc==0) {
                control1= false;}}
        
        control1= true; 
        int i= 0, j= 1, meia1[]= new int[10], meia2[]= new int[10], inteira[]= new int[10], qtd_p[]= new int[10];
        String desc_p[]= new String[10], desc_p1[]= new String[10], desc_p2[]= new String[10];
        double valor_p[]= new double[10];
        while (control1&&j<=10) { //Selecionando as Pizzas do pedido
            func.pontos();
            System.out.println("-----Item "+j);
            func.spc();
            do {
                System.out.print("Deseja a Pizza Inteira ou Meia? [0]Inteira | [1]Meia ");
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
                System.out.println("Opção Inválida!");
                do {
                    System.out.print("Deseja a Pizza Inteira ou Meia? [0]Inteira | [1]Meia ");
                    try {
                        opc= in.nextInt();
                        func.spc();
                        control1= true;
                    } catch (InputMismatchException e) {
                        func.spc();
                        System.out.println("Informe um valor válido!");
                        in.next();
                        control1=false;}} while (!control1);}
            
            
            if (opc==0){ // Pizza Inteira
                do {
                    do {
                        System.out.print("Informe o Código da Pizza desejada: ");
                        try {
                            inteira[i]= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    switch (inteira[i]) { // Atribuição de valores
                        case 1:
                            desc_p[i]= "JAVA                        ";
                            valor_p[i]= 75.90;
                            control1= true;
                            break;
                        case 2:
                            desc_p[i]= "C++                         ";
                            valor_p[i]= 88.15;
                            control1= true;
                            break;
                        case 3:
                            desc_p[i]= "PYTHON                      ";
                            valor_p[i]= 79.90;
                            control1= true;
                            break;
                        case 4:
                            desc_p[i]= "SQL                         ";
                            valor_p[i]= 90.87;
                            control1= true;
                        case 5:
                            desc_p[i]= "FRANGO                      ";
                            valor_p[i]= 17.90;
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

            else { //Pizza Meia
                do {
                    do {
                        System.out.print("Informe o Código da Pizza da 1º metade: ");
                        try {
                            meia1[i]= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    switch (meia1[i]) { // Atribuição de valores
                        case 1:
                            desc_p1[i]= "*MEIA JAVA                  ";
                            valor_p[i]= 37.95;
                            control1= true;
                            break;
                        case 2:
                            desc_p1[i]= "*MEIA C++                   ";
                            valor_p[i]= 44.075;
                            control1= true;
                            break;
                        case 3:
                            desc_p1[i]= "*MEIA PYTHON                ";
                            valor_p[i]= 39.95;
                            control1= true;
                            break;
                        case 4:
                            desc_p1[i]= "*MEIA SQL                   ";
                            valor_p[i]= 45.435;
                            control1= true;
                            break;   
                        case 5:
                            desc_p1[i]= "*MEIA FRANGO                ";
                            valor_p[i]= 8.95;
                            control1= true;
                            break;   
                        default:
                            func.spc();
                            System.out.println("Opção Inválida!");
                            control1= false;
                            break;}} while (!control1);
                do {
                    do {
                        System.out.print("Informe o Código da Pizza da 2º metade: ");
                        try {
                            meia2[i]= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    switch (meia2[i]) { // Atribuição de valores
                        case 1:
                            desc_p2[i]= " MEIA JAVA                  ";
                            valor_p[i]= valor_p[i]+37.95;
                            control1= true;
                            break;
                        case 2:
                            desc_p2[i]= " MEIA C++                   ";
                            valor_p[i]= valor_p[i]+44.075;
                            control1= true;
                            break;
                        case 3:
                            desc_p2[i]= " MEIA PYTHON                ";
                            valor_p[i]= valor_p[i]+39.95;
                            control1= true;
                            break;
                        case 4:
                            desc_p2[i]= " MEIA SQL                   ";
                            valor_p[i]= valor_p[i]+45.435;
                            control1= true;
                            break;   
                        case 5:
                            desc_p2[i]= " MEIA FRANGO                ";
                            valor_p[i]= 8.95;
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
                
            func.spc();
            func.linha();
            func.spc();
            do {    //Avanço de Item - Selecionar outra pizza
                if (j<=9) {
                    System.out.print("Deseja selecionar outra Pizza? [1]Sim | [0]Não ");
                try {
                    opc= in.nextInt();
                    control1= true;
                } catch (InputMismatchException e) {
                    func.spc();
                    System.out.println("Informe um valor válido!");
                    in.next();
                    control1=false;}}} while (!control1);
            while (opc!=0&&opc!=1) {
                func.spc();
                System.out.println("Opção Inválida!");
                do {
                    System.out.print("Deseja selecionar outra Pizza? [1]Sim | [0]Não ");
                    try {
                        opc= in.nextInt();
                        control1= true;
                    } catch (InputMismatchException e) {
                        func.spc();
                        System.out.println("Informe um valor válido!");
                        in.next();
                        control1=false;}} while (!control1);}
            if (opc==0) {
                control1= false;
                func.spc();
                func.linhad();}
            i++; j++;
            if (j==11) {
                System.out.println("Quantidade máxima de itens atingida! Prosseguindo para a Totalização");}
            func.spc();}

        int bebida[]= new int[10], qtd_b[]= new int[10], valor_b[]= new int[10];
        String desc_b[]= new String[10];
        while (control2&&j<=10) { //Avanço de item - Incluir bebidas
            do {
                System.out.print("Deseja incluir bebidas no seu pedido? [1]Sim | [0]Não "); 
                try {
                    opc= in.nextInt();
                    control2= true;
                } catch (InputMismatchException e) {
                    func.spc();
                    System.out.println("Informe um valor válido!");
                    in.next();
                    control2=false;}} while (!control2);
            while (opc!=0&&opc!=1) {
                func.spc();
                System.out.println("Opção Inválida!");
                do {
                    System.out.print("Deseja incluir bebidas no seu pedido? [1]Sim | [0]Não ");
                    try {
                        opc= in.nextInt();
                        control2= true;
                    } catch (InputMismatchException e) {
                        func.spc();
                        System.out.println("Informe um valor válido!");
                        in.next();
                        control2=false;}} while (!control2);}
            func.spc();
            if (opc==0) {
                control1= false;
                control2= false;}
            else {
                control1= true;
                control2= false;
                func.menu_bebidas();}}
            
            while (control1&&j<=10) { // Selecionando as bebidas do pedido
                func.pontos();
                System.out.println("-----Item "+j);
                func.spc();
                do {
                    do {
                        System.out.print("Informe o código da Bebida desejada: ");
                        try {
                            bebida[i]= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    switch (bebida[i]) {
                        case 303:
                        desc_b[i]= "ÁGUA                        ";
                        do {
                            System.out.print("Quantidade: ");
                            try {
                                qtd_b[i]= in.nextInt();
                                control1= true;
                            } catch (InputMismatchException e) {
                                func.spc();
                                System.out.println("Informe um valor válido!");
                                in.next();
                                control1=false;}} while (!control1);
                            valor_b[i]= 5;
                            break;
                        case 304:
                        desc_b[i]= "SUCO DE LARANJA             ";
                        do {
                            System.out.print("Quantidade: ");
                            try {
                                qtd_b[i]= in.nextInt();
                                control1= true;
                            } catch (InputMismatchException e) {
                                func.spc();
                                System.out.println("Informe um valor válido!");
                                in.next();
                                control1=false;}} while (!control1);
                            valor_b[i]= 10;
                            break;
                        case 310:
                        desc_b[i]= "REFRIGERANTE NORMAL         ";
                        do {
                            System.out.print("Quantidade: ");
                            try {
                                qtd_b[i]= in.nextInt();
                                control1= true;
                            } catch (InputMismatchException e) {
                                func.spc();
                                System.out.println("Informe um valor válido!");
                                in.next();
                                control1=false;}} while (!control1);
                            valor_b[i]= 12;
                            break;
                        case 315:
                        desc_b[i]= "REFRIGERANTE ZERO AÇUCAR    ";
                        do {
                            System.out.print("Quantidade: ");
                            try {
                                qtd_b[i]= in.nextInt();
                                control1= true;
                            } catch (InputMismatchException e) {
                                func.spc();
                                System.out.println("Informe um valor válido!");
                                in.next();
                                control1=false;}} while (!control1);
                            valor_b[i]= 12;
                            break;
                        default:
                            func.spc();
                            System.out.println("Opção Inválida!");
                            control1= false;
                            break;}} while (!control1);

                func.spc();
                func.linha();
                func.spc();
                do {    //Avanço de Item - Selecionar outra bebida
                    if (j<=9) {
                        System.out.print("Deseja selecionar outra Bebida? [1]Sim | [0]Não ");
                        try {
                            opc= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}}} while (!control1);
                while (opc!=0&&opc!=1) {
                    func.spc();
                    System.out.println("Opção Inválida!");
                    do {
                        System.out.print("Deseja selecionar outra Bebida? [1]Sim | [0]Não ");
                        try {
                            opc= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);}
                if (opc==0) {
                    control1= false;
                    control2= false;
                    func.spc();
                    func.linhad();
                    func.spc();}
                i++; j++;
                if (j==11) {
                    System.out.println("Quantidade máxima de itens atingida! Prosseguindo para a finalização do pedido...");}
                    else {
                        System.out.println("Prosseguindo para a finalização do pedido...");}
                func.spc();}

            String rua= null, bairro= null, nome= null;
            int num= 0;
            float metros= 0;
            func.pontos();
            System.out.println("ENDEREÇO DE ENTREGA"); //Entrega do pedido
            func.spc();
            do {
                in.nextLine();
                System.out.print("Seu nome: ");
                nome= in.nextLine(); 
                System.out.print("Bairro..: ");
                bairro= in.nextLine();
                System.out.print("Rua.....: ");
                rua= in.nextLine();
                System.out.print("Número..: ");
                num= in.nextInt(); in.nextLine();
                System.out.print("Distância até a Pizzaria(Metros): ");
                try {
                    metros= in.nextFloat(); in.nextLine();
                    func.spc();
                    control1= true;
                } catch (InputMismatchException e) {
                    func.spc();
                    System.out.println("Informe um valor válido!");
                    control1=false;}} while (!control1);

            int valor_frete= 0, tempo_entrega= 0;   //Atribui valor do Frete e Tempo de Entrega
            if (metros<1000){
                tempo_entrega= 40;}
                else if (metros>1000&&metros<=5000) {
                valor_frete= 5;
                tempo_entrega= 50;}
                else if (metros>5000){
                    valor_frete= 10;
                    tempo_entrega= 65;}
            
            double total= 0;    //Totalização do pedido
            String form_pag= null;
            func.pontos();
            System.out.println("TOTALIZAÇÃO DO PEDIDO");
            func.spc();
            System.out.println(" QTD | ITEM                        | VALOR ");
            System.out.println("===============================================");
            for (int k = 0; k < 10; k++) {
                if (inteira[k]!=0||meia1[k]!=0) {
                    if (inteira[k]!=0) {
                        System.out.println("  "+qtd_p[k]+"x | "+desc_p[k]+"| R$ "+valor_p[k]);}
                        else {
                            System.out.println("  "+qtd_p[k]+"x | "+desc_p1[k]+"| R$ "+valor_p[k]);
                            System.out.println("     | "+desc_p2[k]+"|");}}
                total= total+((valor_p[k]*qtd_p[k])+(valor_b[k]*qtd_b[k]));}
            for (int k = 0; k < 10; k++) {
                if (bebida[k]!=0){
                    System.out.println("  "+qtd_b[k]+"x | "+desc_b[k]+"| R$ "+valor_b[k]);}}
            System.out.println("     | TAXA DE ENTREGA             | R$ "+valor_frete);
            System.out.println("===============================================");
            total= total+valor_frete;
            System.out.println(" VALOR TOTAL.......................: R$ "+total);
            System.out.println("===============================================");
            func.spc();
            System.out.println("Formas de Pagamento disponíveis:");
            System.out.println("[0] Cartão de Crédito\n[1] Pix\n[2] Vale Refeição");
            func.spc();
            System.out.print("Qual será a Forma de Pagamento? ");
            do {   
                try {
                    opc= in.nextInt();
                    control1= true;
                } catch (InputMismatchException e) {
                    func.spc();
                    System.out.println("Informe um valor válido!");
                    in.next();
                    control1=false;}} while (!control1);
            switch (opc) {
                case 0:
                    form_pag= "Cartão de Crédito";
                    break;
                case 1:
                    form_pag= "Pix";
                    break;
                case 2:
                    form_pag= "Vale Refeição";
                    break;
                default:
                    func.spc();
                    System.out.println("Opção Inválida!");
                    do {
                        System.out.print("Qual será a Forma de Pagamento? ");
                        try {
                            opc= in.nextInt();
                            control1= true;
                        } catch (InputMismatchException e) {
                            func.spc();
                            System.out.println("Informe um valor válido!");
                            in.next();
                            control1=false;}} while (!control1);
                    break;}
            
            func.spc();
            func.pontos();
            func.spc(); //Finalização do pedido
            System.out.println("Obrigado "+nome+", pedido realizado com sucesso!");
            func.spc();
            System.out.println("Endereço de Entrega: Rua "+rua+", "+num+", "+bairro);
            System.out.println("Pagamento realizado por "+form_pag);
            System.out.println("Estimativa de entrega: "+tempo_entrega+" minutos");
            func.spc();
            System.out.println("Volte Sempre =)");
            func.spc();
            func.pontos();
    in.close();}}