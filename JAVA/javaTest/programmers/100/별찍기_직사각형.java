//### 입출력 예
//    a : 5,  b : 3 
//    *****
//    *****
//    *****
//    a : 2,  b : 2 
//    **
//    **
//### 문제 설명
//    이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//    별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
//### 제한 조건
//    1. n과 m은 각각 1000 이하인 자연수입니다.
//    2. System.out.print()를 사용하면 가로로 출력됩니다.(한줄로 쭉 작성)
//    3. System.out.println()는 개행문자(엔터를 입력한 것 처럼).
	public static void main(String[] args) {
		int m = 2;
		int n = 5;
		for (int i=0; i<m; ++i) {
			for (int j=0; j<n; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	programmers 별찍기
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    for (int i=0; i<b; i++) {
    	for (int j=0; j<a; j++) {
    		System.out.print("*");
    	}System.out.println();
    }
        System.out.println();
    }
}