package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneApp {
	public static void main(String[] args) throws IOException {
		//메모장 내용 정리
		ArrayList<Person> pList=new ArrayList<>();
		Reader fr=new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br=new BufferedReader(fr);

		while(true) {
			String str=br.readLine();

			if(str==null) {
				break;
			}
			Person p=new Person(str.split(","));
			pList.add(p);		
		}

		Scanner s=new Scanner(System.in);
		System.out.println("******************************");
		System.out.println("*      전화번호 관리 프로그램      *");
		System.out.println("******************************");
		int num;
		
		do {
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료 ");
			System.out.println("-------------------------------");
			System.out.print(">메뉴번호: ");
			num=s.nextInt();

			switch(num) {
			case 1:
				System.out.println("<1.리스트>");
				for (int i=0; i<pList.size(); i++) {
					System.out.print(i+1+". ");
					pList.get(i).showInfo();
				}
				break;
			case 2:
				s.nextLine();
				System.out.println("<2.등록>");
				System.out.print(">이름: ");
				String name=s.nextLine();
				System.out.print(">휴대전화: ");
				String hp=s.nextLine();
				System.out.print(">회사전화: ");
				String company=s.nextLine();
				Person p=new Person(name, hp, company);
				pList.add(p);
				System.out.println("[등록되었습니다.]");
				break;
			case 3:
				System.out.println("<3.삭제>");
				System.out.print(">번호 : ");
				int a=s.nextInt();
				for (int i=0; i<pList.size(); i++) {
			        if ((i+1)==a) {
			            pList.remove(i);
			        }
				}
				System.out.println("[삭제되었습니다.]");
				break;
			case 4:
				s.nextLine();
				System.out.println("<4.검색>");
				System.out.print(">이름: ");
				String search=s.nextLine();
				    for (int i=0; i<pList.size(); i++) {
				        if (pList.get(i).getName().contains(search)) {
							System.out.print(i+1+". ");
				            pList.get(i).showInfo();
				        }
				    }
				break;
			case 5:
				System.out.println("*****************************");
				System.out.println("*          감사합니다          *");
				System.out.println("*****************************");
				break;
			default:
				System.out.println("[다시 입력해 주세요.]");
			}
		}while(num!=5);
	}

}
