package slow.slicing.sum;

import java.util.HashMap;
import java.util.Map;

public class TwoHash {
	public static int[] sum(int[] num,int target){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<num.length;i++){
			map.put(num[i],i);
		}
		for(int j=0;j<num.length;j++){
			int temp = target - num[j];
			if(map.containsKey(temp) && map.get(temp)!= j){
				return new int[]{j,map.get(temp)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		int[] arr = new int[]{2,5,3,4,1,0,6};
		int[] result;
		int target = 9;
		result = sum(arr,target);
		for (int i =0;i<result.length;i++){
			System.out.println(result[i]);
		}

	}
}
