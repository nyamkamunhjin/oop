/*
3. Өгөгдсөн хүснэгтийн тэгш элементүүдийн тоог олох дотоод функц бич.
*/

#include <stdio.h>
#include <iostream>
using namespace std;

inline int evenCount(int *arr, int n) {
    int counter = 0;
    for(int i = 0; i < n; i++)
        if(arr[i] % 2 == 0)
            counter++;

    return counter;
}

int main() {
 int arr[6] = {0, 1, 2, -5, 6, 21};

 cout << "Even number: " << evenCount(arr, 6) << endl;
}

