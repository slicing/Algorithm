package slow.slicing.array;
/*给定一个整数数组，判断是否存在重复元素。
如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。*/
import java.util.HashMap;
import java.util.Map;

public class ArrayRepeat {
	public static boolean containsDuplicate(int[] nums){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				return true;
			}
			map.put(nums[i],i);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
		boolean flag = containsDuplicate(nums);
		System.out.println(flag);
	}
}
