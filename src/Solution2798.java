import java.io.*;
import java.util.*;

public class Solution2798 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());

		int[] cards = new int[st2.countTokens()];

		for (int i = 0; i < cards.length; i++) {
			cards[i] = Integer.parseInt(st2.nextToken());
		}

		int maxSum = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					if (sum <= M && sum > maxSum) {
						maxSum = sum;
					}
				}
			}
		}

		bw.write(String.valueOf(maxSum));

		bw.flush();
		bw.close();
		br.close();
	}
}

