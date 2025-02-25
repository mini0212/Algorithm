import java.io.*;
import java.util.*;

public class Solution10872 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int n = Integer.parseInt(st.nextToken());

		long output = 1L;

		for (int i = 1; i <= n; i++) {
			output *=i;
		}

		bw.write(String.valueOf(output));
		bw.close();
	}
}
