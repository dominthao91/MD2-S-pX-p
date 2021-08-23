package insertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng :");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Nhập phần tử " + i + " : ");
            list[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        System.out.println(Arrays.toString(list));
        insertionSorts(list);

    }
    private static void insertionSorts(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) { //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
        System.out.println("mảng sau khi đổi");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ,");
        }
    }

}