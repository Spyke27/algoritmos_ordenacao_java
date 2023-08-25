package algoritmos_busca;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10000];
		// Preenchendo array
		for(int i = 1; i < arr.length; i++) {
			arr[i] = i * 2;
		}
		
		int inicio = 0;
		int fim = arr.length - 1;
		int meio;
		boolean achou = false;
		int contador = 0;
		
		System.out.print("Valor para buscar no array: ");
		int buscar = scan.nextInt();
		
		while(inicio <= fim) {
			meio = (int) ((inicio + fim) / 2);
			contador++;
			
			if(buscar == arr[meio]) {
				achou = true;
				break;
				
			} else if(buscar > arr[meio]) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		if(achou) {
			System.out.println("Valor encontrado!");
			System.out.println(contador + " rodadas.");
		} else {
			System.out.println("Valor não encontrado!");
			System.out.println(contador + " rodadas.");
		}
		
		
		scan.close();

	}

}
