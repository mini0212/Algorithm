import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Solution5597 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = IntStream.rangeClosed(1, 30).toArray();

		for (int i = 1; i <= 28; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());

			arr = Arrays.stream(arr)
							.filter(n -> n != num)
							.toArray();

		}
		Arrays.sort(arr);
		bw.write(String.valueOf(arr[0]));
		bw.newLine();
		bw.write(String.valueOf(arr[1]));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}
