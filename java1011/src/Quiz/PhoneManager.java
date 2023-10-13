package Quiz;

import java.util.Scanner;

public class PhoneManager {
    public static void main(String[] args) {
//        사용자 키보드 입력을 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

//        저장할 데이터 수, Phone 클래스의 배열크기를 설정
        System.out.println("인원수 >>");
        int count = sc.nextInt();
//      입력받은 count를 이용하여 Phone 클래스 타입의 배열 선언, 배열 크기 설정
        Phone[] phonebook = new Phone[count];

//      사용자에게 입력 받을 이름과 전화번호를 저장할 변수 선언
        String name = ""; //빈 문자열로 초기화
        String tel = "";
//      반복문을 사용하여 Phone 클래스 타입의 배열의 크기만큼 사용자 정보 받아오기
        for (int i = 0; i < phonebook.length; i++) {
            System.out.println("이름과 전화번호(번호는 연속적으로 입력)>>");
            name = sc.next();
            tel = sc.next();
//            클래스 타입의 배열을 선언시 해당 배열의 요소는 비어있음(null)
//            배열의 요소에는 null이 들어가 있으며, 해당 index에 new생성자()를 통해서 객체를 생성하여 입력해야 함
            phonebook[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

//        배열안에 있는 내용을 연속적으로 검색하여 출력하기 위해서 반복문 무한 루프를 사용
//        while(true) 반복문 무한반복 = for(;;)
        for (; ; ) {
            System.out.println("검색할 이름 >>");
            name = sc.next();
//            배열의 내용과 사용자가 입력한 이름이 일치하는지 여부를 저장할 변수
            boolean flag = false;
//            사용자 입력내용이 exit와 같으면 프로그램 종료
            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {

            }
//            사용자가 입력한 내용과 배열안의 내용이 일치하는지 전체 검색
            for (int i = 0; i < phonebook.length; i++) {
//                getName():Phone 클래스의 name 필드의 Getter 메소드
//                equals() : 문자열이 같은지 확인하는 메소드
                if (phonebook[i].getName().equals(name)) {
//                    같은 경우 내용출력
                    System.out.println(phonebook[i].getName() + "의 번호는 " + phonebook[i].getTel() + "입니다");
//                    변수에 사용자 내용과 배열에 저장된 내용이 같다는 의미로 논리데이터 값 입력
                    flag = true;

                    break;//for문 즉시 종료
                } else {
//                    배열과 사용자 입력 내용이 같지 않을 경우 false입력
                    flag = false;
                }
            }
//            flag 변수를 확인해서 값이 false이면 사용자가 입력한 내용과 배열의 모든 내용이 일치하지 않음
            if (flag == false) {
                System.out.println(name + "이 없습니다.");

            }
        }
    }
}
