import java.util.*;
import java.io.*;

public class Solution10807 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int v = Integer.parseInt(br.readLine());
		int[] filteredArr = Arrays.stream(arr)
						.filter(num -> num == v)
						.toArray();
		bw.write(String.valueOf(filteredArr.length));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}
