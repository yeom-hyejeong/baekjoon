/*
 * 10809번
 * Q. 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 출력: 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 */
package baekjoon_test05;

import java.io.*;

public class Test06 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int arr[] = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}//a부터 z까지 값을 -1로 설정
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i); //문자열을 ch로 두고
			
			if(arr[ch-'a']==-1) {//문자열에서 a를 뺐을 때 -1은 문자열에 있는 알파벳(ch-'a')는 arr의 인덱스
				arr[ch-'a']= i;//위치를 나타내야 하니까 그 위치는 i-문자열의 인덱스
			}
		}
		for(int j : arr) {
			System.out.print(j+" ");
		}
	}
}
