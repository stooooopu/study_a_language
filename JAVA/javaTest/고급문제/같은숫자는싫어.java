package 메소드_문제;

public class 같은숫자는싫어 {
/*	### 문제 설명
    배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
    이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. array[i]값끼리 비교후 제거인데
    총 몇번을 제거 해야할까요?
- arr = [1, 1, 3, 3, 0, 1, 1] 이면 3을 return 합니다.
- arr = [4, 4, 4, 3, 3] 이면 3을 return 합니다.
### 제한 사항
1. 배열 arr의 크기(배열 길이) : 1,000,000 이하의 자연수 array.len<=1000000
2. 배열 arr의 원소(인덱스 값)의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수 array[i]<10/array[i]>=0
3. 아래 메소드 작성*/
//### 입출력 예
//    arr : {1,1,3,3,0,1,1} answer : 3    
//}
//      int[] answer = {};
    public static int solution(int []arr) {
        int count = 0;
        int len = arr.length;
        if(len<1000000) {
        	for(int i=0; i<len; i++) {
        		int iPlus = i + 1;
        		if(arr[i]>=0 && arr[i]<=9 && iPlus < len) {
        			int pre = arr[i];
        			int next = arr[iPlus];
        			if (pre == next) {
        				++count;
        			}
        		}
        	}
        }
        return count;
    }
    
	public static void main(String[] args) {
			int arr[] = {4, 4, 4, 3, 3};
			int count = solution(arr);
			System.out.println(count);
		}
	}
