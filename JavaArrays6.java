public class JavaArrays6 {
    public static void SecondLargest(int[] a){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 1};
        SecondLargest(arr);
    }
}
