public class TryCatchRuntimeEx {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
            System.out.println("실행방법");
            System.out.println("java TryCatchRuntimeEx num1 num2");
            return;
        }

        try { //오류 발생 가능성이 있는 소스코드
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1+value2;
            System.out.println(data1 + " + " + data2 + " = "+ result);

        }catch (NumberFormatException e){ // 오류가 발생 했을때 실행할 소스 코드
            System.out.println("숫자로 반환할 수 없습니다.");
        }
        finally {//오류가 발생해도, 발생하지 않아도 무조건 실행하는 코드, 외부 리소스 사용시 필수로 사용, 리소스 해제를 위해 사용
            System.out.println("다시 실행하세요");
        }
        System.out.println ("\n-----프로그램을 종료합니다.-----\n");
    }
}
