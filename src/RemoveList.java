import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveList {

	public static void main(String[] args) {

		Set set=new LinkedHashSet();

		List<String> list = new ArrayList<String>();
		list.add("Brian");
		list.add("Bob");
		list.add("David");
		list.add("Brandon");
		list.add("Eli");
		int i=0;
		list.removeIf(name->name.charAt(0)=='B');
		list.forEach(System.out::println);
		while( i<list.size()) {
			String test=list.get(i);
			if(test.charAt(0)=='B') {
				list.remove(i);
			}else {
				i++;
			}
		}
		for(String s:list)
			System.out.println(s);
	}

}
