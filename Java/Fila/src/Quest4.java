import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Quest4 {
    public void ordenacao (int seque, Queue<Integer> fila, Stack<Integer> pilha){
        if (seque!=1) {
            
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        Queue<Integer> fila= new LinkedList<>();
        Stack<Integer> pilha= new Stack<>();
        Quest4 func= new Quest4();
        boolean control= true;
        String entrada= null;
        int seque= 1, valor= 0;

        System.out.println("");
        System.out.println("Preencha a fila para que a ordenação seja realizada!");
        System.out.println("Digite 'fim' para encerrar o preenchimento");
        System.out.println("");

        System.out.println(" > Fila sem ordem:");

        while (control) {
            System.out.print(seque+"º: ");
            entrada= in.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;}

            try {
                valor= Integer.parseInt(entrada);
                fila.offer(valor);
                func.ordenacao(seque, fila, pilha);
                seque++;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Informe um valor válido!"); }}

    in.close();}
}
