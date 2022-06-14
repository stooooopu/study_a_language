# pagination
1. package utils생성 
```java
@Data
@Component
public class PageHandler {
	private int total; // 전체 게시물 수
	private int pageNum; // 현재 페이지
	private int pageSize; // 1페이지당 최대 게시물 수
	private int startPage; // 현재블록 첫 페이지
	private int endPage; // 현재블록 마지막 페이지
	private boolean hasPreviousPage = true; // 이전버튼 유무
	private boolean hasNextPage = true; // 다음버튼 유무
	private int nowBlock; // 현재 블록
	private int lastBlock; // 마지막 블록
	private int navigaterPages; //한 블록 최대 페이지 수
}
```
## 총 페이지 수
총 페이지 수 = 전체 게시물 수 / 한 페이지 최대 게시물 수
```java
public int calcPage(int total, int pageSize) {
		int pages = total/pageSize;
		if(total%pageSize > 0) ++pages;
		return pages;
	}
```

## 현재 페이지 블록 알아내기
현재 페이지 블록 = 현재페이지/한 블록 최대 페이지 수
```java
public void setNowBlock(int pageNum, int navigatePages) {
		this.nowBlock = pageNum/navigatePages;
		if(pageNum % navigaterPages > 0) {
            ++this.nowBlock;
        }
    }
```

## 마지막 블록 알아내기
마지막블록 = 전체 게시물 수/(한 블록 최대 페이지 수 * 한 페이지 최대 게시글 수)  
- 한 블록 최대 페이지 수 * 한 페이지 최대 게시글 수  
= 한 블록에 들어갈 수 있는 최대 게시글 수
```java
public void setLastBlock(int total) {
		this.lastBlock = total / (this.navigaterPages * this.pageSize);
		if(total % (this.navigaterPages * this.pageSize) > 0)  ++this.lastBlock;
	}
```

## 현재블록의 시작 페이지
시작페이지 = (현재 블록 * 한 블록 최대 페이지 수) - (한 블록 최대 페이지 수 - 1)
- 다음 버튼을 눌렀을 때 다음 블록의 시작을 정해줌
```java
public void setStartPage(int nowBlock) {
		this.startPage = (nowBlock * this.navigaterPages) - (this.navigaterPages - 1);
	}
```
```
1블록 시작페이지
한 블록 최대 페이지 수 = 10
(1 * 10) - (10 - 1) = 시작페이지는 1
(2 * 10) - (10 - 1) = 시작페이지는 11
```

## 현재블록의 마지막 페이지
마지막 페이지 = 현재블록 * 한블록 최대 페이지 수
```java
public void setEndPage(int lastBlock, int pages) {
		this.endPage = nowBlock * this.navigaterPages;
		if(nowBlock == this.lastBlock) {
			this.endPage = pages;
		}
	}
```

## 이전버튼, 다음버튼 유무 판단
```java
public void setPreNext(int pageNum) {
		
		// 마지막 블록 == 1 이라면 이전, 다음버튼 없음
		if(this.lastBlock == 1) {
			setHasPreviousPage(false);
			setHasNextPage(false);
		}
		
		// 현재 블록이 마지막 블록일 경우
		// 마지막 블록 > 1 & 마지막 블록 == 지금 블록
		if(this.lastBlock > 1 && this.lastBlock == this.nowBlock) {
			setHasPreviousPage(true);
			setHasNextPage(false);
		}
		// 마지막 블록 > 1 & 현재 페이지 <= 한블록 최대 페이지 수
		if(this.lastBlock > 1 && pageNum <= this.navigaterPages) {
			setHasPreviousPage(false);
			setHasNextPage(true);
		}
	}
```