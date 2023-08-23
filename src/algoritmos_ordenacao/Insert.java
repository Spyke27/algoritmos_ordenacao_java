package algoritmos_ordenacao;

import java.util.Random;

public class Insert {

	public static void main(String[] args) {
		Random random = new Random();
        int[] arr = new int[10];
        
        //Povoando Array com números aleatórios
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = random.nextInt(999);
        }
        
        //InsertionSort
        for(int i = 1; i < arr.length; i++) {
        	int temp = arr[i];
        	int j = i - 1;
        	
        	while(j >= 0 && arr[j] > temp) {
        		arr[j + 1] = arr[j];
        		j--;
        	}
        	arr[j + 1] = temp;
        	
        }
        
        for(Integer num: arr) {
			System.out.println(num);
		}
	}

}
