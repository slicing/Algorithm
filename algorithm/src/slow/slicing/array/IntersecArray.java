package slow.slicing.array;
//给定两个数组，编写一个函数来计算它们的交集。
public class IntersecArray {
	public static int[] intersect(int[] nums1,int[] nums2){
		int[] arr;
		if(nums1.length <= nums2.length ){
			arr = new int[nums1.length];
			return result(nums1,nums2,arr);
		}
		else{
			arr = new int[nums2.length];
			return result(nums2,nums1,arr);
		}
	}
	public static int[] result(int[] nums1,int[] nums2,int[] arr){
		int count = 0;
		int number = nums2.length;
		for(int i = 0;i<nums1.length;i++){
			for(int j =0;j<number;j++){
				if(nums1[i] == nums2[j]){
					arr[count] = nums1[i];
					for(int k = j;k<number-1;k++){
						nums2[k] = nums2[k+1];
					}
					number--;
					count++;
					break;
				}
			}
		}
		int[]arrs = new int[count];
		for(int i = 0;i<count;i++){
			arrs[i] = arr[i];
		}
		return arrs;
	}

	public static void main(String[] args) {
		int[] nums1 = new int[]{3,2,1};
		int[] nums2 = new int[]{2,2};
		int[] arr;
		arr = intersect(nums1,nums2);
		for(int i= 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}
}
