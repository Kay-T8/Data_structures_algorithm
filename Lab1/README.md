***CODE for SUMMATION AND MAXIMUM***
#include <stdio.h>
#include <stdlib.h>

// Function to calculate the summation of the integers in the array//

long long summation(int arr[], int n) {
    long long sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    return sum;
}

// Function to find the maximum integer in the array

int maximum(int arr[], int n) {
    int max = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

int main() {
    int n;
    printf("Enter the length of the array (0<= n<= ∞): ");
    scanf("%d", &n);

    if (n < 0 || n > 1000000) {
        printf("Invalid input. The length of the array should be between 0 and 1000000.\n");
        return 1;
    }

    int *arr = (int *) malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    printf("Enter the %d integers in the array: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    long long sum = summation(arr, n);
    int max = maximum(arr, n);

    printf("Summation of the integers in the array: %lld\n", sum);
    printf("Maximum integer in the array: %d\n", max);

    free(arr);
    return 0;
