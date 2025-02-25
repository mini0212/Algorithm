import java.io.*;
import java.util.StringTokenizer;

public class Solution11382 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());

		bw.write(String.valueOf(a + b + c));
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
