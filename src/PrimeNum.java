
public class PrimeNum {

	
	public static void main(String abc[]) {
		int p = 0;

		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					p = 1;
				} else {
					p = 0;
					break;
				}
			}

			if (p == 1)// ERROR HERE

				System.out.println(i + " is Prime");

		}

	}

}
