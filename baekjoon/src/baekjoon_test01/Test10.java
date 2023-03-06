/*
 * 2588번
 * Q. (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * 		    4 7 2  ......(1)
 * 		*	3 8 5  ......(2)
 *  --------------
 * 		  2 3 6 0  ......(3)
 * 		3 7 7 6    ......(4)
 *    1 4 1 6      ......(5)
 *  --------------
 *    1 8 1 7 2 0  ......(6)
 *  (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 출력: 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
package baekjoon_test01;

import java.util.*;

public class Test10 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int i = b%10;
		int j = (b%100)/10;
		int k = b/100;
		
		System.out.println(a*i);
		System.out.println(a*j);
		System.out.println(a*k);
		System.out.println(a*b);
	
	}
	
}
