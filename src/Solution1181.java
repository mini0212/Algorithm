import java.io.*;
import java.util.*;

public class Solution1181 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Set<String> wordSet = new TreeSet<>((s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			} else
				return Integer.compare(s1.length(), s2.length());
		});

		for (int i = 0; i < N; i++) {
			wordSet.add(br.readLine());
		}

		for (String s : wordSet) {
			bw.write(s);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
