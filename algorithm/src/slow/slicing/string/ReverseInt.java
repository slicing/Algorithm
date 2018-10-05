package slow.slicing.string;
//给定一个 32 位有符号整数，将整数中的数字进行反转。
public class ReverseInt {
	public static int reverse(int x){
		if(x==0){
			return x;
		}
		else if (x>0){
			x = inttoString(x);
		}
		else {
			x = Math.abs(x);
			x = inttoString(x);
			x = 0-x;
		}
		return x;
	}
	public static int inttoString(int x){
		String s = Integer.toString(x);
		s = new StringBuffer(s).reverse().toString();
		try {
			x = Integer.parseInt(s);
		}
		catch (Exception e){
			x = 0;
		}
		return x;
	}

	public static void main(String[] args) {
		int x = -1294967297;
		x = reverse(x);
		System.out.println(x);
	}
}
