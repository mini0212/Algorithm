import java.io.*;
import java.util.*;

public class Solution30802 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] arr = Arrays.stream(str.split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		int T = 0;

		for (int i : arr) {
			if (i % t == 0) {
				T += i / t;
			} else if (i % t != 0) {
				T += (i / t) + 1;
			}
		}
		bw.write(String.valueOf(T));
		bw.newLine();
		bw.write(String.valueOf(n / p) + " " + String.valueOf(n % p));

		bw.flush();
		bw.close();
		br.close();
	}
}
