package Calculadora;
import java.util.Scanner;
public class Calculadora {
    public void linha() {
        System.out.println("----------------------------");}
    public void linhad() {
        System.out.println("============================");}
    public void spc() {
        System.out.println("");}
    public void soma(Scanner entrada, Calculadora metodo) {
        float resultado;
        System.out.print("Informe o 1º Valor: ");
        float num1=entrada.nextInt();
        System.out.print("Informe o 2º Valor: ");
        float num2=entrada.nextInt();
        resultado= num1+num2;
        metodo.spc();
        System.out.println("Resultado: "+resultado);
        metodo.spc();
        entrada.close();}
    public void subtracao(Scanner entrada, Calculadora metodo) {
        float resultado;
        System.out.print("Informe o 1º Valor: ");
        float num1=entrada.nextInt();
        System.out.print("Informe o 2º Valor: ");
        float num2=entrada.nextInt();
        resultado= num1-num2;
        metodo.spc();
        System.out.println("Resultado: "+resultado);
        metodo.spc();
        entrada.close();}
    public void divisao(Scanner entrada, Calculadora metodo) {
        float resultado;
        System.out.print("Informe o 1º Valor: ");
        float num1=entrada.nextInt();
        System.out.print("Informe o 2º Valor: ");
        float num2=entrada.nextInt();
        resultado= num1/num2;
        metodo.spc();
        System.out.println("Resultado: "+resultado);
        metodo.spc();
        entrada.close();}
    public void multiplicacao(Scanner entrada, Calculadora metodo) {
        float resultado;
        System.out.print("Informe o 1º Valor: ");
        float num1=entrada.nextInt();
        System.out.print("Informe o 2º Valor: ");
        float num2=entrada.nextInt();
        resultado= num1*num2;
        metodo.spc();
        System.out.println("Resultado: "+resultado);
        metodo.spc();
        entrada.close();}
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Calculadora metodo= new Calculadora();
        metodo.linhad();
        System.out.println("CALCULADORA CABULOSA DO LUIZ");
        metodo.linha();
        System.out.println("Escolha o tipo de calculo desejado:");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Divisão");
        System.out.println("4- Multiplicação");
        metodo.spc();
        System.out.print("Opção desejada: ");
        int opc=entrada.nextInt();
        metodo.spc();
        switch (opc) {
            case 1:
            metodo.soma(entrada,metodo);
                break;
            case 2:
            metodo.subtracao(entrada,metodo);
                break;
            case 3:
            metodo.divisao(entrada,metodo);
                break;
            case 4:
            metodo.multiplicacao(entrada,metodo);
                break;
            default:
                break;}}}