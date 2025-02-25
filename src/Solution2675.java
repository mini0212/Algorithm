import java.io.*;
import java.util.StringTokenizer;

public class Solution2675 {
	public static void run() throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			String code = st.nextToken();
			StringBuilder sb = new StringBuilder();
			for (char c: code.toCharArray()) {
				sb.append(String.valueOf(c).repeat(s));
			}
			bw.write(sb.toString());
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
