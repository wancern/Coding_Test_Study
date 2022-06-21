package Programmers;

public class Tiling3xn_Prog {
	public int solution(int n) {
		int answer = 0;

		long[] dp = new long[5001];

		dp[0] = 1;
		dp[2] = 3;

		for (int i = 4; i <= n; i += 2) {
			dp[i] = dp[i - 2] * 3;
			for (int j = 0; j < i - 2; j += 2) {
				dp[i] += dp[j] * 2;
			}
			dp[i] = dp[i] % 1000000007;
		}
		answer = (int) dp[n];

		return answer;
	}
}
