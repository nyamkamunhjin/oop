#include <iostream>
#include <string.h>
#include <vector>
#include "Student.cpp"
using namespace std;

int countStudents(vector<Student> list) {
   int count = 0;
   for(int i = 0; i < list.size(); i++) {
       count += list[i].getCounter();
   }

   return count;
}

void swapStudent(Student &a, Student &b) {
   // copying a
   Student temp = a;

   // copying fields of b to a
   a.copy(b);

   // copying field of (copy a) to b
   b.copy(temp);

}



void sortByName(vector<Student> &list, int start, int end) {
   if(start >= end) return;

  
   Student pivot = list[end - 1];
   int index = start;

   for(int i = start; i < end - 1; i++) {
       if(list[i].after(pivot)) {
           swapStudent(list[i], list[index]);
           index++;
       }
   }
   swapStudent(list[index], list[end - 1]);

   sortByName(list, start, index);
   sortByName(list, index + 1, end);
}

void sortByYear(vector<Student> &list, int start, int end) {
   if(start >= end) return;
  
   Student pivot = list[end - 1];
   int index = start;

   for(int i = start; i < end - 1; i++) {
       if(list[i].getYear() < pivot.getYear()) {
           swapStudent(list[i], list[index]);
           index++;
       }
   }
   swapStudent(list[index], list[end - 1]);

   sortByYear(list, start, index);
   sortByYear(list, index + 1, end);
}

void printStudent(vector<Student> list) {
   printf("id\tname\tyear\tgpa\n");
   printf("--------------------------------------------\n");
   for(int i = 0; i < list.size(); i++) {
       printf("%s\t%s\t%d\t%f\n", list[i].getStudentId(), list[i].getName(), list[i].getYear(), list[i].getGpa());
   }
   printf("--------------------------------------------\n");
}

int main() {
   vector<Student> studentList;
   studentList.push_back(Student("16b1", "c", 4, 3.1));
   studentList.push_back(Student("ewqe", "b", 1, 4));
   studentList.push_back(Student("qwew", "a", 2, 2.5));
   studentList.push_back(Student("qwds", "e", 3, 1));
   studentList.push_back(Student("qzxc", "d", 3, 3.3));
   printStudent(studentList);
  
   sortByName(studentList, 0, studentList.size());
   printStudent(studentList);

   sortByYear(studentList, 0, studentList.size());
   printStudent(studentList);

   cout << countStudents(studentList) << endl;
}