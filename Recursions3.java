public class Recursions3 {
    public static int FirstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOccurence(arr, key, i + 1);
    }

    public static int LastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound= LastOccurence(arr,key, i+1);
        if(isFound == -1 && arr[i]== key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 5, 9};
        int key = 5;
        int index = FirstOccurence(arr, key, 0);
        int index2 = LastOccurence(arr, key, 0);
        System.out.println("First occurrence of " + key + " is at index: " + index);
        System.out.println("Last occurrence of " + key + " is at index: " + index2);
    }
}
