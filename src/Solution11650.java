import java.io.*;
import java.util.*;

public class Solution11650 {
	public static void run() throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[][] numbers = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			numbers[i][0] = Integer.parseInt(st.nextToken());
			numbers[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(numbers, (n1, n2) -> {
			if (n1[0] == n2[0]) {
				return Integer.compare(n1[1], n2[1]);
			}
			return Integer.compare(n1[0], n2[0]);
		});

		for (int[] number : numbers) {
			bw.write(number[0] + " " + number[1]);
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
