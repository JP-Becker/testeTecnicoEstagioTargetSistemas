
package com.mycompany.testeestagiotarget;

import java.util.Scanner;

public class TesteEstagioTarget {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        exercicio1();
        System.out.println("FIM DO EXERCICIO 1");
        
        exercicio2(sc);
        System.out.println("FIM DO EXERCICIO 2");
        
        exercicio3(sc);
        System.out.println("FIM DO EXERCICIO 3");
        
    }
    
    private static void exercicio1() {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K++;
            SOMA = SOMA + K;
        }
        System.out.println("Valor da variável soma: " + SOMA);
    }

    private static void exercicio2(Scanner sc) {
        System.out.println("Informe um número:");
        int numero = sc.nextInt();
        int a = 0, b = 1;
        // Variavel do tipo boolean (true ou false) para verificar se o número pertnce a sequencia para depois poder printar na tela.
        boolean pertence = numero == a || numero == b;
        // Loop para calcular a sequência de Fibonacci até o número informado
        for (int i = 0; i <= numero; i++) {
            int proximoNumero = a + b; // proximo número vai ser a soma dos últimos dois
            a = b; // atualiza a cada iteração para checar a próxima sequência
            b = proximoNumero; // atualiza a cada iteração para checar a próxima sequência       
            
            // se o número digitado for igual ao proximo da sequencia, seta a variavel boolean como true e sai do loop
            if (numero == proximoNumero) {
                pertence = true;
                break;
            }
        }
        // se pertence a sequencia printa q sim, senao printa q nao.
        if (pertence) {
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence a sequência de Fibonacci.");
        }
    }

    
    
    private static void exercicio3(Scanner sc) {
        
        // fazendo sem o método reverse().
        // botei esse loop por que o metodo main nao estava deixando botar os inputs do exercicio antes de terminar de rodar**
        while (true) {
            System.out.println("Digite a string a ser invertida: ");
            String str = sc.nextLine();
            
            // Criando um array para guardar os caracteres da string
            char[] chars = str.toCharArray();

            // criando um array para guardar os caracteres invertidos agora, que vai ter o tamanho de quantos caracteres existem na String digitada
            char[] charsInvertidos = new char[chars.length];


            // variável i inicia com chars.length - 1, que é o ultimo caractere do array posiçao do array, 
            //ja a j inicia na primeira posição do array
            //O loop termina quando i for 0, quando todos os caracxteres ja foram passados para o array que vai guardar eles invertidos.
            for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
                // o caractere da posiçao i do char é copiado para a posição j do charsInvertidos
                charsInvertidos[j] = chars[i];
            }
            
            
            String strInvertida = new String(charsInvertidos);

            System.out.println("String invertida :" + strInvertida);
            
            if (chars.length > 0) {
                break;
            }
        }
    }
    
}
