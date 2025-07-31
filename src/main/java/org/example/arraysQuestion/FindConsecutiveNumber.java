package org.example.arraysQuestion;

public class FindConsecutiveNumber {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 1, 1,};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Consecutive number: " + arr[i] + " at positions " + i + " and " + (i + 1));
            }
        }
    }
}
