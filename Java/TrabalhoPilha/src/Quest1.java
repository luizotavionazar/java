import java.util.Scanner;
import java.util.Stack;

public class Quest1 {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        Stack<String> pilha= new Stack<>();
        int num= 1;
        boolean control= true;
        String entrada= null;

        System.out.println(" ");
        System.out.println("─────────────────────────────────────────────────────────────────────────");
        System.out.println("*Preencha a expressão informando um caractere por vez, teclando Enter.   ");
        System.out.println("*Para um perfeito balanceamento, abra e fecha as expressões corretamente!");
        System.out.println("*Por exemplo: '[{()}]' Balanceado | '[{(}])' Desbalanceado               ");
        System.out.println("─────────────────────────────────────────────────────────────────────────");
        System.out.println("Tecle '0'(zero) para encerrar o preenchimento                            ");
        System.out.println("─────────────────────────────────────────────────────────────────────────");
        while (control) {
            System.out.print("Informe a "+num+"º expressão: ");
            entrada = in.nextLine();
            if (entrada.equals("0")) {
                break;}
            char caractere = entrada.charAt(0);
            if (caractere == '['||
                caractere == '{'||
                caractere == '(') { //Entrada de abertura, empilha
                String carac= String.valueOf(caractere);
                pilha.push(carac); 
            } else if (caractere == ']'||
                       caractere == '}'||
                       caractere == ')') {
                if (pilha.isEmpty()) { //Entrada de fechamento sem antes existir abertura, está desbalanceado
                    control = false; 
                    break;}
                String top= pilha.pop(); //Desempilha para comparar
                char topo = top.charAt(0);
                if ((caractere== ']'&&topo!= '[')||
                    (caractere== '}'&&topo!= '{')||
                    (caractere== ')'&&topo!= '(')) { //Abertura e Fechamento incompativel
                    control = false; 
                    break;}}
            num++;}
        if (!pilha.isEmpty()) { //Processou a pilha e mesmo assim não está vazia, está desbalanceado
            control = false;}
        if (control) {
            System.out.println("");
            System.out.println(" >> Expressão Balanceada!");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println(" >> Expressão Desbalanceada!");
            System.out.println("");}
        in.close();}}