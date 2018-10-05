package slow.slicing.string;
//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
import java.util.Arrays;

public class LonelyChar {
	public static int firstUniqChar(String s){
		int[] nums = new int[256];
		int index = -1;
		Arrays.fill(nums,0);
		for (int i =0;i<s.length();i++){
			nums[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++){
			if(nums[s.charAt(i)] == 1){
				index = i;
				return index;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		String s = "leltcode";
		int index = firstUniqChar(s);
		System.out.println(index);
	}

}
