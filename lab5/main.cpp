#include "student.h"
#include <iostream>
using namespace std;

int main() {
	employee employees[4];
    employee sam(1, "sancHir", "employee", 32);
    employee mj(2, "MJ", "boss", 40);
    employee badi(3, "Badi", "manager", 13);
    employee pips(4, "pips", "employee", 5);
    employees[0] = sam;
    sam.showInfo();
    return 0;
}