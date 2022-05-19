//### 문제설명
//    저글링이 무리지어서 테란을 공격을 하고있다.
//    공격을 방어하고 승리한 횟수를 찾아내자.
//
//### 제한사항
//- 메소드와 변수는 아래와 같이 선언.
//- 마린은 히드라를 이길 수 없습니다.
//- 벌처는 저글링과 히드라를 이길 수 있습니다.
//- count배열에 이긴 횟수를 대입해야합니다. 
//- 0번째 인덱스에는 마린 승리 횟수가 오고, 1번째 인덱스에는 벌처 승리 횟수가 옵니다.
//	### 입출력 예
//    4, 5
//	public static int[] getList(String array[]){
//	        int count[] = {0,0};
//	        String 유닛[] = {"마린","벌처"};
//	        int len = 유닛.length;
////	        int 마린승 = 0;
////	        int 벌처승 = 0;
//	        for (int i=0; i<len; i++) {
//	        	for (int j=0; j<array.length; j++) {
//	        		String unitName = 유닛[i];
//	        		String monsterName = array[j];
//	        		if(unitName.equals("마린")) {
//	        			if(monsterName.equals("저글링")) {
//	        				++count[0];
//	        			}
//	        		}
//	        		if(unitName.equals("벌처")) {
//	        			if(monsterName.equals("저글링") || monsterName.equals("히드라")) {
//	        				++count[1];
//	        			}
//	        		}
//	        	}
//	        }
//	        return count;
//	}
//	public static void main(String[] args) {
//        String array[] = {"저글링","저글링","저글링","히드라","저글링"};
//        int 승리 [] = getList(array);
//        for(int i : 승리){
//            System.out.print(i+", ");
//	}
//
//}
	
	   public static int[] getList(String array[]){
	        int count[] = {0,0};
	        String 유닛[] = {"마린","벌처"};
	        for(int i=0; i<array.length; i++) {
	        	if(유닛[0].equals("마린")) {
	        		if(array[i].equals("저글링")) {
	        			++count[0];
	        		}if(유닛[1].equals("벌처")) {
	        			if(array[i].equals("저글링") || array[i].equals("히드라")) {
	        				++count[1];
	        			}
	        		}
	        	}
	        }
	        
	        return count;
	   }

	   public static void main(String[] args){
	        String array[] = {"저글링","저글링","저글링","히드라","저글링"};
	        int 승리 [] = getList(array);
	        for(int i : 승리){
	            System.out.print(i+", ");
	        }
	   }