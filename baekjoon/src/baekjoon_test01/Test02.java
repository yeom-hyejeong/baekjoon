/*
 * 1000번
 * Q. 두 정수  A와 B를 입력 받은 다음, A+B를 출력하는 프로그램을 작성
 * 입력: 첫째 줄에 A와 B가 주어진다.(0<A, B<10)
 * 출력: A+B
 */
package baekjoon_test01;

import java.util.Scanner;

public class Test02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(a+b);
	}
}
