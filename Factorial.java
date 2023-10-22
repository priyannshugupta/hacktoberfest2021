/*
Given a number N, print N!.

Input Format
First line of input contains T - number of test cases. Its followed by T lines, each containing a single number N.

Constraints
1 <= T <= 1000000
0 <= N <= 1000000

Output Format
For each test case, print N!. Since the result can be very large, print N! % 1e9+7.

Sample Input 
3
5
20
50
Sample Output 
120
146326063
318608048
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        long[] ar = new long[1000001];
        ar[0] = 1;
        int M = (int) 1e9 + 7;
        
        for(int i = 1; i <= 1000000; i++) {
            ar[i] = (ar[i - 1] * i) % M;
        }

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(inp.readLine());
        
        while (T-- > 0) {
            int N = Integer.parseInt(inp.readLine());
            System.out.println(ar[N]);
        }
    }
}
