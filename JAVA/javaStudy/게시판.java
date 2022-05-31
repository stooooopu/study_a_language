package 페이징;

public class PageHandler {

	public static void main(String[] args) {
		// 여신강림 페이징
		// 야옹이 작가는 210화까지 연재함
		
		//게시물 수 : total / 총 페이지 수 : pages / 한 페이지 기준 몇개의 개시물 : pageSize
		// 한 블록에 몇 페이지  : navigaterPages  / 몇 블록 : blocks / 	현재 페이지 : pageNum
		
		
		// step1. 페이지 수 알아내기 (총 카운트와 한 페이지에 몇 개를 보여줄지가 중요)
		int total = 211; // sql query에서 count
		
		// 네이버 웹툰 기준으로 한 페이지에 10개의 게시물을 보여줄 수 있음
		int pages = 0;
		int pageSize = 10;
		if(total%pageSize==0) {
			pages = total/pageSize;
		} else {
			pages = total/pageSize + 1;
		}
		// 총 몇 페이지가 나옴?
		System.out.println("총 페이지 수 ==> "+pages);
		
		
		
		
		// step2. 한 블록에 몇 페이지를 보여줄지 정하기
		int navigaterPages = 10; // 한 블록에 총 10개의 페이지를 보여줌 (1~10)
		
		int blocks = 0;
		
		blocks = pages / navigaterPages;
		if(pages % navigaterPages > 0) ++blocks;
		System.out.println("총 블록 수 ==> "+blocks);
		
		
		
		
		// step3. 현재 내가 위치한 블록 알아내기
		int pageNum = 21; // 현재 페이지
		int nowBlock = 0;
		// 현재 페이지를 이용해서 몇번째 블록에 있는지 알아내기
		nowBlock = pageNum / navigaterPages;
		if(pageNum % navigaterPages > 0) ++nowBlock;
		System.out.println("현재 블록은 ==>"+nowBlock);
		
		
		
		
		// step4. 마지막 블록 알아내기
		// 총 블록수와 같지만 다양한 방법으로 하기 위해서 
		int lastBlock = 0;
		// hint : total, navigaterPages, pageSize
		lastBlock = total / (navigaterPages * pageSize);
		if(total % (navigaterPages * pageSize) > 0) {
			++lastBlock;
		}
		System.out.println("마지막 블록은 ==>"+lastBlock);
		
		
		
		
		// step5. 현재 내가 위치한 블록의 첫페이지와 마지막페이지 구하기
		// ex) 1 블록 : 1~10 / 2블록 :11~20 / 3블록 21~22 
		int startPage = 0;
		int endPage = 0;
		// startPage = (nowBlock - 1) * navigaterPages + 1;
		startPage = (nowBlock * navigaterPages) - (navigaterPages - 1);
		endPage = nowBlock*navigaterPages;
		if(nowBlock==lastBlock) {
			endPage = pages;
		}
		System.out.println("시작 페이지 ==>"+startPage);
		System.out.println("마지막 페이지 ==>"+endPage);
		
		// step6. 이전버튼 다음 버튼 유무 판단
		boolean hasPreviousPage = true; // 이전 버튼
		boolean hasNextPage = true;
	
		if(lastBlock == 1) {
			hasPreviousPage = false;
			hasNextPage = false;
		}
		if(lastBlock > 1 && lastBlock == nowBlock) { // 마지막 블록이라면 이전버튼만 존재
			hasPreviousPage = true;
			hasNextPage = false;
		}
		if(lastBlock > 1 && pageNum <= navigaterPages) { // 첫 번째 블록인데 블록이 1 이상일 경우 다음버튼 존재
			hasPreviousPage = false;
			hasNextPage = true;
		}
		
		System.out.println("이전 버튼 있습니까 ==>"+hasPreviousPage);
		System.out.println("다음 버튼 있습니까 ==>"+hasNextPage);
	}
}
