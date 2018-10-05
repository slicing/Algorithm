package slow.slicing.sum;
/*给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
		你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。*/
public class Violence {
	public static int[] sum(int[] num,int target){
		for(int i = 0;i<num.length;i++){
			for(int j = i+1;j<num.length;j++){
				if(num[j] == target - num[i]){
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6,0};
		int[] result;
		int target = 9;
		result = sum(arr,target);
		for (int i =0;i<result.length;i++){
			System.out.println(result[i]);
		}

	}
}

