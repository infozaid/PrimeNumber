
public class Pra {

	public static void main(String[] args) {

		int rows=4;int number=1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		
		for(int k=rows;k>=1;k--) {
			for(int l=1;l<=k;l++) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
		

	}

}
