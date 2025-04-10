
public class prime1 {

	public static void main(String[] args) {
		
		int p=0;
		
		for(int i=1;i<=50;i++) {
			for(int j=2;j<i;j++) { //because prime number starts from 2
				if(i%j!=0) {
					p=1;
				}else {
					p=0;
					break;
				}
			}if(p==1) {
				System.out.println(i+" is prime");
			}
		}

	}

}
