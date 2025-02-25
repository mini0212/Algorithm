import java.util.*;
import java.io.*;

public class Solution2744 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < (str.length()); i ++) {
			char ch = sb.charAt(i);
			if (Character.isUpperCase(ch)) {
				sb.setCharAt(i, Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				sb.setCharAt(i, Character.toUpperCase(ch));
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
