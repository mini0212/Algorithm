import java.io.*;
import java.util.*;

public class Solution2420 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());

		long result = Math.abs(n - m);
		bw.write(String.valueOf(result));

		bw.newLine();
		bw.close();
	}
}
