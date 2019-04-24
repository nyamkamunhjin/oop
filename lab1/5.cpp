/*
5. Өгөгдсөн натурал тооны оронгийн тоо болон цифрүүдийг олох дотоод функц бич.
*/

#include <stdio.h>
#include <iostream>
using namespace std;

inline int* countDigit(int num) {
    int numCpy = num;
    int counter = 0;
    int *arr = new int[100];
    // count
    while(numCpy != 0) {
        arr[counter] = numCpy % 10;
//        cout << arr[counter] << endl;
        numCpy /= 10;
        counter++;
    }

    int *saveArr = new int[counter + 1];
    saveArr[0] = counter + 1;

    for(int i = 1; i < counter + 1; i++)
        saveArr[i] = arr[counter - i];

    delete arr;
    return saveArr;


}

int main() {
 int num = 123456;
 int *arr = countDigit(num);
 for(int i = 1; i < arr[0]; i++)
    cout << arr[i] << " ";
}



