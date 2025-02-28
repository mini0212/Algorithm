import java.io.*;
import java.util.*;

public class Solution10816 {
	public static void run() throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		Map<Integer, Integer> cardCount = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(cardCount.getOrDefault(num, 0)).append(" ");
		}
		System.out.println(sb);
		br.close();
	}
}
