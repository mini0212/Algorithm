import java.io.*;
import java.util.*;

public class Solution2753 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int year = Integer.parseInt(st.nextToken());
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			bw.write(String.valueOf(1));
		} else {
			bw.write(String.valueOf(0));
		}

		bw.newLine();
		bw.close();
	}
}
