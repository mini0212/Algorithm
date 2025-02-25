import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Solution4153 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line;
		while (!Objects.equals(line = br.readLine(), "0 0 0")) {
			StringTokenizer st = new StringTokenizer(line);
			int[] arr = Arrays.stream(line.split(" "))
							.mapToInt(Integer::parseInt)
							.sorted()
							.toArray();


			if ((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2])) {
				bw.write("right");
			} else {
				bw.write("wrong");
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
