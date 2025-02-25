import java.util.*;
import java.io.*;

public class Solution15552 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());

		for (int i = 0; i < num; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			bw.write(String.valueOf(a + b));
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
