import java.util.*;
import java.io.*;

public class Solution2738 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] result = new int[N][M];

		for (int i = 0; i < N; i++) {
			StringTokenizer ia = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(ia.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			StringTokenizer ia = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				B[i][j] = Integer.parseInt(ia.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				bw.write(String.valueOf(A[i][j] + B[i][j] + " "));
			}
			bw.newLine();
		}
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}
}
