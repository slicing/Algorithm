package slow.slicing.array;
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
public class RotateArray {
	public static void rotate(int[] nums,int k){
		int temp;
		for(int i = 0;i<k;i++){
			temp = nums[nums.length-1];
			for(int j =nums.length-1;j>0;j--){
				nums[j] = nums[j-1];
			}
			nums[0] = temp;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		int k =3;
		rotate(nums,k);
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i] + " ");

		}

	}
}
