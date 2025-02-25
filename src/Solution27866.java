import java.io.*;

public class Solution27866 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int i = Integer.parseInt(br.readLine());

		bw.write(str.charAt(i - 1));
		bw.flush();
		bw.close();
		br.close();
	}
}
