import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public void menu(Queue<Integer> fila) {
        System.out.println("");
        System.out.println("─────────────────────────");
        System.out.println("   CONTROLE DE SENHAS    ");
        System.out.println("─────────────────────────");
        System.out.println(" > [1] Gerar senha       ");
        if (!fila.isEmpty()) {
            System.out.println(" > [2] Chamar senha      ");
            System.out.println(" > [3] Ver fila          ");
            System.out.println(" > [4] Limpar fila       "); }
        System.out.println(" > [0] Sair              ");
        System.out.println("─────────────────────────");
        System.out.println("");
        System.out.print("Escolha a opção desejada: "); }

    public int incluir_fila(Scanner in, Queue<Integer> fila, ArrayList<String> pessoa, int seque) {
        boolean control= true;
        int opc=0;
        String nome= null;

        seque++;
        fila.offer(seque);
        System.out.println("");
        System.out.println("Senha "+seque+" gerada!");
        System.out.println("");
        while (control) {
            do {
                System.out.print("Deseja identificar a pessoa? [1]Sim | [0] Não ");
                try {
                    opc= in.nextInt();
                    control= true;
                } catch (InputMismatchException e) {
                    System.out.println("");
                    System.out.println("Informe um valor válido!");
                    control= false; }
                in.nextLine();
            } while (!control);
            if (opc!=0&&
                opc!=1) {
                System.out.println("Opção inválida!");
                System.out.println("");
                control= true;}
            else {
                control= false;}}
        if (opc==1) {
            System.out.print("Nome: ");
            nome= in.nextLine();
            pessoa.add(nome);}
        else {
            pessoa.add("");}
        return seque;}

    public void chamar_fila(Queue<Integer> fila, ArrayList<String> pessoa) {
        
    }

    public void ver_fila(Queue<Integer> fila, ArrayList<String> pessoa) {

    }

    public void tamanho_fila(Queue<Integer> fila) {

    }

    public void remover_fila(Queue<Integer> fila, ArrayList<String> pessoa) {

    }

    public boolean verificar_acesso(int opc, Queue<Integer> fila, ArrayList<String> pessoa){
        if (fila.isEmpty()) {
            if (opc==2||
                opc==3||
                opc==4) {
                System.out.println("");
                System.out.println("Necessário gerar uma senha primeiro!");
                return false; }}
        return true;}

    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        App func= new App();
        Queue<Integer> fila= new LinkedList<>();
        ArrayList<String> pessoa= new ArrayList<>();

        boolean control= true, control1= true;
        int opc= 0, seque= 0;

        while (control) {
        do {
            func.menu(fila);
            try {
                opc= in.nextInt();
                control1= true;
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("Informe um valor válido!");
                control1= false; }
            in.nextLine();
        } while (!control1);

        switch (opc) {
            case 0:
                control= false;
                break;
            case 1:
                seque= func.incluir_fila(in, fila, pessoa, seque);
                break;
            case 2:
                if (func.verificar_acesso(opc, fila, pessoa)) {
                    func.chamar_fila(fila, pessoa); }
                break;
            case 3:
                if (func.verificar_acesso(opc, fila, pessoa)) {
                    func.ver_fila(fila, pessoa); }
                break;
            case 4:
                if (func.verificar_acesso(opc, fila, pessoa)) {
                    func.remover_fila(fila, pessoa); }
                break;
            default:
                System.out.println("Opção inválida!");
                break; }}}}
