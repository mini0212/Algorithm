import java.io.*;
import java.util.StringTokenizer;

public class Solution1546 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		double[] points = new double[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		double M = 0;
		for (int i = 0; i < N; i++) {
			double point = Double.parseDouble(st.nextToken());
			if (M < point) {
				M = point;
			}
			points[i] = point;
		}
		double sum = 0;
		for (int i = 0; i < N; i++) {
			sum += (points[i] / M) * 100 ;
		}


		bw.write(String.valueOf(sum / N));
		bw.flush();
		bw.close();
		br.close();
	}
}
