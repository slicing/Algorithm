package slow.slicing.array;
/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）*/
public class Shares {
	public static int maxProfit(int[]prices){
		int sum = 0;
		for(int i =0;i<prices.length-1;i++){
			if(prices[i+1] > prices[i]){
				sum += prices[i+1] -prices[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = new int[]{7,6,5,4,3,2,1};
		int sum = maxProfit(arr);
		System.out.println(sum);
	}
}
