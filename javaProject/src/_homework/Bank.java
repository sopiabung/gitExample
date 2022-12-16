package _homework;

import java.util.Scanner;

//scanner, 객체, 무한루프 //MyFirstProject
public class Bank {

	String account; //계좌번호
	private int deposit; //예금액
	private int withdraw; //출금액
	private int balance; //잔고
	private int pick; // 고객 선택숫자

	//잔고 계산용
	public void plus() {
		balance += deposit;
	}
	public void minus() {
		balance -= withdraw;
	}

	//메뉴 안내문구용
	public void menu() {
		System.out.println("개설을 원하시는 계좌번호를 적어주세요. ('-'포함)");
		Scanner a = new Scanner(System.in);
		account = a.next();
		System.out.println(account + " 계좌가 개설되었습니다.");
		for(;;) {
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			Scanner p = new Scanner(System.in);
			pick = p.nextInt(); //고른메뉴로 들어간다.
			//메뉴 선택후
			if(pick == 1) {
				System.out.print("예금액 > ");
				Scanner money = new Scanner(System.in);
				deposit = money.nextInt();
				plus();
			}else if(pick == 2) {
				System.out.print("출금액 > ");
				Scanner money = new Scanner(System.in);
				withdraw = money.nextInt();
				minus();
			}else if(pick == 3) {
				System.out.println("잔고액 > "+ balance);
			}else if(pick == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}

	}
}
