public class TryCatchEx {
    public static void main(String[] args) {
        try { //오류가 발생 가능성이 있는  소스 입력
            Class clazz= Class.forName("java.lang.String2");
        }
        catch (Exception e){ // 오류가 발생 했을때 실행할 소스
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
