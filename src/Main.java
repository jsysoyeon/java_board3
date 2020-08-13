import java.util.Scanner; // scanner 사용하기 위한 참조값
import java.util.*; // arraylist 사용하기 위한 참조값

class Main {
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  // 배열 대신 arraylist 사용
	  ArrayList<String> Titles = new ArrayList<>();
	  ArrayList<String> Bodies = new ArrayList<>();
	  String title;
	  String body;
	  int cnt = 0;
	  
	  while(true) {
		  String s = sc.nextLine();
		  
		  // 입력값이 exit인지 아닌지 확인 후 exit일 시 프로그램 종료
		  if(s.equals("exit")) {
			  System.out.println("프로그램을 종료합니다.");
			  break;
		  }
		  // 입력값이 add인지 아닌지 확인후 add일 시 게시물 추가
		  else if(s.equals("add")) {
			  System.out.println("제목을 입력하시오.");
			  title = sc.nextLine();
			  // arraylist에 입력값 저장
			  Titles.add(title);
			  System.out.println("내용을 입력하시오.");
			  body = sc.nextLine();
			  // arraylist에 입력값 저장
			  Bodies.add(body);
			  cnt++;
		  }
		  // 입력값이 list인지 아닌지 확인 후 list일 시 게시물 조회
		  else if(s.equals("list")) {
			  for(int i = 0; i < cnt; i++) {
				  System.out.println("제목 : ");
				  // arraylist에 저장된 입력값 불러오기
				  System.out.println(Titles.get(i));
				  System.out.println("내용 : ");
				  // arraylist에 저장된 입력값 불러오기
				  System.out.println(Bodies.get(i));
				  System.out.println("");
			  }
		  }
	  }
    
  }
}

class print {
	
}