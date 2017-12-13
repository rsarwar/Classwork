import java.util.Collections;
import java.util.List;
public class Lists {

	public static void main(String args)
	{
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(1);
		num.add(5);
		num.add(3);
		num.add(4);
		
		System.out.println(removeDupes(num));
	}
	public static List<Integer> removeDupes (List <Integer> nums)
	{
		Collections.sort(nums);
		for(int i = 0; i < nums.size()-1; i++)
		{
			if(nums.get(i) == nums.get(i+1))
			{
				nums.remove(i);
				i--;
			}
		}
		return nums;
	}
}
