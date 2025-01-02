import java.util.Scanner;

/**
 * [최대값과 최소값]
 * 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다.
 */

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SIZE;
        System.out.print("몇 개의 숫자를 저장할 것인가요? ");
        SIZE = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[SIZE];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("숫자를 줄 바꿈으로 구분해 입력해주세요.");
        for (int i = 0; i < SIZE; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());

            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("최대값: " + max);
        System.out.println("최솟값: " + min);

    }
}
