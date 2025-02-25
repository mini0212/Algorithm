import java.util.*;
import java.io.*;

public class Solution10951 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		String line;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			bw.write(String.valueOf(a + b));
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
