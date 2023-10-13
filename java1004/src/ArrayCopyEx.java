import java.util.Arrays;

public class ArrayCopyEx {
    public static void main(String[] args) {
        System.out.println("\n----- 배열의 복사 -----\n");
//        얕은 복사 ,깊은 복사
//        얕은 복사 : 배열 A를 배열 B에 단순 대입, 배열 A의 주소를 배열 B에 복사함
//        -배열 A와 배열 B가 같은 주소를 공유하고 있기 때문에 한쪽에서 데이터 변경시 다른배열의 데이터도 함께 변경됨

//        깊은 복사: 배열 A의 내욜을 모두 배열 B로 복사, 배열 A의 주소와 배열의 B의 주소가 서로 다르기 때문에 한쪽에서 데이터 변경시에도 다른쪽에서의 데이터 변경이 없음
        System.out.println("\n----- 얕은 복사 -----\n");

        int[] iArr1 = {10, 20, 30};
        int[] iArr2 = null;

        System.out.println("원본 배열 iArr1 : " + iArr1);
        for (int i = 0; i < iArr1.length; i++) {
            System.out.println("iArr1 [" + i + "] : " + iArr1[i]);
        }
        System.out.println("원본 배열 iArr2 : " + iArr2);
//        배열 iArr1의 값을 배열 iArr2에 단순 대입
        iArr2 = iArr1;

        System.out.println("\niArr2에 iArr1을 복사후 \n");
        for (int i = 0; i < iArr1.length; i++) {
            System.out.println("iArr1 [" + i + "] : " + iArr1[i]);
        }
        System.out.println();

        for (int i = 0; i < iArr2.length; i++) {
            System.out.println("iArr2 [" + i + "] : " + iArr2[i]);
        }
//        배열 iArr1이 배열 iArr2에 주소만 복사해 줬기 때문에 동일한 주소를 공유하고 있음
//        배열 iArr2의 값을 변경 시 iArr1의 값도 함께 변경됨
        iArr2[2] = 300;
        System.out.println("\n iArr2[2]의 값 변경 후\n");

        for (int i = 0; i < iArr1.length; i++) {
            System.out.println("iArr1 [" + i + "] : " + iArr1[i]);
        }
        System.out.println();

        for (int i = 0; i < iArr2.length; i++) {
            System.out.println("iArr2 [" + i + "] : " + iArr2[i]);
        }

        System.out.println("\n----- 깊은 복사 -----\n");

        int[] iArr3 = {10, 20, 30};
        int[] iArr4 = {100,200,300};

        System.out.println("원본 배열의 값: ");
        for (int i = 0; i< iArr3.length; i++){
            System.out.println("iArr3 [" + i + "] : " + iArr3[i]);
        }
        for (int i = 0; i< iArr4.length; i++){
            System.out.println("iArr4 [" + i + "] : " + iArr4[i]);
        }
        System.out.println("\n----- for 문 사용 -----\n");
//        반복문 사용 : 배열 A의 내용을 반복문을 사용하며 모두 출력하고 헤딩 데이터를 배열 B에 직접 입력하는 방식
        for (int i = 0; i< iArr3.length; i++){
            iArr4[i] = iArr3[i];
            }
        System.out.println("배열 내용 복사 후 ");
        for (int i = 0; i< iArr3.length; i++){
            System.out.println("iArr3 [" + i + "] : " + iArr3[i]);
        }
        for (int i = 0; i< iArr4.length; i++){
            System.out.println("iArr4 [" + i + "] : " + iArr4[i]);
        }

        iArr3[2] = 300;
        System.out.println("\n iArr3의 데이터 수정 후 \n");
        for (int i = 0; i< iArr3.length; i++){
            System.out.println("iArr3 [" + i + "] : " + iArr3[i]);
        }
        for (int i = 0; i< iArr4.length; i++){
            System.out.println("iArr4 [" + i + "] : " + iArr4[i]);
        }

        System.out.println("\n----- System.arrayCopy() 사용 -----\n");
//        arrayCopy() : System 클래스 에서 지원하는 배열 복사 메소드
//        사용법:
//        System.arraycopy(원본 배열, 원본 배열 시작 index, 타겟 배열, 타겟 배열 시작 index,복사할 배열 크기);
        int[] iArr5 = {10, 20, 30};
        int[] iArr6 = {100,200,300};

        System.out.println("원본 배열의 값: ");
        for (int i = 0; i< iArr5.length; i++){
            System.out.println("iArr5 [" + i + "] : " + iArr5[i]);
        }
        for (int i = 0; i< iArr6.length; i++){
            System.out.println("iArr6 [" + i + "] : " + iArr6[i]);
        }
        System.arraycopy(iArr5, 0, iArr6, 0,iArr5.length);
//        System.arraycopy(iArr5, 1, iArr6, 0,2);

        System.out.println("배열 내용 복사 후 ");

        for (int i = 0; i< iArr5.length; i++){
            System.out.println("iArr5 [" + i + "] : " + iArr5[i]);
        }
        for (int i = 0; i< iArr6.length; i++){
            System.out.println("iArr6 [" + i + "] : " + iArr6[i]);
        }

        iArr5[2]=300;

        System.out.println("배열 내용 수정 후 ");

        for (int i = 0; i< iArr5.length; i++){
            System.out.println("iArr5 [" + i + "] : " + iArr5[i]);
        }
        for (int i = 0; i< iArr6.length; i++){
            System.out.println("iArr6 [" + i + "] : " + iArr6[i]);
        }

        System.out.println("\n----- Arrays 클래스 사용 -----\n");
//        copyOf() : Arrays 클래스에서 제공하는 배열 복사 메소드
//        -복사시 원본 배열의 index 0번 부터 복사함
//        사용법:
//        타겟 배열 = Arrays.copyOf(원본 배열, 복사할 배열 크기);
//        copyOfRange() : Arrays 클래스에서 제공하는 배열 복사 메소드
//        -사용자가 복사할 범위를 지정할 수 있음
//        사용법:
//        타겟 배열 = Arrays.copyOfRange(원본 배열, 시작번호, 복사할 배열 크기);
        int[] iArr7 = {10, 20, 30,40,50};
        int[] iArr8 = {100,200,300,400,500};

        System.out.println("원본 배열의 값: ");
        for (int i = 0; i< iArr7.length; i++){
            System.out.println("iArr7 [" + i + "] : " + iArr7[i]);
        }
        for (int i = 0; i< iArr8.length; i++){
            System.out.println("iArr8 [" + i + "] : " + iArr8[i]);
        }
        iArr8 = Arrays.copyOf(iArr7,iArr7.length);

        System.out.println("배열 내용 복사 후 ");

        for (int i = 0; i< iArr7.length; i++){
            System.out.println("iArr7 [" + i + "] : " + iArr7[i]);
        }
        for (int i = 0; i< iArr8.length; i++){
            System.out.println("iArr8 [" + i + "] : " + iArr8[i]);
        }

        iArr7[4]=500;

        System.out.println("배열 내용 수정 후 ");

        for (int i = 0; i< iArr7.length; i++){
            System.out.println("iArr7 [" + i + "] : " + iArr7[i]);
        }
        for (int i = 0; i< iArr8.length; i++){
            System.out.println("iArr8 [" + i + "] : " + iArr8[i]);
        }

        iArr7 = new int[]{10,20,30,40,50};
        iArr8 = new int[]{100,200,300,400,500};

        System.out.println("원본 배열의 값: ");
        for (int i = 0; i< iArr7.length; i++){
            System.out.println("iArr7 [" + i + "] : " + iArr7[i]);
        }
        for (int i = 0; i< iArr8.length; i++){
            System.out.println("iArr8 [" + i + "] : " + iArr8[i]);
        }
//        배열 iArr7 번의 index 1 ~ index 3(index 3은 미포함) 까지의 배열을 새로운 배열로 만들어서 배열 변수 iArr8에 저장
//        배열 iArr8에 저장된 배열은 새로 생성된 배열, 기존의 배열은 사라짐
        iArr8 = Arrays.copyOfRange(iArr7,1,3);
        System.out.println("\n 일부만 복사하기 \n");
        for (int i = 0; i< iArr7.length; i++){
            System.out.println("iArr7 [" + i + "] : " + iArr7[i]);
        }
        for (int i = 0; i< iArr8.length; i++){
            System.out.println("iArr8 [" + i + "] : " + iArr8[i]);
        }

        System.out.println("\n----- Object.clone() 사용 -----\n");
//        clone() : Object 클래스 에서 제공하는 객체 복사 메소드
//        -원래 배열을 복사하기 위한 메소드가 아니라 객체를 복사하기 위한 메소드이나 배열자체가 클래스 타입이기 때문에 Object 클래스에서 제공하는 객체 복사 메소드로 복사가 가능함
//        사용법 :
//        타겟 배열 = 원본 배열.clone
        int []iArr9 = new int[]{10,20,30,40,50};
        int []iArr10 = new int[]{100,200,300,400,500};

        System.out.println("원본 배열의 값: ");
        for (int i = 0; i< iArr9.length; i++){
            System.out.println("iArr9 [" + i + "] : " + iArr9[i]);
        }
        for (int i = 0; i< iArr10.length; i++){
            System.out.println("iArr10 [" + i + "] : " + iArr10[i]);
        }

        iArr10 = iArr9.clone();

        System.out.println("\n배열 내용 복사 후 \n");

        for (int i = 0; i< iArr9.length; i++){
            System.out.println("iArr9 [" + i + "] : " + iArr9[i]);
        }
        for (int i = 0; i< iArr10.length; i++){
            System.out.println("iArr10 [" + i + "] : " + iArr10[i]);
        }

        iArr9[4]= 500;
        System.out.println("\n배열 내용 수정 후 \n");

        for (int i = 0; i< iArr9.length; i++){
            System.out.println("iArr9 [" + i + "] : " + iArr9[i]);
        }
        for (int i = 0; i< iArr10.length; i++){
            System.out.println("iArr10 [" + i + "] : " + iArr10[i]);
        }


    }
}
