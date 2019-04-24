/*
2. Өгөгдсөн N ширхэг тооны хамгийн их/хамгийн багийг олох код бич.
*/

#include <stdio.h>
#include <iostream>
using namespace std;

int max(int *arr, int n) {
    int max = arr[0];
    for(int i = 0; i < n; i++)
        if(arr[i] > max)
            max = arr[i];

    return max;
}

int min(int *arr, int n) {
    int min = arr[0];
    for(int i = 0; i < n; i++)
        if(arr[i] < min)
            min = arr[i];

    return min;
}
int main() {
 int arr[5] = {1, 2, -5, 3, 21};

 cout << "max: " << max(arr, 5) << endl;
 cout << "min: " << min(arr, 5) << endl;
}
