package eng_emmanuel;

import java.util.Scanner;

public class projeto_eng {
    public static void main(String[] args) {
		int num1;
		int num2;
		int soma;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Número 1: ");
		num1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Número 2: ");
		num2 = Integer.parseInt(entrada.nextLine());
		soma = num1 + num2;
		System.out.println("Soma "+soma);
	}
}
