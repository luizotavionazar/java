import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        Queue<Integer> fila1= new LinkedList<>();
        Queue<Integer> fila2= new LinkedList<>();
        Queue<Integer> fila3= new LinkedList<>();
        int seque= 1, valor= 0;
        String entrada= null;
        boolean control= true;
        
        System.out.println("");
        System.out.println("Informe os valores para 2 filas, a 3º será criada ao fim do preenchimento das 2 filas");
        System.out.println("Digite 'fim' para encerrar o preenchimento");
        System.out.println("");

        System.out.println(" >> Primeira fila:");

        while (control) {
            System.out.print(seque+"º: ");
            entrada= in.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;}

            try {
                valor= Integer.parseInt(entrada);
                fila1.offer(valor);
                seque++;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Informe um valor válido!"); }}

        seque= 1;
        System.out.println("");
        System.out.println(" >> Segunda fila:");

        while (control) {
            System.out.print(seque+"º: ");
            entrada= in.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;}

            try {
                valor= Integer.parseInt(entrada);
                fila2.offer(valor);
                seque++;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Informe um valor válido!"); }}

        System.out.println("");
        System.out.print("Fila 1: ");
        for (Integer conteudo : fila1) {
            System.out.print(conteudo+" "); }
        System.out.println("");

        System.out.print("Fila 2: ");
        for (Integer conteudo : fila2) {
            System.out.print(conteudo+" "); }
        System.out.println("");

        while (!fila1.isEmpty() &&
               !fila2.isEmpty()) {
            fila3.offer(fila1.poll());
            fila3.offer(fila2.poll()); }
        
        if (fila1.isEmpty()) {
            do {
                fila3.offer(fila2.poll());
            } while (!fila2.isEmpty()); }
        else {
            do {
                fila3.offer(fila1.poll());
            } while (!fila1.isEmpty()); }

        System.out.print("Fila 3: ");
        for (Integer conteudo : fila3) {
            System.out.print(conteudo+" "); }
        System.out.println(""); System.out.println("");
        
        in.close(); }}