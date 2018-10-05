package slow.slicing.array;
/*给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。*/
public class CountPlus {
	public static int[] plusOne(int[] digits){
		int number;
		for (int i = digits.length-1;i>=0;i--){
			number = digits[i] + 1;
			if(number <10){
				digits[i] = number;
				break;
			}
			else if(i>0){
				digits[i] = 0;
			}
			else {
				digits[i] = 0;
				int[]arr = new int[digits.length+1];
				arr[0] = 1;
				for(int j = 1;j<arr.length;j++){
					arr[j] = digits[j-1];
				}
				return arr;
			}
		}
		return digits;
	}

	public static void main(String[] args) {
		int[] digits = {9,9,9};
		int[]arr;
		arr = plusOne(digits);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
