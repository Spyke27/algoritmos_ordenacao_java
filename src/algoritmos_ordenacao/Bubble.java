package algoritmos_ordenacao;

public class Bubble {

	public static void main(String[] args) {
		Integer[] arr = {8, 5, 3, 9, 7, 2, 1, 4, 6};
		
		int i;
		int j;
		int aux;
		
		for(i = 0; i < arr.length - 1; i++) {
			for(j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}
			}
		}
		
		for(Integer num: arr) {
			System.out.println(num);
		}

	}

}
