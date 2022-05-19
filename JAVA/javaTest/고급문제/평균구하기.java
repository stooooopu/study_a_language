//	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//	제한 조건
//	1. 정수형 타입 배열이 파라미터에 있어야 함.o
//	2. return 타입은 double.o
//	3. 메소드 이름은 solution.o
//	4. int형으로 나누면 소수점이 무시됩니다.
//	입출력 예
//	arr : [1,2,3,4], return : 2.5
//	arr : [5,5], return : 5

	public static double solution (int[] array, int x) {
		int sum=0;
		for (int i=0; i<array.length; i++) 
        {
			sum = sum+array[i];
		}
		return sum/x;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int len = arr.length;
		double avg = 0;
		avg = solution(arr,len);
		System.out.println(avg);
	}