package slow.slicing.array;
/*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。*/
public class ZeroeMove {
	public static void moveZeroes(int[] nums){
		int number = nums.length;
		int count = 0;
		for(int i=0;i<number;){
			if(i == nums.length - count){
			break;
			}
			if(nums[i] == 0){
				count++;
				for(int j = i;j < nums.length-1;j++){
					nums[j] = nums[j+1];
				}
				nums[nums.length-1] = 0;
				number--;
			}
			else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{0,1,2,3,4};
		moveZeroes(nums);
		for(int i : nums){
			System.out.println(i);
		}
	}
}
