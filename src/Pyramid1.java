
public class Pyramid1 {

	public static void main(String[] args) {
		
		int columns=1;
	  for(int i=1;i<=7;i++) {
		for(int j=1;j<=columns;j++) {
			System.out.print(" "+i);
		}
		System.out.println();
		if(i<4) {
			columns=columns+1;
		}else {
			columns=columns-1;
		}
		
	}
}

}
