import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        Queue<Character> fila= new LinkedList<>();
        String palavra= null, palavra1= null, palavra2= "";

        System.out.println("");
        System.out.println("Informe a palavra para verificar se a mesma é um palindromo!");
        System.out.println("");
        System.out.print("Palavra: ");
        palavra= in.nextLine();
        palavra1= palavra.toLowerCase();
        int tam= palavra.length();

        for (int i = 0; i < tam; i++) {
            fila.add(palavra1.charAt(i));}

        while (!fila.isEmpty()) {
            palavra2= fila.poll()+palavra2;}

        System.out.println("");

        if (palavra1.equals(palavra2)) {
            System.out.println(palavra+" é um Palindromo :)");}
        else {
            System.out.println(palavra+" não é um Palindromo :(");}
        
        System.out.println("");

        in.close(); }}