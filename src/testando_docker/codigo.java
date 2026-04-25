package testando_docker;

import java.util.Scanner;

public class codigo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Perguntar nome
	        System.out.print("Digite seu nome: ");
	        String nome = scanner.nextLine();

	        // Perguntar idade
	        System.out.print("Digite sua idade: ");
	        int idade = scanner.nextInt();

	        // Verificar se pode dirigir
	        if (idade >= 18) {
	            System.out.println(nome + ", você já pode dirigir!");
	        } else {
	            System.out.println(nome + ", você ainda não pode dirigir.");
	        }

	        scanner.close();
	    }
	}

