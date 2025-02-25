import java.io.*;
import java.util.Arrays;

public class Solution2751 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		int[] intArr = new int[N];

		for (int i = 0; i < N; i++) {
			intArr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(intArr);

		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(intArr[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
