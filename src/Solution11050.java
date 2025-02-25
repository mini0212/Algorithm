import java.io.*;
import java.util.StringTokenizer;

public class Solution11050 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		bw.write(String.valueOf(binomial(n, k)));
		bw.flush();
		bw.close();
		br.close();
	}

	public static int binomial(int n, int k) {
		if (k > n - k) k = n - k;

		int result = 1;
		for (int i = 0; i < k; i++) {
			result *= (n - i);
			result /= (i + 1);
		}
		return result;
	}
}
