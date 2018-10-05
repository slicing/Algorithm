package slow.slicing.string;
//编写一个函数，其作用是将输入的字符串反转过来。
public class ReverseString {
	public static String reverse(String s){
		return new StringBuffer(s).reverse().toString();
	}

	public static String reverse1(String s){
		char[] array = s.toCharArray();
		String reverse = "";
		for(int i =s.length()-1;i>=0;i--){
			reverse += array[i];
		}
		return reverse;
	}

	public static void main(String[] args) {
		String s = "hello";
		s = reverse1(s);
		System.out.println(s);
	}
}
