import java.util.Scanner;
public class DuplicateArray {
    public static void duplicateChecker(int numbers[])
    {
        boolean duplicated = false;
        for (int i = 0; i < numbers.length; i++) {
            duplicated = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicated = true;
                }
            }
            if (duplicated == false) {
                System.out.print(numbers[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        int in;
        do {
            System.out.print("Masukkan Panjang Array : ");
            in = userin.nextInt();
            if (in > 10)
                System.out.println("Maksimal panjang array 10");
        } while (in > 10 || in < 0);
        int Arr[] = new int[in];
        for (int i = 0; i < in; i++) {
            System.out.print("Masukkan Indeks Ke-"+i+" : ");
            Arr[i] = userin.nextInt();
        }
        System.out.println("\nBefore");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
        System.out.println("After");
        duplicateChecker(Arr);
    }
}