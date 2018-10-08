package slow.slicing.string;
//给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
// 如果不存在，则返回  -1。
public class StringStr {
	public static int strstr(String haystack,String needle){
		int index = haystack.indexOf(needle);
		return index;
	}

	public static void main(String[] args) {
		String hay = "hello";
		String need = "";
		int index = strstr(hay,need);
		System.out.println(index);
	}
}
