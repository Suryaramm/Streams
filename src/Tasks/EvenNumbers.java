package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
	  List<Integer> numbers= new ArrayList<>();
	  numbers.add(2);
	  numbers.add(3);
	  numbers.add(14);
	  numbers.add(5);
	  numbers.add(6);
	  numbers.add(6);
	  numbers.add(2);
	  numbers.add(6);
	  numbers.add(16);
	 long evenNumbers= numbers.stream().filter(n->n%2==1).count();
	   
//	    System.out.println(s);
	 
	  List<Integer> startWith= numbers.stream().filter(number -> String.valueOf(number).startsWith("1")).collect(Collectors.toList());
//	   int max=Collections.max(evenNumbers);
	 
	  Integer fistElement= numbers.stream().findFirst()
			  
			  
	            .orElse(null); 
	 Optional<Integer> count= numbers.stream().max(Integer::compare);
	

	  
//	  Map<Integer, Long> counts = numbers.stream()
//	            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//	       System.out.println(counts);
//	        
//	        List<Integer> duplicates = counts.entrySet().stream()
//	            .filter(entry -> entry.getValue() > 1)
//	            .map(s->s.getKey())
//	            .collect(Collectors.toList());
//	  
	  
//	   System.out.println(evenNumbers);
	   System.out.println(startWith);
//	   System.out.println(duplicates);
//	   System.out.println(fistElement);
//	   System.out.println(count);
	}

}



