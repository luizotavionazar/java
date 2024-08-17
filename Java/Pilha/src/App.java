import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public void menu(){
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println(" MENU - PILHA DE TAREFAS ");
        System.out.println("-------------------------");
        System.out.println(" > [1] Adicionar tarefa  ");
        System.out.println(" > [2] Exibir topo       ");
        System.out.println(" > [3] Sair              ");
        System.out.println("-------------------------");
        System.out.println(" ");
        System.out.print("Escolha a opção desejada: ");}

    public int adicionar_tarefa(Scanner in, Stack<String> tarefas, int qtd_tarefas){
        boolean control= true;
        String entrada= null;
        while (control) {
            System.out.println(" ");
            System.out.print(qtd_tarefas+"º tarefa: ");
            entrada= in.nextLine();
            tarefas.push(entrada);
            qtd_tarefas++;
            control= adicionar_outra(in, control);}
        return qtd_tarefas;}

    public boolean adicionar_outra(Scanner in, boolean control){
        boolean control1= true;
        int opc= 0;
        System.out.println(" ");
        do {
            System.out.print("Adicionar outro tarefa? [1]Sim [2]Não ");
            try {
                opc= in.nextInt(); in.nextLine();
                control1= true;}
            catch (InputMismatchException e) {
                System.out.println(" ");
                System.out.println("Informe um valor válido!");
                System.out.println(" ");
                control1= false;}
            if (opc==2) {
                control= false;}
            else if (opc!=1) {
                System.out.println("Opção inválida!");
                System.out.println(" ");
                control1= false;}}while (!control1);
        return control;}
    
    public void exibir_topo(Scanner in, Stack<String> tarefas){
        if (tarefas.isEmpty()) {
            System.out.println("A pilha de tarefas está vazia!");
            System.out.println(" ");}
        else {
            System.out.println(" ");
            System.out.print(" Tarefa: ");
            System.out.println(tarefas.peek());}}
    

    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        Stack<String>tarefas= new Stack<>();
        int qtd_tarefas= 1, opc= 0;
        App func= new App();
        boolean control= true;
        
        while (control) {
            func.menu();
            do {
                try {
                    opc= in.nextInt();
                    control= true;}
                catch (InputMismatchException e) {
                    System.out.println(" ");
                    System.out.println("Informe um valor válido!");
                    func.menu();
                    control=false;}
            in.nextLine();}while (!control);
            switch (opc) {
                case 1:
                    qtd_tarefas= func.adicionar_tarefa(in, tarefas, qtd_tarefas);
                    break;
                case 2:
                    func.exibir_topo(in, tarefas);
                    break;
                case 3:
                    control= false;
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida!");
                    break;}}}}
