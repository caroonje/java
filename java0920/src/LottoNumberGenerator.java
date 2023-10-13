import java.util.Arrays;
import java.util.Random;

public class LottoNumberGenerator {
    public static void main(String[] args) {
        int[] lottoNumbers = generateLottoNumbers();
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
    }

    public static int[] generateLottoNumbers() {
        int[] lottoNumbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            // 중복된 숫자를 방지하기 위해 이미 선택한 번호인지 확인
            int newLottoNumber;
            do {
                newLottoNumber = random.nextInt(45) + 1; // 1부터 45 사이의 랜덤 숫자 생성
            } while (contains(lottoNumbers, newLottoNumber)); // 중복된 숫자일 경우 다시 선택

            lottoNumbers[i] = newLottoNumber;
        }

        // 번호를 오름차순으로 정렬
        Arrays.sort(lottoNumbers);
        return lottoNumbers;
    }

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

