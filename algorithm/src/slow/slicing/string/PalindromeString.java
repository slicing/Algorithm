package slow.slicing.string;
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
public class PalindromeString {
	public static boolean isPalindrome(String s){
		boolean x;
		s = s.toLowerCase();
		s = s.replaceAll("[^a-z\\d]","");
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		String string = new String(str);
		if(s.equals(string)){
			x = true;
		}else{
			x = false;
		}
		return x;
	}

	public static void main(String[] args) {
		String s = "race a car";
		boolean x = isPalindrome(s);
		System.out.println(x);
	}
}
