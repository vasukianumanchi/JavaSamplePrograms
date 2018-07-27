import java.util.HashSet;
import java.util.Set;

public class findSubstr {

	private Set<String> stringSet = new HashSet<String>();
	private int lstringSet = 0;

	public Set<String> findStr(String input) {

		// Reset instance data.
		stringSet.clear();
		lstringSet = 0;

		// Set a boolean flag on each char's ASCII value.
		boolean[] flag = new boolean[256];
		int j = 0;
		char[] inputCharArr = input.toCharArray();
		for (int i = 0; i < inputCharArr.length; i++) {
			char c = inputCharArr[i];
			if (flag[c]) {
				extractSubString(inputCharArr, j, i);
				for (int k = j; k < i; k++) {
					if (inputCharArr[k] == c) {
						j = k + 1;
						break;
					}
					flag[inputCharArr[k]] = false;
				}
			} else {
				flag[c] = true;
			}
		}
		extractSubString(inputCharArr, j, inputCharArr.length);
		return stringSet;
	}

	private String extractSubString(char[] inputArr, int start, int end) {

		StringBuilder sb = new StringBuilder();
		for (int i = start; i < end; i++) {
			sb.append(inputArr[i]);
		}
		String subStr = sb.toString();
		if (subStr.length() > lstringSet) {
			lstringSet = subStr.length();
			stringSet.clear();
			stringSet.add(subStr);
		} else if (subStr.length() == lstringSet) {
			stringSet.add(subStr);
		}

		return sb.toString();
	}

	public static void main(String a[]) {

		findSubstr substr = new findSubstr();

		System.out.println("Unique String is "+ " " + substr.findStr("Software_Programmer"));
		
	}
}