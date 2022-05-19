//	### 문제설명
//	철수는 명부작성에 이름과 온도를 쓰려고 한다.  
//	해당 명부에는 1페이지에 10명만 작성할 수 있다.  
//	명부에 58명이 작성했다고 가정하면 총 몇 페이지 명부가 작성되었을까?  
//	### 제한사항
//	- 아래 메소드 생성
//	- 명부는 100명 이하까지 작성 가능합니다.
//	### 입출력 예
//    6 페이지
    public static int calcPage(int totalCount, int rows) {
    	int pages = 0;//리턴값이 지정되어 있으면 변수지정해서 return값에 변수이름 넣어주기
    	if (totalCount<=100) {
    		pages = totalCount/rows;
    		if (totalCount%rows != 0) {
    			++pages;
    		}
    			}
        return pages;
    	}
//    	if (totalCount<=100 && totalCount%rows != 0) {
//    		pages = totalCount/rows;
//			pages++;
    

    public static void main(String[] args) {
        int totalCount = 58; //총 인원값
        int rows = 10; //1페이지에 작성할 수 있는 기준값
        int pages = calcPage(totalCount, rows);
        System.out.println(pages+" 페이지");
    }