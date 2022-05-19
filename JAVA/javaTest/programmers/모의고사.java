package 문제풀이;

import java.util.Arrays;
import java.util.Collections;

public class 고급문제_수포자 {
//	문제 설명
//	수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
//	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
//	가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//	제한 조건
//	시험은 최대 10,000 문제로 구성되어있습니다.
//	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
//	입출력 예
//	answers	return
//	[1,2,3,4,5]	[1]
//	[1,3,2,4,2]	[1,2,3]
//	입출력 예 설명
//	입출력 예 #1
//	수포자 1은 모든 문제를 맞혔습니다.
//	수포자 2는 모든 문제를 틀렸습니다.
//	수포자 3은 모든 문제를 틀렸습니다.
//	따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
//	입출력 예 #2
//	모든 사람이 2문제씩을 맞췄습니다.
		public static void main(String[] args) {
			
			int answer[] = {1,2,3,4,5};//{}값이 입력될 수 있게 method만들기
			int person1[] = {1,2,3,4,5};
			int person2[] = {2,1,2,3,2,4,2,5};
			int person3[] = {3,3,1,1,2,2,4,4,5,5};
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			for (int i=0; i<answer.length; i++) {
				for (int j=0; j<person1.length; j++) {
				if(i==j) if(answer[i]==person1[j]) {
						++count1;
					}
				}for (int j=0; j<person2.length; j++) {
					if(i==j) if(answer[i]==person2[j]) {
						++count2;
					}
				}for (int j=0; j<person3.length; j++) {
					if (i==j) if(answer[i]==person3[j]){
						++count3;
						}
					}
				}
			
//			이제 count끼리 큰수 비교해야하고, 결과값이 0이면 걍 출력 말아야 하는데
//			그걸 어떻게 하는데욥
			Integer[] array= {count1 ,count2, count3};
			
			Arrays.sort(array, Collections.reverseOrder());
			
			for (int i=0; i<array.length; i++) {
				System.out.print(array[i]);
			}
//			이건 총 정답수를 내림차순한거
//			내가 원하는건 어떤 변수가 더 많이 맞췄는지 내림차순으로 보는 것
//			그럼 count들을 비교해서 가장 큰수만 보여줘야지!
			
			
			
			
			
			
			
			
			
			
			
			
		}
}