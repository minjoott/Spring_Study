/**
 * [섞기(shuffle)]
 * 배열의 요소의 순서를 반복해서 바꾼다. (카드 섞기, 로또번호 생성)
 */

public class ArrayEx7 {
    public static void main(String[] args) {

        final int SIZE = 10;
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("초기 배열 요소 순서: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int switchIdx = (int)(Math.random() * 10);
            int tmp = arr[switchIdx];
            arr[switchIdx] = arr[0];
            arr[0] = tmp;
        }

        System.out.print("shuffle 이후 배열 요소 순서: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
