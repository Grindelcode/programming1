package prog1.uebungsblatt4;

public class BubbleSort {

	public static void main(String[] args) {
		
		int array[] = { 2000, 2, 45, 34, 100000, 345, 56, 78, 99, 756, 999, 0, 666, 2345, 7492, 22 };
		
		String output = "Data items in original order\n";
		
		for(int i = 0; i < array.length; i++) {
			output += " " + array[i];
		}
		System.out.println(output);
		
		for(int pass=0; pass < array.length; pass++) {
			
			for(int element = 0; element < array.length- 1 - pass; element++) {
				
				if(array[element] > array[element+1]) {
					
					int temp;
					
					temp = array[element];
					
					array[element] = array[element+1];
					array[element+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Data items in ascending order\n");
	
		output = "";
		
		for(int i = 0; i < array.length; i ++) {
			output += " " + array[i];
		}
		
		System.out.println(output);
	}

}
