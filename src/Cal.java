
public class Cal {

	public static void main(String args[]){    
		  int i,flag=0;

		   for(i=2;i<=50;i++){
			   if(i==0||i==1){
				   System.out.println(i+ " is not prime number");
				  }else if (i%2==0){      
		           System.out.println(i+" is not prime number");
		           flag=1;      
		           break;      
		    }
		   }
		   if(flag==0)  {
			   System.out.println(i+" is prime number"); 
			   }  
		  }//end of else  
		}


