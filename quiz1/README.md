***Question One (1) Remove Duplicates from Sorted Array***

#include <stdio.h>
/**C code that allows the user to input a sorted array of integers,
 removes duplicates in place and returns the new length with O(1) extra memory**/
 
 int removeDuplicates(int arr[], int n) {
    if (n <= 0) {
        return 0;
    }
    int i = 0;
    for (int j = 1; j < n; j++) {
        if (arr[j] != arr[i]) {
            i++;
            arr[i] = arr[j];
        }
    }
    return i + 1;
}

int main() {
    int n;
    printf("Enter the number of elements in the sorted array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the sorted array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int newLength = removeDuplicates(arr, n);
    printf("The new length of the array is: %d\n", newLength);
    for (int i = 0; i < newLength; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}


**Question Two (2) - Rotate Array**

#include <stdio.h>
/**C code that allows user to rotate array to the right by k steps,
k is non-negative**/

void rotateArray(int arr[], int n, int k) {
    if (k > 0 && n > 0) {
        k = k % n;
        int temp[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}

int main() {
    int i, n, k;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Enter the number of steps to rotate: ");
    scanf("%d", &k);
    rotateArray(arr, n, k);
    printf("The rotated array is: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}

***Question Three (3) - Contains Duplicate***

#include <stdio.h>
#include <stdbool.h>
/**C code that allows the user to input an array of integers and checks for duplicates**/

bool containsDuplicate(int arr[], int n) {
    bool seen[1000] = {false}; //assuming the integers are in the range [0, 1000)
    for (int i = 0; i < n; i++) {
        if (seen[arr[i]]) {
            return true;
        }
        seen[arr[i]] = true;
    }
    return false;
}

int main() {
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    if (containsDuplicate(arr, n)) {
        printf("The array contains duplicates.\n");
    } else {
        printf("The array does not contain duplicates.\n");
    }
    return 0;
}


**Question Four (4) - Single Number**

//Single Number
#include <stdio.h>
#include <stdbool.h>
/**C code that allows the user to input a non-empty array of integers 'nums',
where every element appears twice except for one, and helps find that single one:**/

int findSingleOne(int nums[], int n) {
    int result = 0;
    for (int i = 0; i < n; i++) {
        result ^= nums[i];
    }
    return result;
}

int main() {
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int nums[n];
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &nums[i]);
    }
    int singleOne = findSingleOne(nums, n);
    printf("The single one is: %d\n", singleOne);
    return 0;
}
