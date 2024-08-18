import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Quest2 {
    public void menu(Stack<String> links,ArrayList<String> historico){
        System.out.println("─────────────────────────");
        System.out.println("      NAVEGAÇÃO WEB      ");
        System.out.println("─────────────────────────");
        if (!links.isEmpty()) {
            System.out.println("SITE ATUAL: "+links.peek());
            System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»");}
        System.out.println(" > [1] Acessar link      ");
        if (!links.isEmpty()) {
            System.out.println(" > [2] Retornar link     ");}
        if (!links.isEmpty()||!historico.isEmpty()) {
            System.out.println(" > [3] Histórico         ");   }
        System.out.println(" > [4] Sair              ");
        System.out.println("─────────────────────────");
        System.out.println(" ");
        System.out.print("Escolha a opção desejada: ");}

    public void acessar_link(Scanner in, Stack<String> links, ArrayList<String>historico){
        String entrada= null;
        System.out.println(" ");
        do {
            System.out.print("URL do site: ");
            entrada= in.nextLine();
            if (entrada.trim().isEmpty()) {
                System.out.println("Informe um link válido!");
                System.out.println(" ");}
        } while (entrada.trim().isEmpty());
        links.push(entrada);
        historico.add(entrada);}
    
    public void exibir_historico(ArrayList<String> historico){
        int ordem= historico.size();
        System.out.println(" ");
        System.out.println("*************************");
        System.out.println("HISTORICO DE NAVEGAÇÃO: ");
        for (int i= historico.size()-1; i >= 0; i--) {
            System.out.println(" "+ordem+"º: "+historico.get(i));
            ordem--;}
        System.out.println("*************************");}

    public boolean verificar_acesso(int opc, Stack<String> links, ArrayList<String> historico){
        if (links.isEmpty()) {
            if (opc==2) {
                System.out.println("Necessário acessar um link primeiro!"); //Não existe link para retorno
                return false;}
            else {
                if (historico.isEmpty()) {
                    System.out.println("Necessário acessar um link primeiro!"); //Não foi acessado link para existir histórico
                    return false;}}}
        return true;}

    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        Stack<String> links= new Stack<>();
        ArrayList<String> historico= new ArrayList<>();
        Quest2 func= new Quest2();
        int opc= 0;
        boolean control= true;
        
        while (control) {
            System.out.println(" ");
            func.menu(links, historico);
            do {
                try {
                    opc= in.nextInt();
                    control= true;}
                catch (InputMismatchException e) {
                    System.out.println(" ");
                    System.out.println("Informe um valor válido!");
                    System.out.println(" ");
                    func.menu(links, historico);
                    control=false;}
                in.nextLine();
            }while (!control);
            switch (opc) {
                case 1:
                    func.acessar_link(in, links, historico);
                    break;
                case 2:
                    if (func.verificar_acesso(opc, links, historico)) {
                        try {
                            links.pop();
                            historico.add(links.peek());
                        } catch (Exception EmptyStackException) {}}
                    break;
                case 3:
                    if (func.verificar_acesso(opc, links, historico)) {
                        func.exibir_historico(historico);}
                    break;
                case 4:
                    control= false;
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida!");
                    break;}}
                in.close();}}