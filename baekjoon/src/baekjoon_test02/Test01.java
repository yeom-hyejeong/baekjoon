/*
 * 1330번
 * Q. 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 출력: 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * 		- A가 B보다 큰 경우에는 '>'를 출력한다
 *  	- A가 B보다 작은 경우에는 '<'를 출력한다
 *  	- A와 B가 같은 경우에는 '=='를 출력한다.
 */
package baekjoon_test02;

import java.util.*;

public class Test01 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else if(a==b) {
			System.out.println("==");
		}
	}
}
