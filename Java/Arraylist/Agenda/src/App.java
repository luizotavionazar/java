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
        System.out.println("       ► MENU DE OPÇÕES - AGENDA DE COMPROMISSOS ◄       ");
        System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
        System.out.println("       ►[1] Adicionar        ►[4] Remover                ");
        System.out.println("       ►[2] Visualizar       ►[5] Alterar                ");
        System.out.println("       ►[3] Pesquisar        ►[6] Sair                   ");
        System.out.println("«««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
        System.out.println(" ");}

    public int adicionar_compromisso(Scanner in, App func, ArrayList<String>compromissos, ArrayList<String>datas, boolean control1, String compromisso, int qtd_comp){
        System.out.println(" ");
        System.out.println("├─────────────────INSERINDO COMPROMISSO─────────────────┤");
        System.out.println("        Digite 'sair' para encerrar o preenchimento      ");
        System.out.println(" ");
        while (control1) {  
            System.out.print(" ► Descrição: ");
            compromisso= in.nextLine();
            if (compromisso.equals("sair")) {
                control1= false;
                break;}
            compromissos.add(compromisso);
            System.out.print("       ► Dia: ");
            int dia= in.nextInt(); in.nextLine();
            System.out.print("       ► Mês: ");
            int mes= in.nextInt(); in.nextLine();
            System.out.print("       ► Ano: ");
            int ano= in.nextInt(); in.nextLine();
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
            System.out.println(" ");
            System.out.println("├─────────────PESQUISANDO COMPROMISSOS──────────────────┤");
            System.out.println(" ");
            System.out.print(" ► Insira a Data que deseja buscar: ");
            System.out.print("       ► Dia: ");
            int dia= in.nextInt(); in.nextLine();
            System.out.print("       ► Mês: ");
            int mes= in.nextInt(); in.nextLine();
            System.out.print("       ► Ano: ");
            int ano= in.nextInt(); in.nextLine();
            String data= dia+"/"+mes+"/"+ano;
            while (iter_data.hasNext()) {
                data_comp= iter_data.next();
                if (data.equals(data_comp)) {
                    compromisso= iter_comp.next();
                    System.out.println("╠ Compromisso: "+compromisso);
                    System.out.println("╠ Data: "+data_comp);
                else {
                    System.out.println("Não encontrado compromissos para "+data);
                    System.out.print("Deseja informar outra data? [1]Sim [2]Não ");
                    opc= in.nextInt();
                    if (opc==1) {
                        control1= 
                    }
                }}}}
            
        public int remover_compromisso(Scanner in, App func, ArrayList<String>compromissos, ArrayList<Double>dias, String compromisso, int qtd_comp){
            System.out.println(" ");
            System.out.println("├─────────────────REMOVENDO COMPROMISSO─────────────────┤");
            System.out.println(" ");
            System.out.print(" ► Insira o ID do compromisso: ");
            int num_comp= in.nextLine();
            num_comp--;
            compromissos.remove(num_comp);
            dias.remove(num_comp);
            qtd_comp--;
            System.out.println(" ");
            System.out.println(" ♦ Alteração realizada!");
            func.visualizar_compromisso(in, func, compromissos, compromissos, compromisso, qtd_comp);
        return qtd_comp;}

        public void alterar_compromisso(Scanner in, App func, ArrayList<String>compromissos, ArrayList<Double>dias, boolean control1, boolean control2, String compromisso, String novo_compromisso, double dia, double nova_dia, int qtd_comp, int opc){
            System.out.println(" ");
            System.out.println("─────────────────────────────────────────────────────────");
            System.out.println(" ");
            while (control1) {
                System.out.print(" > Informe o compromisso do aluno: ");
                compromisso= in.nextLine();
                int index= compromissos.indexOf(compromisso);
                System.out.println(" ");
                    do {
                        System.out.print(" > O que deseja alterar? [1]compromisso [2]dia [3]Ambos ");
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
                    System.out.println("««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
                    System.out.println(" ");
                    switch (opc) {
                        case 1:
                            System.out.print(" > Novo compromisso: ");
                            novo_compromisso= in.nextLine();
                            compromissos.set(index,novo_compromisso);
                            System.out.println(" ");
                            System.out.println("Alteração realizada!");
                            control1= false;
                            control2= true;
                            break;
                        case 2:
                            System.out.print(" > Nova dia: ");
                            nova_dia= in.nextInt();
                            in.nextLine();
                            dias.set(index,nova_dia);
                            System.out.println(" ");
                            System.out.println("Alteração realizada!");
                            control1= false;
                            control2= true;
                            break;
                        case 3:
                            System.out.print(" > Novo compromisso: ");
                            novo_compromisso= in.nextLine();
                            compromissos.set(index,novo_compromisso);
                            System.out.print(" > Nova dia: ");
                            nova_dia= in.nextInt();
                            in.nextLine();
                            dias.set(index,nova_dia);
                            System.out.println(" ");
                            System.out.println("Alteração realizada!");
                            control1= false;
                            control2= true;
                            break;
                        default:
                            System.out.println(RED+"Opção inválida!"+RESET);
                            System.out.println(" ");
                            control1= true;
                            control2= true;
                            break;}
                func.visualizar_aluno(in, func, compromissos, null, novo_compromisso, index, opc, index, qtd_comp);
                while (control2) {
                    System.out.println("─────────────────────────────────────────────────────────");
                    System.out.println(" ");
                    do {
                        System.out.print(" > Deseja alterar outro aluno? [1]Sim [2]Não ");
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
                            System.out.println("««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
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

        public void media_compromissos(ArrayList<Double> dias, double media, int qtd_comp){
            Iterator<Double> iter_dia= dias.iterator();
            double soma= 0;
            while (iter_dia.hasNext()) {
                soma+= iter_dia.next();}
            media= media+soma;
            media= media/qtd_comp;
            System.out.println(" ");
            System.out.println("─────────────────────────────────────────────────────────");
            System.out.println(" ");
            System.out.println("  >>Média total dos compromissos: "+media);
            System.out.println(" ");}

    public static void main(String[] args) throws Exception {
        App func= new App();
        Scanner in= new Scanner(System.in);
        ArrayList<String> compromissos= new ArrayList<>();
        Iterator<String> iter_comp= compromissos.iterator();
        ArrayList<String> datas= new ArrayList<>();
        Iterator<Integer> iter_data= datas.iterator();
        String compromisso= null;
        String novo_comp= null;
        int qtd_comp= 0, opc= 0;
        boolean control1= true, control2= true;

        func.teste();
        qtd_comp= func.adicionar_compromisso(in, func, compromissos, datas, control1, compromisso, dia, mes, ano, qtd_comp);
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
                qtd_comp= func.adicionar_compromisso(in, func, compromissos, datas, control1, compromisso, dia, mes, ano, qtd_comp);
                    break;
                case 2:
                    func.visualizar_aluno(in, func, compromissos, datas, compromisso, dia, mes, ano, qtd_comp);
                    break;
                case 3:
                    func.alterar_aluno(in, func, compromissos, null, control1, control2, compromisso, compromisso, dia, dia, qtd_comp, opc);
                    break;
                case 4:
                    qtd_comp= func.remover_aluno(in, func, compromissos, null, compromisso, qtd_comp);
                    break;
                case 5:
                    func.media_compromissos(null, dia, qtd_comp);
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
