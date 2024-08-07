import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    // Códigos ANSI para cores
    public static final String RESET = "\033[0m";      // Reseta a cor
    public static final String RED = "\033[0;31m";     // Vermelho
    public static final String GREEN = "\033[0;32m";   // Verde
    public static final String YELLOW = "\033[0;33m";  // Amarelo

    public void menu_opcoes(){
        System.out.println("─────────────────────────────────────────────────────────");
        System.out.println("       > MENU DE OPÇÕES - AGENDA DE COMPROMISSOS <       ");
        System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
        System.out.println("       >[1] Adicionar        >[4] Remover                ");
        System.out.println("       >[2] Visualizar       >[5] Alterar                ");
        System.out.println("       >[3] Pesquisar        >[6] Sair                   ");
        System.out.println("«««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
        System.out.println(" ");}

    public int adicionar_compromisso(Scanner in, App func, ArrayList<String>compromissos, ArrayList<String>datas, boolean control1, String compromisso, int qtd_comp){
        boolean control2= true;
        int dia= 0, mes= 0, ano= 0;
        System.out.println(" ");
        System.out.println("├─────────────────INSERINDO COMPROMISSO─────────────────┤");
        System.out.println("        Digite 'sair' para encerrar o preenchimento      ");
        System.out.println(" ");
        while (control1) {  
            System.out.print(" > Descrição: ");
            compromisso= in.nextLine();
            if (compromisso.equals("sair")) {
                control1= false;
                break;}
            compromissos.add(compromisso);
            do {
                System.out.print("       > Dia: ");
                dia= in.nextInt(); in.nextLine();
                control2= true;
                if (dia<1||dia>31) {
                    System.out.println(" ");
                    System.out.println("Dia inválido!");
                    System.out.println(" ");
                    control2= false;}} while (!control2);
            do {
                System.out.print("       > Mês: ");
                mes= in.nextInt(); in.nextLine();
                control2= true;
                if (mes<1||mes>12) {
                    System.out.println(" ");
                    System.out.println("Mês inválido!");
                    System.out.println(" ");
                    control2= false;}} while (!control2);
            do {
                System.out.print("       > Ano: ");
                ano= in.nextInt(); in.nextLine();
                control2= true;
                if (ano<2024) {
                    System.out.println(" ");
                    System.out.println("Ano inválido!");
                    System.out.println(" ");
                    control2= false;}} while (!control2);
            datas.add(dia+"/"+mes+"/"+ano);
            qtd_comp++;
            System.out.println(" ");}
            func.visualizar_compromisso(in, func, compromissos, datas, compromisso, qtd_comp);
        return qtd_comp;}

        public void visualizar_compromisso(Scanner in, App func, ArrayList<String>compromissos, ArrayList<String>datas, String compromisso, int qtd_comp){
            Iterator<String> iter_comp= compromissos.iterator();
            Iterator<String> iter_data= datas.iterator();
            System.out.println(" ");
            System.out.println("├─────────────────LISTA DE COMPROMISSOS─────────────────┤");
            System.out.println(" ");
            int num_comp= 1;
            while (iter_comp.hasNext()) {
                compromisso= iter_comp.next();
                String data= iter_data.next();
                System.out.println("╠ ID: "+num_comp);
                System.out.println("╠ Compromisso: "+compromisso);
                System.out.println("╠ Data: "+data);
                System.out.println("║");
                num_comp++;}}

        public void pesquisar_compromisso(Scanner in, App func, int opc, ArrayList<String>compromissos, ArrayList<String>datas, String compromisso, int qtd_comp){
            Iterator<String> iter_comp= compromissos.iterator();
            Iterator<String> iter_data= datas.iterator();
            String data_comp= null;
            boolean control= true;
            System.out.println(" ");
            System.out.println("├─────────────PESQUISANDO COMPROMISSOS──────────────────┤");
            System.out.println(" ");
            while (control) {
                System.out.println(" > Insira a Data que deseja buscar: ");
                System.out.print("       > Dia: ");
                int dia= in.nextInt(); in.nextLine();
                System.out.print("       > Mês: ");
                int mes= in.nextInt(); in.nextLine();
                System.out.print("       > Ano: ");
                int ano= in.nextInt(); in.nextLine();
                String data= dia+"/"+mes+"/"+ano;
                while (iter_data.hasNext()) {
                    data_comp= iter_data.next();
                    if (data.equals(data_comp)) {
                        compromisso= iter_comp.next();
                        System.out.println("╠ Compromisso: "+compromisso);
                        System.out.println("╠ Data: "+data_comp);}
                    else {
                        System.out.println("Não encontrado compromissos para "+data);
                        System.out.print("Deseja informar outra data? [1]Sim [2]Não ");
                        opc= in.nextInt();
                        if (opc==2) {
                            control= false;}}}}}
            
        public int remover_compromisso(Scanner in, App func, ArrayList<String>compromissos, ArrayList<String>datas, String compromisso, int qtd_comp){
            System.out.println(" ");
            System.out.println("├─────────────────REMOVENDO COMPROMISSO─────────────────┤");
            System.out.println(" ");
            System.out.print(" > Insira o ID do compromisso: ");
            int num_comp= in.nextInt(); in.nextLine();
            num_comp--;
            compromissos.remove(num_comp);
            datas.remove(num_comp);
            qtd_comp--;
            System.out.println(" ");
            System.out.println(" ♦ Alteração realizada!");
            func.visualizar_compromisso(in, func, compromissos, compromissos, compromisso, qtd_comp);
        return qtd_comp;}

        public void alterar_compromisso(Scanner in, App func, ArrayList<String>compromissos, ArrayList<String>datas, String compromisso, String novo_compromisso, double dia, double nova_dia, int qtd_comp, int opc){
            boolean control1= true, control2= true;
            int novo_dia= 0, novo_mes= 0, novo_ano= 0;
            String nova_data= null;
            System.out.println(" ");
            System.out.println("─────────────────────────────────────────────────────────");
            System.out.println(" ");
            while (control1) {
                System.out.print(" > Insira o ID do compromisso: ");
                int num_comp= in.nextInt(); in.nextLine();
                num_comp--;
                System.out.println(" ");
                    do {
                        System.out.print(" > O que deseja alterar? [1]Descrição [2]Data [3]Ambos ");
                    try {
                        opc= in.nextInt(); in.nextLine();
                        control2= true;}
                    catch (InputMismatchException e) {
                        System.out.println(" ");
                        System.out.println("Informe um valor válido!");
                        System.out.println(" ");
                        in.next();
                        control2= false;}}while (!control2);
                    System.out.println(" ");
                    System.out.println("─────────────────────────────────────────────────────────");
                    System.out.println(" ");
                    switch (opc) {
                        case 1:
                            System.out.print(" > Nova descrição: ");
                            novo_compromisso= in.nextLine();
                            compromissos.set(num_comp,novo_compromisso);
                            System.out.println(" ");
                            System.out.println(" >> Alteração realizada!");
                            control1= false;
                            control2= true;
                            break;
                        case 2:
                            System.out.println(" > Nova Data");
                            do {
                                System.out.print("       > Dia: ");
                                novo_dia= in.nextInt(); in.nextLine();
                                control2= true;
                                if (novo_dia<1||novo_dia>31) {
                                    System.out.println(" ");
                                    System.out.println("Dia inválido!");
                                    System.out.println(" ");
                                    control2= false;}} while (!control2);
                            do {
                                System.out.print("       > Mês: ");
                                novo_mes= in.nextInt(); in.nextLine();
                                control2= true;
                                if (novo_mes<1||novo_mes>12) {
                                    System.out.println(" ");
                                    System.out.println("Mês inválido!");
                                    System.out.println(" ");
                                    control2= false;}} while (!control2);
                            do {
                                System.out.print("       > Ano: ");
                                novo_ano= in.nextInt(); in.nextLine();
                                control2= true;
                                if (novo_ano<2024) {
                                    System.out.println(" ");
                                    System.out.println("Ano inválido!");
                                    System.out.println(" ");
                                    control2= false;}} while (!control2);
                            nova_data= novo_dia+"/"+novo_mes+"/"+novo_ano;
                            datas.set(num_comp,nova_data);
                            System.out.println(" ");
                            System.out.println(" >> Alteração realizada!");
                            control1= false;
                            control2= true;
                            break;
                        case 3:
                            System.out.print(" > Nova descrição: ");
                            novo_compromisso= in.nextLine();
                            compromissos.set(num_comp,novo_compromisso);
                            System.out.println(" > Nova Data");
                            do {
                                System.out.print("       > Dia: ");
                                novo_dia= in.nextInt(); in.nextLine();
                                control2= true;
                                if (novo_dia<1||novo_dia>31) {
                                    System.out.println(" ");
                                    System.out.println("Dia inválido!");
                                    System.out.println(" ");
                                    control2= false;}} while (!control2);
                            do {
                                System.out.print("       > Mês: ");
                                novo_mes= in.nextInt(); in.nextLine();
                                control2= true;
                                if (novo_mes<1||novo_mes>12) {
                                    System.out.println(" ");
                                    System.out.println("Mês inválido!");
                                    System.out.println(" ");
                                    control2= false;}} while (!control2);
                            do {
                                System.out.print("       > Ano: ");
                                novo_ano= in.nextInt(); in.nextLine();
                                control2= true;
                                if (novo_ano<2024) {
                                    System.out.println(" ");
                                    System.out.println("Ano inválido!");
                                    System.out.println(" ");
                                    control2= false;}} while (!control2);
                            nova_data= novo_dia+"/"+novo_mes+"/"+novo_ano;
                            datas.set(num_comp,nova_data);
                            System.out.println(" ");
                            System.out.println(" >> Alteração realizada!");
                            control1= false;
                            control2= true;
                            break;
                        default:
                            System.out.println(RED+"Opção inválida!"+RESET);
                            System.out.println(" ");
                            control1= true;
                            control2= true;
                            break;}
                func.visualizar_compromisso(in, func, compromissos, datas, novo_compromisso, qtd_comp);
                while (control2) {
                    System.out.println("─────────────────────────────────────────────────────────");
                    System.out.println(" ");
                    do {
                        System.out.print(" > Deseja alterar outro compromisso? [1]Sim [2]Não ");
                    try {
                        opc= in.nextInt();
                        control2= true;}
                    catch (InputMismatchException e) {
                        System.out.println(" ");
                        System.out.println("Informe um valor válido!");
                        System.out.println(" ");
                        in.next();
                        control2= false;}}while (!control2);
                    in.nextLine();
                    System.out.println(" ");
                    switch (opc) {
                        case 1:
                            System.out.println("─────────────────────────────────────────────────────────");
                            System.out.println(" ");
                            control1= true;
                            control2= false;
                            break;
                        case 2:
                            control1= false;
                            control2= false;
                            break;
                        default:
                            System.out.println(" ");
                            System.out.println(RED+"Opção inválida!"+RESET);
                            break;}}}}

    public static void main(String[] args) throws Exception {
        App func= new App();
        Scanner in= new Scanner(System.in);
        ArrayList<String> compromissos= new ArrayList<>();
        ArrayList<String> datas= new ArrayList<>();
        String compromisso= null;
        int qtd_comp= 0, opc= 0;
        boolean control1= true, control2= true;

        qtd_comp= func.adicionar_compromisso(in, func, compromissos, datas, control1, compromisso, qtd_comp);
        while (control1) {
            func.menu_opcoes();
            do {
            System.out.print(GREEN+"  > O que deseja fazer agora? "+YELLOW);
            try {
                opc= in.nextInt();
                control2= true;}
            catch (InputMismatchException e) {
                System.out.println(" ");
                System.out.println(RESET+"Informe um valor válido!");
                System.out.println(" ");
                in.next();
                control2= false;}}while (!control2);
            in.nextLine();
            System.out.print(""+RESET);
            switch (opc) {
                case 1:
                qtd_comp= func.adicionar_compromisso(in, func, compromissos, datas, control1, compromisso, qtd_comp);
                    break;
                case 2:
                    func.visualizar_compromisso(in, func, compromissos, datas, compromisso, qtd_comp);
                    break;
                case 3:
                    func.pesquisar_compromisso(in, func, opc, compromissos, datas, compromisso, qtd_comp);
                    break;
                case 4:
                    qtd_comp= func.remover_compromisso(in, func, compromissos, datas, compromisso, qtd_comp);
                    break;
                case 5:
                    func.alterar_compromisso(in, func, compromissos, datas, compromisso, compromisso, opc, opc, qtd_comp, opc);
                    break;
                case 6:
                    System.out.println(" ");
                    control1= false;
                    break;
                default:
                    System.out.println(" ");
                    System.out.println(RED+"  Opção inválida!"+RESET);
                    System.out.println(" ");
                    break;}}
        in.close();}}
