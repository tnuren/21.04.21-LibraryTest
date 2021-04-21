package day17.pkg;

import java.util.*;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int select = 0;
		List<LibraryDTO> text = new ArrayList<LibraryDTO>();
		List<MemberDTO> text2 = new ArrayList<MemberDTO>();
		LibraryService ls = new LibraryService();
		String name = "";
		String number = "";
		int clientNumber = 0;

		while (run) {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1. 회원등록  ㅣ  2. 도서등록  ㅣ  3. 도서대출  ㅣ  4. 도서목록  ㅣ  5. 회원목록  ㅣ 6. 종료  ");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("선택 > ");
			select = scan.nextInt();

			if (select == 1) {
				MemberDTO l1 = new MemberDTO();
				clientNumber = text2.size() + 1;
				l1.setClientNumber(clientNumber);
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();
				l1.setName(name);
				System.out.print("전화번호를 입력하세요 : ");
				number = scan.next();
				l1.setNumber(number);
				text2.add(l1);
			} else if (select == 2) {
				text = ls.regis(text);
			} else if (select == 3) {
				text = ls.borrow(text);
			} else if (select == 4) {
				text = ls.bookList(text);
			} else if (select == 5) {
				text2 =ls.memberList(text2);
			} else if (select == 6) {
				System.out.print("종료합니다.");
				run = false;
			}
		}

	}

}
