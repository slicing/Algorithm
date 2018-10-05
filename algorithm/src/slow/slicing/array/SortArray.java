package slow.slicing.array;
/*给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。*/
public class SortArray {
	public static int removeDuplicates(int[]arr){
		int tip1 = 0;
		int tip2 = 0;
		int count = 1;
		for (;tip2 < arr.length;tip2++){
			if(arr[tip1] != arr[tip2]){
				tip1++;
				arr[tip1] = arr[tip2];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] num = new int[]{0,0,1,1,1,2,2,3,3,4,8,8};
		int number = removeDuplicates(num);
		System.out.println(number);
		for(int i = 0;i<number;i++){
			System.out.print(num[i] );
		}
	}
}
