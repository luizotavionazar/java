import java.util.ArrayList; import java.util.Iterator;
import java.util.Scanner;

public class App {
    // Códigos ANSI para cores
    public static final String RESET = "\033[0m";      // Reseta a cor
    public static final String RED = "\033[0;31m";     // Vermelho
    public static final String GREEN = "\033[0;32m";   // Verde
    public static final String YELLOW = "\033[0;33m";  // Amarelo

    public void menu_opcoes(){
        System.out.println("████████████████████████████████████████████████████████");
        System.out.println(" ");
        System.out.println("    >>MENU DE OPÇÕES - LISTA DE ALUNOS   ");
        System.out.println("««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
        System.out.println("      >[1] Adicionar        >[4] Remover");
        System.out.println("      >[2] Visualizar       >[5] Calcular média");
        System.out.println("      >[3] Alterar          >[6] Sair");
        System.out.println("««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
        System.out.println(" ");}

    public int adicionar_aluno(Scanner in, App func, ArrayList<String>alunos, Iterator<String>iter_aluno, ArrayList<Double>notas, Iterator<Double>iter_nota, boolean control1, String nome, double nota, int qtd_alunos){
        System.out.println(" ");
        System.out.println("████████████████████████████████████████████████████████");
        System.out.println(" ");
        System.out.println(" >>INSERINDO ALUNO");
        System.out.println("   Digite 'sair' para encerrar o preenchimento");
        System.out.println(" ");
        while (control1) {
            System.out.print(" > Nome do aluno: ");
            nome= in.nextLine();
            if (nome.equals("sair")) {
                control1= false;
                break;}
            alunos.add(nome);
            qtd_alunos++;
            System.out.print("          > Nota: ");
            nota= in.nextDouble();
            in.nextLine();
            notas.add(nota);
            System.out.println(" ");}
            func.visualizar_aluno(in, alunos, notas, nome, nota, qtd_alunos);
        return qtd_alunos;}

        public void visualizar_aluno(Scanner in, ArrayList<String>alunos, ArrayList<Double>notas, String nome, double nota, int qtd_alunos){
            Iterator<String> iter_aluno= alunos.iterator();
            Iterator<Double> iter_nota= notas.iterator();
            System.out.println(" ");
            System.out.println("████████████████████████████████████████████████████████");
            System.out.println(" ");
            System.out.println("    >>LISTA DE ALUNOS");
            System.out.println("      Quantidade: "+qtd_alunos);
            System.out.println("««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
            while (iter_aluno.hasNext()) {
                nome= iter_aluno.next();
                nota= iter_nota.next();
                System.out.println("      > Aluno: "+nome);
                System.out.println("      > Nota.: "+nota);
                System.out.println(" ");}}

        public int remover_aluno(Scanner in, App func, ArrayList<String>alunos, ArrayList<Double>notas, String nome, int qtd_alunos){
            System.out.println(" ");
            System.out.println("████████████████████████████████████████████████████████");
            System.out.println(" ");
            System.out.println(" >>REMOVENDO ALUNO");
            System.out.println(" ");
            System.out.print(" > Informe o nome do aluno: ");
            nome= in.nextLine();
            int index= alunos.indexOf(nome);
            alunos.remove(index);
            notas.remove(index);
            qtd_alunos--;
            System.out.println(" ");
            System.out.println(" >>Alteração realizada!");
            func.visualizar_aluno(in, alunos, notas, nome, qtd_alunos, qtd_alunos);
        return qtd_alunos;}

        public void alterar_aluno(Scanner in, App func, ArrayList<String>alunos, ArrayList<Double>notas, boolean control1, boolean control2, String nome, String novo_nome, double nota, double nova_nota, int qtd_alunos, int opc){
            System.out.println(" ");
            System.out.println("████████████████████████████████████████████████████████");
            System.out.println(" ");
            while (control1) {
                System.out.println(" ");
                System.out.print(" > Informe o nome do aluno: ");
                nome= in.nextLine();
                int index= alunos.indexOf(nome);
                System.out.println(" ");
                while (control1) {
                    System.out.print(" > O que deseja alterar? [1]Nome [2]Nota [3]Ambos ");
                    opc= in.nextInt();
                    in.nextLine();
                    System.out.println(" ");
                    System.out.println("««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
                    System.out.println(" ");
                    switch (opc) {
                        case 1:
                            System.out.print(" > Novo nome: ");
                            novo_nome= in.nextLine();
                            alunos.set(index,novo_nome);
                            System.out.println(" ");
                            System.out.println("Alteração realizada!");
                            control1= false;
                            control2= true;
                            break;
                        case 2:
                            System.out.print(" > Nova nota: ");
                            nova_nota= in.nextDouble();
                            in.nextLine();
                            notas.set(index,nova_nota);
                            System.out.println(" ");
                            System.out.println("Alteração realizada!");
                            control1= false;
                            control2= true;
                            break;
                        case 3:
                            System.out.print(" > Novo nome: ");
                            novo_nome= in.nextLine();
                            alunos.set(index,novo_nome);
                            System.out.print(" > Nova nota: ");
                            nova_nota= in.nextDouble();
                            in.nextLine();
                            notas.set(index,nova_nota);
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
                            break;}}
                func.visualizar_aluno(in, alunos, notas, novo_nome, nova_nota, qtd_alunos);
                while (control2) {
                    System.out.println("████████████████████████████████████████████████████████");
                    System.out.println(" ");
                    System.out.print(" > Deseja alterar outro aluno? [1]Sim [2]Não ");
                    opc= in.nextInt();
                    in.nextLine();
                    System.out.println(" ");
                    switch (opc) {
                        case 1:
                            System.out.println("««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
                            control1= true;
                            control2= false;
                            break;
                        case 2:
                            System.out.println("««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
                            control1= false;
                            control2= false;
                            break;
                        default:
                            System.out.println(" ");
                            System.out.println(RED+"Opção inválida!"+RESET);
                            break;}}}
            }

        public void media_alunos(ArrayList<Double> notas, double media, int qtd_alunos){
            Iterator<Double> iter_nota= notas.iterator();
            double soma= 0;
            while (iter_nota.hasNext()) {
                soma+= iter_nota.next();}
            media= media+soma;
            media= media/qtd_alunos;
            System.out.println(" ");
            System.out.println("████████████████████████████████████████████████████████");
            System.out.println(" ");
            System.out.println("  >>Média total dos alunos: "+media);
            System.out.println(" ");}

    public static void main(String[] args) throws Exception {
        App func= new App();
        Scanner in= new Scanner(System.in);
        ArrayList<String> alunos= new ArrayList<>();
        Iterator<String> iter_aluno= alunos.iterator();
        ArrayList<Double> notas= new ArrayList<>();
        Iterator<Double> iter_nota= notas.iterator();
        String nome= null;
        String novo_nome= null;
        int qtd_alunos= 0, opc= 0;
        double nota= 0, nova_nota=0, media= 0;
        boolean control1= true, control2= true;

        qtd_alunos= func.adicionar_aluno(in, func, alunos, iter_aluno, notas, iter_nota, control1, novo_nome, nova_nota, qtd_alunos);
        while (control1) {
            func.menu_opcoes();
            System.out.print(GREEN+"  > O que deseja fazer agora? "+YELLOW);
            opc= in.nextInt();
            in.nextLine();
            System.out.print(""+RESET);
            switch (opc) {
                case 1:
                qtd_alunos= func.adicionar_aluno(in, func, alunos, iter_aluno, notas, iter_nota, control1, novo_nome, nova_nota, qtd_alunos);
                    break;
                case 2:
                    func.visualizar_aluno(in, alunos, notas, novo_nome, nova_nota, qtd_alunos);
                    break;
                case 3:
                    func.alterar_aluno(in, func, alunos, notas, control1, control2, nome, novo_nome, nota, nova_nota, qtd_alunos, opc);;
                    break;
                case 4:
                    qtd_alunos= func.remover_aluno(in, func, alunos, notas, novo_nome, qtd_alunos);
                    break;
                case 5:
                    func.media_alunos(notas, media, qtd_alunos);
                    break;
                case 6:
                    control1= false;
                    break;
                default:
                    System.out.println(" ");
                    System.out.println(RED+"  Opção inválida!"+RESET);
                    System.out.println(" ");
                    break;}}
        in.close();}}