/*
1. a, b, c гурван тооны хамгийн ихийг олох define макро функц бич.
*/
#include <stdio.h>
#include <iostream>
using namespace std;

#define max(A, B, C) (((A) > (B) ? (A) : (B)) > (C) ? ((A) > (B) ? (A) : (B)) : (C));

int main() {
    int a, b, c;
    cout << "input: ";
    cin >> a >> b >> c;
    cout << max(a, b, c);
}

