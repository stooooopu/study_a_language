package 문제풀이;

import java.lang.reflect.Array;
import java.util.Arrays;

//문제 설명
//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행,같은 열의 값을 서로 더한 결과가 됩니다.
//2개의 행렬 arr1과 arr2를 입력받아,
//행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//제한 조건
//행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
//입출력 예
//	arr1			arr2			return
//[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//[[1],[2]]			[[3],[4]]		[[4],[6]]
public class 연습장_01 {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int [arr1.length][arr1[0].length];
		if (arr1.length < 500 && arr2.length < 500) {
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<arr1[i].length; j++) {
					answer[i][j]= arr1[i][j];
				}
			}for(int i=0; i<arr2.length; i++) {
				for (int j=0; j<arr2[i].length; j++) {
					answer[i][j] = answer[i][j]+arr2[i][j];
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		int[][] arr1 = { { 1 }, { 2 } };
		int[][] arr2 = { { 3 }, { 4 } };
		int[][] arr3 = solution(arr1, arr2);
		System.out.println(Arrays.deepToString(arr3));

	}
}
//입출력 전부 되는데 프로그래머스에서 
//프로그래머스에서는 main method가 없어도 되는걸 방금 알았다.
//앞으로 잘 해야지
//하지만 인간은 같은 실수를 반복 하겠지
//나 또한 인간이고...
//정확성: 94.1
// 합계: 94.1 / 100.0