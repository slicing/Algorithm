package slow.slicing.string;
//编写一个函数来查找字符串数组中的最长公共前缀。
public class MaxIdenticalString {
	public static String longestCommonprefix(String[] str){
		if(str == null || str.length == 0){
			return "";
		}
		if(str.length == 1){
			return str[0];
		}
		int length = str[0].length();
		for(String st : str){
			length = Math.min(length, st.length());
		}
		if(length == 0){
			return "";
		}
		StringBuilder stringBuilder = new StringBuilder(length);
		for(int j = 0;j<length;j++){
			for(int i = 1;i<str.length;i++){
				if(str[i].charAt(j) != str[0].charAt(j))
					return stringBuilder.toString();
			}
			stringBuilder.append(str[0].charAt(j));
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		String[] arr = new String[]{"flower","flow","flight"};
		String str = longestCommonprefix(arr);
		System.out.println(str);
	}
}
