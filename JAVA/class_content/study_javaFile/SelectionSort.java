package 선택정렬;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = {9, 6, 7, 3, 5};
		boolean isChange = false; // 교환여부 판단
		// 4회전 실행
		// 1회전 : 4번체크(최소값 찾기) / 2회전 : 3번체크
		for(int i=0; i<(array.length-1); i++) { //4회전 세팅
			int min = array[i]; //0번째를 초기값으로 세팅
			int index = 0; // 최소값의 위치변수
			for(int j=i+1; j<array.length; j++) {
				int jIndex = array[j];
				if(min>jIndex) {
					min = jIndex;
					index = j;
					isChange= true; //최소값이 있음
				}
			}
			if(isChange) {
				int temp = array[i];
				array[i] = min;
				array[index] = temp;
			}
			if(!isChange) {
				break;
			}
		}
//		// 최소값 구하기
//		int min = array[0]; // 현재 9입력
//		for(int i=1; i<array.length; i++) { //이미 0번째를 기준으로 잡았으니까 1부터 시작
//			if(min > array[i]) {
//				min = array[i];
//			}
//		}
	}
}
