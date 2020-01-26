package prog1.uebungsblatt3;

public class Stars {

	public static void main(String[] args) {
		
		int max = 10;
		//a
//		for(int i=1; i <=max;i++) {
//			for(int j=1; j <=i; j++) {
//				System.out.print('*');
//			}
//			
//			System.out.println();
//		}
		
		
		//b
//		for(int i=max; i > 0; i--) {
//			for(int j=1;j <=i; j++) {
//				System.out.print('*');
//			}
//			
//			System.out.println();
//		}
		
		//c
		
		int space = 0;
		
//		for(int i = max; i > 0; i--) {
//			space = max-i;
//			
//			for(int j=1; j <= space; j++) {
//				System.out.print(' ');
//			}
//			
//			for(int k=1; k <= (max-space); k++) {
//				System.out.print('*');
//			}
//			
//			System.out.println();
//		}
		
		
		// d
		
		for(int i=1; i <= max; i++) {
			space = max-i;
			
			for(int j=1; j <= space; j++) {
				System.out.print(' ');
				}
			
			for(int k = 1; k <= i; k++) {
				System.out.print('*');
				
			}
			
			System.out.println();
		}
		

	}

}
