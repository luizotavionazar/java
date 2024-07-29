import java.util.ArrayList; import java.util.Iterator;
import java.util.Scanner;

public class App {

    public void visualiza_lista(ArrayList<String> lista) {
        Iterator<String> iterator = lista.iterator();
        int num_item= 1;
        System.out.println("Lista de Itens:");
        while (iterator.hasNext()) {
            String item= iterator.next();
            System.out.println(" "+num_item+"º: "+item);
            num_item++;}}

    public void remove_lista(ArrayList<String> lista) {
        App func= new App();
        Scanner in= new Scanner(System.in);
        Iterator<String> iterator = lista.iterator();
        int indice= 0;
        System.out.print("Informe o Número do item que deseja remover: ");
        int num_item= in.nextInt();
        int num_indice= num_item-1;
        while (iterator.hasNext()) {
            iterator.next();
            if (indice==num_indice) {
                iterator.remove();
                break;}
            indice++;}
        System.out.println(" ");
        System.out.println("Alteração realizada!");
        System.out.println(" ");
        func.visualiza_lista(lista);
        in.close();}

    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        App func= new App();
        ArrayList<String> lista= new ArrayList<String>();
        boolean control= true;
        int num_item= 1;
        String opc= null;

        System.out.println(" ");
        System.out.println("Observação: Digite 'sair' para encerrar:");
        System.out.println(" ");
        while (control) {
            System.out.print("Informe o nome do "+num_item+"º item da lista: ");
            String entrada= in.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                control= false;}
                else {
                    lista.add(entrada);
                    System.out.println(" ");
                    num_item++;}}
        
        System.out.println(" ");
        func.visualiza_lista(lista);

        System.out.println(" ");
        System.out.print("Deseja remover um item da lista? s/n ");
        opc= in.nextLine();
        System.out.println(" ");
        if (opc.equals("s")) {
            func.remove_lista(lista);
            System.out.println(" ");}
        in.close();}}