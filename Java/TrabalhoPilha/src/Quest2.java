import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Quest2 {
    public void menu(Stack<String> links,ArrayList<String> historico, int qtd_links){
        System.out.println("-------------------------");
        System.out.println("      NAVEGAÇÃO WEB      ");
        System.out.println("-------------------------");
        if (qtd_links>0) {
            System.out.println("SITE ATUAL: "+links.peek());
            System.out.println("-------------------------");}
        System.out.println(" > [1] Acessar link      ");
        if (qtd_links>0) {
            System.out.println(" > [2] Retornar link     ");}
        if (qtd_links>0||!historico.isEmpty()) {
            System.out.println(" > [3] Histórico         ");   }
        System.out.println(" > [4] Sair              ");
        System.out.println("-------------------------");
        System.out.println(" ");
        System.out.print("Escolha a opção desejada: ");}

    public int acessar_link(Scanner in, Stack<String> links, ArrayList<String>historico,int qtd_links){
        boolean control= true;
        String entrada= null;
        System.out.println(" ");
        System.out.print("URL do site: ");
        entrada= in.nextLine();
        links.push(entrada);
        historico.add(entrada);
        qtd_links++;
        return qtd_links;}

    public int retornar_link(Stack<String> links, int qtd_links){
        links.pop();
        qtd_links--;
        return qtd_links;}
    
    public void exibir_historico(Scanner in, ArrayList<String> historico){
        int ordem= historico.size();
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("HISTORICO DE NAVEGAÇÃO: ");
        for (int i= historico.size()-1; i >= 0; i--) {
            System.out.println(" "+ordem+"º: "+historico.get(i));
            ordem--;}}

    public boolean verificar_acesso(boolean verifica, int opc, int qtd_links, ArrayList<String> historico){
        if (qtd_links==0) {
            if (opc==2) {
                System.out.println("Necessário acessar um site primeiro!");
                verifica= false;}
            else {
                if (historico.isEmpty()) {
                    System.out.println("Necessário acessar um site primeiro!");
                    verifica= false;}}}
        return verifica;}

    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        Stack<String> links= new Stack<>();
        ArrayList<String> historico= new ArrayList<>();
        Quest2 func= new Quest2();
        int qtd_links= 0, opc= 0;
        boolean control= true, verifica= true;
        
        while (control) {
            System.out.println(" ");
            func.menu(links, historico, qtd_links);
            do {
                try {
                    opc= in.nextInt();
                    control= true;}
                catch (InputMismatchException e) {
                    System.out.println(" ");
                    System.out.println("Informe um valor válido!");
                    System.out.println(" ");
                    func.menu(links, historico, qtd_links);
                    control=false;}
                in.nextLine();}while (!control);
            switch (opc) {
                case 1:
                    qtd_links= func.acessar_link(in, links, historico, qtd_links);
                    break;
                case 2:
                    if (func.verificar_acesso(verifica, opc, qtd_links, historico)) {
                        qtd_links= func.retornar_link(links, qtd_links);}
                    break;
                case 3:
                    if (func.verificar_acesso(verifica, opc, qtd_links, historico)) {
                        func.exibir_historico(in, historico);}
                    break;
                case 4:
                    control= false;
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida!");
                    break;}}}}
