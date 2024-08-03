import java.util.ArrayList; import java.util.Iterator;
import java.util.Scanner;

public class App {
    public int adicionar_aluno(Scanner in, ArrayList<String>alunos, ArrayList<Double>notas, boolean control1, String nome, double nota, int qtd_alunos){
        System.out.println(" ");
        System.out.println("==INSERINDO ALUNO");
        System.out.println("  Digite 'sair' para encerrar o preenchimento");
        System.out.println(" ");
        while (control1) {
            System.out.print("Informe o nome do Aluno: ");
            nome= in.nextLine();
            if (nome.equals("sair")) {
                control1= false;
                break;}
            alunos.add(nome);
            qtd_alunos++;
            System.out.print("Informe a nota do Aluno: ");
            nota= in.nextDouble();
            in.nextLine();
            notas.add(nota);
            System.out.println(" ");}
        return qtd_alunos;}

        public void visualizar_aluno(Scanner in, ArrayList<String>alunos, Iterator<String>iter_aluno, ArrayList<Double>notas, Iterator<Double>iter_nota, String nome, double nota, int qtd_alunos){
            System.out.println("Quantidade de Alunos: "+qtd_alunos);
            System.out.println(" ");
            while (iter_aluno.hasNext()) {
            nome= iter_aluno.next();
            nota= iter_nota.next();
            System.out.println("Aluno: "+nome);
            System.out.println("Nota.: "+nota);
            System.out.println(" ");}}

        public int remover_aluno(Scanner in, ArrayList<String>alunos, ArrayList<Double>notas, String nome, int qtd_alunos){
            System.out.print("Informe o nome do Aluno que deseja remover: ");
            nome= in.nextLine();
            alunos.remove(alunos.indexOf(nome));
            notas.remove(notas.indexOf(nome));
            qtd_alunos--;
            System.out.println(" ");
            System.out.println("Alteração realizada!");
            System.out.println(" ");
            //func.visualiza_aluno(in, func, alunos, notas);
        return qtd_alunos;}

        public void alterar_aluno(Scanner in, ArrayList<String>alunos, ArrayList<Double>notas, boolean control1, boolean control2, String nome, String novo_nome, double nota, double nova_nota, int qtd_alunos, int opc){
            System.out.println("==ALTERANDO ALUNO");
        while (control1) {
            System.out.print("Informe o nome do Aluno: ");
            nome= in.nextLine();
            System.out.println(" ");
            while (control1) {
                System.out.print("O que deseja alterar? [1]Nome [2]Nota [3]Ambos ");
                opc= in.nextInt();
                switch (opc) {
                    case 1:
                        System.out.print("Novo nome: ");
                        novo_nome= in.nextLine();
                        alunos.set(alunos.indexOf(nome),novo_nome);
                        System.out.println(" ");
                        System.out.println("Alteração realizada!");
                        System.out.println(" ");
                        control1= false;
                        break;
                    case 2:
                        System.out.print("Nova nota: ");
                        nova_nota= in.nextDouble();
                        in.nextLine();
                        notas.set(notas.indexOf(nome),nova_nota);
                        System.out.println(" ");
                        System.out.println("Alteração realizada!");
                        System.out.println(" ");
                        control1= false;
                        break;
                    case 3:
                        System.out.print("Novo nome: ");
                        novo_nome= in.nextLine();
                        alunos.set(alunos.indexOf(nome),novo_nome);
                        System.out.println(" ");
                        System.out.print("Nova nota: ");
                        nova_nota= in.nextDouble();
                        in.nextLine();
                        notas.set(notas.indexOf(nome),nova_nota);
                        System.out.println(" ");
                        System.out.println("Alteração realizada!");
                        System.out.println(" ");
                        control1= false;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        System.out.println(" ");
                        control1= true;
                        break;}}
            while (control2) {
                System.out.print("Deseja alterar outro aluno? [1]Sim [2]Não ");
                opc= in.nextInt();
                switch (opc) {
                    case 1:
                        control1= true;
                        control2= false;
                        break;
                    case 2:
                        control1= false;
                        control2= false;
                        break;
                    default:
                        System.out.println(" ");
                        System.out.println("Opção inválida!");
                        break;}}}
        //func.visualiza_aluno(in, func, alunos, notas);
        }

        public void media_alunos(Iterator<Double>iter_nota, double nota, double media, int qtd_alunos){
            while (iter_nota.hasNext()) {
                nota= iter_nota.next();
                media= media+nota;}
            media= media/qtd_alunos;
            System.out.println(" ");
            System.out.println("Média total dos alunos: "+media);}

    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) throws Exception {
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

        //MENU
        System.out.println(" ");

        in.close();}}