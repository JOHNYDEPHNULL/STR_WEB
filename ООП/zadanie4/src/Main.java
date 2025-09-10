
public class SwapMinMax {
    public static void main(String[] args) {
        int[] array = new int[25];
        for (int i = 0; i < 25; i++) {
            array[i] = i + 1;
        }


        swapMinMax(array);


        System.out.println("Массив после обмена:");
        for (int num : array) {
            System.out.print(num + " ");
        }


        int maxElement = maxX(array);
        System.out.println("\nМаксимальный элемент: " + maxElement);
    }


    public static void swapMinMax(int[] arr) {
        int minIndex = 0, maxIndex =0;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            } else if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }


        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }


    public static int maxX(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
