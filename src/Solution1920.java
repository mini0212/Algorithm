import java.io.*;
import java.util.*;

public class Solution1920 {
	public static void run() throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> numberSet = new HashSet<>(Arrays.asList(br.readLine().split(" ")));
		int M = Integer.parseInt(br.readLine());
		String[] strings2 = br.readLine().split(" ");

		for (int i = 0; i < M; i++) {
			boolean hasItem = numberSet.contains(strings2[i]);
			System.out.println(hasItem ? "1" : 0);
		}
		br.close();
	}
}
