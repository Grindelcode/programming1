package prog1.uebungsblatt5;

import java.util.Arrays;

public class MinimumRek {

	public static int minimum(int[] array) {
		
		if(array.length > 1) {
			if(array[array.length-1] < array[array.length-2]) {
				int tmp = array[array.length-2];
				
				array[array.length-2] = array[array.length-1];
				array[array.length-1] = tmp;
			}
			
			return minimum(Arrays.copyOf(array, array.length-1));
			
			
			
		}else {
			return array[0];
		}
	}
	
	public static void main(String[] args) {
		int[] array = {5,4,8,6,55,7,18};
		
		System.out.println(minimum(array));

	}

}
