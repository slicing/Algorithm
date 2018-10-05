package slow.slicing.array;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
public class Lonely {
	public static int singleNumber(int[]nums){
		int tip1 = 0;
		int tip2;
		int temp;
		int flag;
		for(;tip1<nums.length;){
			flag = 0;
			for(tip2 = tip1+1;tip2<nums.length;tip2++){
				if(nums[tip1] == nums[tip2]){
					temp = nums[tip2];
					nums[tip2] = nums[tip1+1];
					nums[tip1+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0){
				return nums[tip1];
			}
			tip1 += 2;
		}
		throw new IllegalArgumentException("No two sum solution");

	}

	public static void main(String[] args) {
		int[] arr = new int[]{1,3,1,-1,3};
		int number = singleNumber(arr);
		System.out.println(number);
	}
}
