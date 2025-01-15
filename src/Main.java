import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, World!");
        int[] numeros = new int[5];

        for (int c=0; c<5; c++){
            System.out.println(String.format("Qual numero na posição %d", c));
            int numero = input.nextInt();
            numeros[c] = numero;

        }

        System.out.println("busca linear");
        System.out.print("Digite o numero que você quer achar? ");
        int alvo = input.nextInt();
        int posicao = -1;
        for (int num = 0; num< numeros.length; num++){
            if(numeros[num] == alvo){
                posicao = num;
                System.out.println(String.format("O item: %d foi achado na posição: %d", alvo, posicao));
                return;
            }
        }

    }

    public  void imprimeArray(int[] array){
        for (int c: array){
            System.out.print("[ "+ c + ", ");
        }
        System.out.print("]");
    }

}