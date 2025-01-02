import java.util.Scanner;

/**
 * [총합과 평균]
 * 배열의 모든 요소를 더해서 총합과 평균을 구한다.
 */

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SIZE;
        System.out.print("몇 개의 숫자를 저장할 것인가요? ");
        SIZE = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[SIZE];

        int sum = 0;
        System.out.println("숫자를 줄 바꿈으로 구분해 입력해주세요.");
        for (int i = 0; i < SIZE; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
            sum += arr[i];
        }

        int avg = sum / SIZE;
        System.out.println("총합: " + sum + ", 평균: " + avg);
    }

}
