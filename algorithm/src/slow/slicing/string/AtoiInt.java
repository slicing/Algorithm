package slow.slicing.string;

public class AtoiInt {
	public static int atoi(String str){
		int start = 0;
		int sign = 1;
		int number = 0;

		//skip all the whitespaces at beginning
		while(start < str.length() && str.charAt(start) == ' ') start++;

		//check if whole string is whitespaces or first character is not a number or '+/-'
		if(start == str.length() ||
				( (str.charAt(start) < '0' || str.charAt(start) > '9') &&
						(str.charAt(start) != '-' && str.charAt(start) != '+') ) ) {

			return 0;
		}

		//check the sign and advance the start to first number
		if(str.charAt(start) == '+') start++;
		else if (str.charAt(start) == '-') {
			sign = -1;
			start++;
		}

		for(int i = start; i < str.length(); i++) {

			//get the char and convert it to number
			int pop = str.charAt(i) - '0';

			//if it is not a number break and return the converted number so far
			if(pop < 0 || pop > 9) break;

			//check if the number will overflow before I add the next digit
			if(number > Integer.MAX_VALUE / 10 || (number == Integer.MAX_VALUE / 10 && sign * pop > 7)) {
				return Integer.MAX_VALUE;
			}

			if(number < Integer.MIN_VALUE / 10 || (number == Integer.MIN_VALUE / 10 && sign * pop < -8)) {
				return Integer.MIN_VALUE;
			}

			//multiply the number by 10, so you shit the number 1 to left
			number = number * 10 + sign * pop;
		}

		return number;
	}

	public static void main(String[] args) {
		String str = "words and 987";
		int num;
		num = atoi(str);
		System.out.println(num);
	}
}
