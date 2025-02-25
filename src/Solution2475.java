import java.io.*;
import java.util.StringTokenizer;

public class Solution2475 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		long d = Long.parseLong(st.nextToken());
		long e = Long.parseLong(st.nextToken());

		long f = (a * a) + (b * b) + (c * c) + (d * d) + (e * e);
		bw.write(String.valueOf(f % 10));
		bw.flush();
		bw.close();
		br.close();
	}
}
