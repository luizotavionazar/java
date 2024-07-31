import java.util.ArrayList; import java.util.Iterator;
import java.util.Scanner;

public class App {
    public int adiciona_lista(Scanner in, App func, ArrayList<String> lista, int qtd_lista){
        boolean control= true;
        System.out.println(" ");
        System.out.println("Preenchimento da Lista. Digite 'sair' para encerrar!");
        System.out.println(" ");
        while (control) {
            System.out.print(qtd_lista+"º item: ");
            String entrada= in.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                control= false;}
                else {
                    lista.add(entrada);
                    qtd_lista++;}}
        System.out.println(" ");
        func.visualiza_lista(in, func, lista);
        return qtd_lista;}

    public void visualiza_lista(Scanner in, App func, ArrayList<String> lista) {
        Iterator<String> iterator = lista.iterator();
        int num_item= 1;
        System.out.println("Lista de Itens:");
        while (iterator.hasNext()) {
            String item= iterator.next();
            System.out.println(" "+num_item+"º: "+item);
            num_item++;}}

    public int remove_lista(Scanner in, App func, ArrayList<String> lista, int qtd_lista) {
        System.out.print("Informe o Nome do item que deseja remover: ");
        String nome_item= in.nextLine();
        lista.remove(lista.indexOf(nome_item));
        qtd_lista--;
        System.out.println(" ");
        System.out.println("Alteração realizada!");
        System.out.println(" ");
        func.visualiza_lista(in, func, lista);
        return qtd_lista;}
    
    public void altera_lista(Scanner in, App func, ArrayList<String> lista){
        System.out.print("Informe o nome do Item que será alterado: ");
        String item_ant= in.nextLine();
        System.out.print("Novo nome: ");
        String item_nov= in.nextLine();
        lista.set(lista.indexOf(item_ant),item_nov);
        System.out.println(" ");
        System.out.println("Alteração realizada!");
        System.out.println(" ");
        func.visualiza_lista(in,func,lista);}
    
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        App func= new App();
        ArrayList<String> lista= new ArrayList<String>();
        
        int qtd_lista= 1;
        qtd_lista= func.adiciona_lista(in, func, lista, qtd_lista);

        boolean control= true;
        int opc= 0;
        System.out.println(" ");
        do {
            System.out.print("O que deseja fazer agora? [0]Sair [1]Adicionar [2]Remover [3]Alterar ");
            opc= in.nextInt();
            System.out.println(" ");
            switch (opc) {
                case 0:
                    control=true;
                    break;
                case 1:
                    in.nextLine();
                    qtd_lista= func.adiciona_lista(in, func, lista, qtd_lista);
                    System.out.println(" ");
                    control=false;
                    break;
                case 2:
                    in.nextLine();
                    qtd_lista= func.remove_lista(in, func, lista, qtd_lista);
                    System.out.println(" ");
                    control=false;
                    break;
                case 3:
                    in.nextLine();
                    func.altera_lista(in, func, lista);
                    System.out.println(" ");
                    control= false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    control= false;
                    break;} }while (!control);
        in.close();}}
