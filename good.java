package ch01;
import java.util.*;
import java.util.Scanner;
import java.util.Vector;


public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap <String,String> dic = new HashMap<String, String>();
		System.out.println("영어단어와 뜻을 입력하세요");
		for(int i=0; i<3; i++) {
			String eng = scanner.next();
			if(dic.containsKey(eng)) {
				System.out.println("다시 입력하세요");
				i--;
				continue;
			}
			else {
				String kor = scanner.next();
				dic.put(eng, kor);
			}
		}
			while (true) {
			System.out.println("영어단어를 입력하세요");
			String engl = scanner.next();
			String kore;
			if(engl.equals("exit")) {System.out.println("입력을 종료합니다."); break;};
			kore = dic.get(engl);
			if(kore == null) {
				System.out.println(engl +"는 없는 단어입니다");
			}
			else System.out.println(kore);
		}
		scanner.close();
	}
}

