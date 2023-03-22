import java.util.Scanner;

public class TabelaDeMultiplicacao {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite o número que deseja multiplicar: ");
        int numero = entradaDoUsuario.nextInt();

        System.out.println("Tabela de multiplicação de " + numero);

        for (int i = 0; i <= numero; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

}