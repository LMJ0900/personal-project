package bankpratice;

import java.util.Scanner;

public class Bank {


   /* 광호는 비트 은행에 가입하고 싶어요
    비트 은행은 사용자로부터
            이름
    전화번호
            비밀번호

    로그인(비밀번호 받기)시 3번의 기회가 주어지며
3번이 틀릴 경우 경고 메세지를 출력하며
    전화번호를 출력한다.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []info = new String[3];

        System.out.println("이름을 입력하세요");
        info[0] = sc.next();
        System.out.println("전화번호를 입력하세요");
        info[1] = sc.next();
        System.out.println("비밀번호 네자리를 입력하세요");
        info[2] = sc.next();


        System.out.println("비밀번호를 입력하세요");
        for(int i=0; i < 3; i++){
            String passAc = sc.next();
            if(passAc.equals(info[2])){
                System.out.println("확인 되셨습니다.");
                break;
            }else if(i < 2){
                System.out.println("다시 입력해주세요");
            }
            else {
                System.out.println("전화번호는 " + info[1] + "입니다.");

            }
        }


    }
}

