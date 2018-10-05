package slow.slicing.sum;

import java.util.HashMap;
import java.util.Map;

public class OneHash {
	public static int[] sum(int[] num,int target){
		Map<Integer,Integer> map = new HashMap<>();
		for (int i=0;i<num.length;i++){
			int temp = target - num[i];
			if(map.containsKey(temp)){
				return new int[]{map.get(temp),i};
			}
			map.put(num[i],i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		int[] arr = new int[]{2,5,3,12,1,0,6};
		int[] result;
		int target = 9;
		result = sum(arr,target);
		for (int i =0;i<result.length;i++){
			System.out.println(result[i]);
		}

	}
}
