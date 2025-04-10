
public class Swap {

	public static void main(String[] args) {

		int a =1,b=2;

		int temp =a;
		a=b;
		b=temp;

		System.out.println(a+" "+b);

		System.out.println("SWAP values of c and d without using third element: ");

		int c = 5 , d = 6;

		c = c + d;

		d = c - d;

		c = c - d;

		System.out.println("C: vale: "+c+"  D: value: "+d);

	}

}
