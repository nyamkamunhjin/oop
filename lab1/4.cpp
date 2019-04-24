/*
4. Өгөгдсөн хүснэгтийн сондгой элементүүдийн арифметик дунджийг олох дотоод функц бич.
*/

#include <stdio.h>
#include <iostream>
using namespace std;

inline float oddAvg(int *arr, int n) {
    int total = 0;
    int counter = 0;
    for(int i = 0; i < n; i++)
        if(arr[i] % 2 == 1 || arr[i] % 2 == -1) {
            total += arr[i];
            counter++;
        }

    return (float) total/counter;
}

int main() {
 int arr[6] = {0, 1, 2, -5, 6, 22};

 cout << "Avg of odds: " << oddAvg(arr, 6) << endl;
}


