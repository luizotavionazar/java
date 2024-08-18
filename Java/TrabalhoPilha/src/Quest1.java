import java.util.Scanner;
import java.util.Stack;

public class Quest1 {
    public static void main(String[] args) throws Exception {
        Quest1 func= new Quest1();
        Scanner in= new Scanner(System.in);
        Stack<String> pilha= new Stack<>();
        int num= 1;
        boolean control= true;
        String entrada= null;

        System.out.println(" ");
        System.out.println("Preencha a expressão informando um caractere por vez, teclando Enter.");
        System.out.println("Para um perfeito balanceamento, abra e fecha as expressões corretamente!");
        System.out.println("Por exemplo: '[{()}]' Balanceado | '[{(}])' Desbalanceado");
        System.out.println("Tecle '0'(zero) para encerrar o preenchimento");
        while (control) {
            System.out.print("Informe a "+num+"º expressão: ");
            entrada= in.nextLine();
            if (entrada.equals("0")) {
                control=false;
                break;}
            pilha.push(entrada);
            num++;}

        String expressao= '""';
        for (int i = 0; i < num; i++) {
            expressao= expressao+pilha.peek();
            if (!pilha.isEmpty()) {
                pilha.pop();}}
        char caractere1;
        char caractere2;
        
        for (int i = 0; i < args.length; i++) {
            caractere1= expressao.charAt(i);
            for (int j = expressao.length(); j <= i; j--) {
                caractere2= expressao.charAt(j);
                if (caractere1=='['||
                    caractere1=='{'||
                    caractere1=='(') {
                    if (caractere2==']'||
                        caractere2=='}'||
                        caractere2==')'){
                        control=true;}}}}
        
        if (control) {
            System.out.println("Verdadeiro");}
        else{
            System.out.println("Falso");
        }

    }
}

import java.util.Scanner;
import java.util.Stack;

public class Quest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();
        boolean control = true;

        System.out.println(" ");
        System.out.println("Preencha a expressão informando um caractere por vez, teclando Enter.");
        System.out.println("Para um perfeito balanceamento, abra e fecha as expressões corretamente!");
        System.out.println("Por exemplo: '[{()}]' Balanceado | '[{(}])' Desbalanceado");
        System.out.println("Tecle '0'(zero) para encerrar o preenchimento");

        while (control) {
            System.out.print("Informe a próxima expressão: ");
            String entrada = in.nextLine();
            if (entrada.equals("0")) {
                break;
            }

            char caractere = entrada.charAt(0);
            if (caractere == '[' || caractere == '{' || caractere == '(') {
                pilha.push(caractere); // Se é um caractere de abertura, empilha
            } else if (caractere == ']' || caractere == '}' || caractere == ')') {
                if (pilha.isEmpty()) {
                    control = false; // Pilha vazia significa desbalanceado
                    break;
                }
                char topo = pilha.pop();
                if ((caractere == ']' && topo != '[') ||
                    (caractere == '}' && topo != '{') ||
                    (caractere == ')' && topo != '(')) {
                    control = false; // Caracteres não correspondem
                    break;
                }
            }
        }

        // Se a pilha não está vazia após processar toda a expressão, está desbalanceado
        if (!pilha.isEmpty()) {
            control = false;
        }

        if (control) {
            System.out.println("Verdadeiro (Balanceado)");
        } else {
            System.out.println("Falso (Desbalanceado)");
        }

        in.close();
    }}
