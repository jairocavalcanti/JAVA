package ARRAY.Exercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho;

        System.out.println("Insira o tamanho do vetor:");
        tamanho = scanner.nextInt();

        Array.criaVetor(tamanho, scanner);
        
        System.out.println();
     
        Array.somavetor();
        Array.media();
        Array.obtemelementodoarray(scanner);
        Array.inserelementonoarray(scanner);
        Array.maiorlemento();
        Array.menorelemento();
        Array.imprimevetor();
        Array.substituirimparporzero();
      

        scanner.close();
    }
}