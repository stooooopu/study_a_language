//### 문제설명 
//    이름,주소,나이 알아내기
//### 입출력 예
//    name : brian
//    addr : daejeon
//    age : 30
	public static void main(String[] args) {

        String query = "name=brian&addr=daejeon&age=30";
        String name = "";
        String addr = "";
        int age = 0;
        String apple[] = query.split("&");
//        name = apple[0].replace("name=", "");
//        addr = apple[1].replace("addr=", "");
//        age = Integer.parseInt(apple[2].replace("age=", ""));
        for(int i=0; i<apple.length; i++) {
        	String array[] = apple[i].split("="); //split을 두번 쓰는게 키포인트☆★
        	for(int j=0; j<array.length; j++) {
        		if(i==0) {
        			name =array[j];
        		}
        		if(i==1) {
        			addr = array[j];
        		}
        		if(i==2) {
        			if(j==1) {
        			age = Integer.parseInt(array[j]);
        			}
        		}
        	}
        }
        	
        
        
        
        System.out.println("name : "+name);
        System.out.println("addr : "+addr);
        System.out.println("age : "+age);
	}