import java.io.*;

public class Solution1018 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		char[][] board = new char[N][M];

		for (int i = 0; i < N; i++) {
			board[i] = br.readLine().toCharArray();
		}

		int minPaint = Integer.MAX_VALUE;

		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				minPaint = Math.min(minPaint, repaintCount(board, i, j));
			}
		}

		bw.write(String.valueOf(minPaint));
		bw.flush();
		bw.close();
		br.close();
	}

	// 주어진 위치에서 8*8 체스판을 만들기 위해 다시 칠해야하는 갯수 계산
	private static int repaintCount(char[][] board, int x, int y) {
		int count1 = 0; // 왼쪽 상단이 'W'
		int count2 = 0; // 왼쪽 상단이 'B'

		char[] colors = {'W', 'B'};

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[x + i][y + j] != colors[(i + j) % 2]) {
					count1++;
				}
				if (board[x + i][y + j] != colors[1 - (i + j) % 2]) {
					count2++;
				}
			}
		}
		return Math.min(count1, count2);
	}
}
