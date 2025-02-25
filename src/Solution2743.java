import java.io.*;
import java.util.*;

public class Solution2743 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		bw.write(String.valueOf(st.nextToken().length()));
		bw.flush();
		bw.close();
		br.close();
	}
}
