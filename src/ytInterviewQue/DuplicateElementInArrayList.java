package ytInterviewQue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementInArrayList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,2,5,8,5,7,8,1,80,8);
		
		Set<Integer> set = new HashSet<>();
		//to find union element
		//list.stream().filter(x -> set.add(x)).forEach(x->System.out.println(x));
		//to find duplicate element
		//list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					 set.add(list.get(i));
				}
			}
		}
		System.out.println(set);
	}
}
