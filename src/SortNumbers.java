public class SortNumbers {
    public static void bubbleSort(int numbers[])
    {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int numbers[] = {5,7,10,21,1,3};
        System.out.println("Sebelum di sorting:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        bubbleSort(numbers);
        System.out.println("\n");
        System.out.println("Setelah di sorting:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}