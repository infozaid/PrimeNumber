import java.util.ArrayList;
import java.util.List;

public class list1 {

	  
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		int roll_no=0;
		list.add("Ali");
		list.add("Uzair");
		list.add("Usama");
		list.add("Kawal");
		
		for(String string:list) {
			roll_no++;
		  System.out.println(string+" Roll NO: "+roll_no);
		}
		

	}

}
