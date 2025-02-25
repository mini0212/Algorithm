import java.io.*;
public class Solution9086 {
	public static void run() throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int ts = Integer.parseInt(br.readLine());

		for (int i = 0; i < ts; i++) {
			String input = br.readLine();
			char first = input.charAt(0);
			char last = input.charAt(input.length() - 1);
			bw.write(String.valueOf(first) + String.valueOf(last));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
