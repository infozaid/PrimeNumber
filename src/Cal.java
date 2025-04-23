
public class Cal {

	public static void main(String[] args) {
		int i, j, flag = 0;

		for(i=1;i<50;i++){
			for(j=2;j<i;j++){
				if(i%j!=0){
					flag=1;
				}else{
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.println(i+" is prime number");
			}

		}


	}
}


