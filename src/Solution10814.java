import java.io.*;
import java.util.*;

public class Solution10814 {
	public static void run() throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[][] members = new String[N][2];
		for (int i = 0; i < N; i++) {
			members[i] = br.readLine().split(" ");
		}

		Arrays.sort(members, Comparator.comparingInt(a -> Integer.parseInt(a[0])));

		for (String[] member : members) {
			bw.write(member[0] + " " + member[1]);
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
