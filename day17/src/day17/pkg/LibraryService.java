package day17.pkg;

import java.util.*;

public class LibraryService {
	private int bookNumber = 0;
	private int clientNumber;
	private String bookName = "";
	private String author = "";
	Scanner scan = new Scanner(System.in);

	List<LibraryDTO> regis(List<LibraryDTO> text) {
		LibraryDTO l1 = new LibraryDTO();
		bookNumber = text.size() + 1;
		System.out.print("도서명을 입력하세요 : ");
		bookName = scan.next();
		System.out.print("저자를 입력하세요 : ");
		author = scan.next();
		l1.setBookName(bookName);
		l1.setAuthor(author);
		l1.setBookNumber(bookNumber);
		text.add(l1);
		return text;
	}

	List<LibraryDTO> borrow(List<LibraryDTO> text) {

		LibraryDTO l1 = new LibraryDTO();
		System.out.print("고객 번호를 입력하세요 : ");
		clientNumber = scan.nextInt();
		System.out.print("빌릴책 번호를 입력하세요 :");
		bookNumber = scan.nextInt();
		for (int i = 0; i < text.size(); i++) {
			if (bookNumber == text.get(i).getBookNumber() && text.get(i).isCheck() == true) {
				System.out.println("대출이 불가능합니다.");
			}
			if (bookNumber == text.get(i).getBookNumber()&& text.get(i).isCheck() == false) {
				System.out.println("대출이 완료되었습니다.");
				text.get(i).setCheck(true);
				text.get(i).setClientNumber(clientNumber);
			}
		}
		return text;
	}

	List<LibraryDTO> bookList(List<LibraryDTO> text) {
		for (int i = 0; i < text.size(); i++) {
			System.out.println(text.get(i));
		}
		return text;
	}

	List<MemberDTO> memberList(List<MemberDTO> text) {
		for (int i = 0; i < text.size(); i++) {
			System.out.println(text.get(i));
		}
		return text;
	}

}
