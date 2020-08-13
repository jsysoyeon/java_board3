import java.util.Scanner; // scanner를 사용하기 위함
import java.util.*; // arraylist를 사용하기 위함

class Main {
  public static void main(String[] args) {
	  // 입력받는 함수
    Scanner sc = new Scanner(System.in);
    ArrayList<String> Titles = new ArrayList<>();
    ArrayList<String> Bodies = new ArrayList<>();
    String title;
    String body;
    int cnt = 0;
    // print 클래스 호출
    print p = new print();
    
    while(true) {
    	// print 클래스 안의 menu 메소드 호출
		System.out.println("-------------------------");
    	p.menu();
		System.out.println("-------------------------");
    	String s = sc.nextLine();
    	if(s.equals("exit")) {
    		System.out.println("프로그램을 종료합니다.");
    		break;
    	}
    	else if(s.equals("add")) {
    		System.out.println("제목을 입력하시오.");
    		title = sc.nextLine();
    		// title에 입력된 값을 Titles에 저장
    		Titles.add(title);
    		System.out.println("내용을 입력하시오.");
    		body = sc.nextLine();
    		// body에 입력된 값을 Bodies에 저장
    		Bodies.add(body);
    		cnt++;
    	}
    	else if(s.equals("list")) {
    		for(int i = 0; i < cnt; i++) {
    			System.out.println("");
    			System.out.println((i + 1) + "번째");
    			// Titles에 저장된 값을 불러오는 함수(get())
    			System.out.println("제목 : " + Titles.get(i));
    			// Bodies에 저장된 값을 불러오는 함수(get())
    			System.out.println("내용 : " + Bodies.get(i));
    		}
			System.out.println("");
    	}
    }
    
  }
}

class print {
	void menu() {
		System.out.println("원하는 기능에 맞게 입력해주십시오.");
		System.out.println("게시물 추가 : add");
		System.out.println("게시물 조회 : list");
		System.out.println("프로그램 종료 : exit");
	}
}