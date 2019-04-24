#include<iostream>
#include<string.h>


class Student {
public:
   char *name = NULL;
   int year;


   // getters
   char* getStudentId() {
       return this->studentId;
   }

   char* getName() {
       return this->name;
   }

   int getYear() {
       return this->year;
   }

   float getGpa() {
       return this->gpa;
   }

   int getCounter() {
       return this->counter;
   }

   // setters
   void setStudentId(char *studentId) {
       delete this->studentId;
       this->studentId = new char[strlen(studentId)];
       strcpy(this->studentId, studentId);
   }

   void setName(char *name) {
       delete this->name;
       this->name = new char[strlen(name)];
       strcpy(this->name, name);
   }

   void setYear(int year) {
       if(year != 0) this->year = year;
   }

   void setGpa(int gpa) {
       if(gpa >= 0.0 && gpa <= 4.0) this->gpa = gpa;
   }

   void copy(Student student) {
       delete this->studentId;
       delete this->name;

       this->studentId = new char[strlen(student.getStudentId())];
       this->name = new char[strlen(student.getName())];
       strcpy(this->studentId, student.getStudentId());
       strcpy(this->name, student.getName());
       this->year = student.getYear();
       this->gpa = student.getGpa();
   }


   // Constructors

   // Default Constructor
   Student() {
       this->name = new char;
       this->studentId = new char;
       this->year = 1;
       this->gpa = 0;

   }

   // Parameterized Constructor
   Student(char *studentId, char *name, int year, float gpa) {
       if(this->studentId != NULL) delete this->studentId;
       if(this->name != NULL) delete this->name;

       this->studentId = new char[strlen(studentId)];
       strcpy(this->studentId, studentId);

       this->name = new char[strlen(name)];
       strcpy(this->name, name);

       if(year != 0) this->year = year;
       else this->year = 1;

       if(gpa >= 0.0 && gpa <= 4.0) this->gpa = gpa;
       else this->gpa = 0;
   }

   // Copy Constructor
   Student(const Student &copyStudent) {
       if(this->studentId != NULL) delete this->studentId;
       if(this->name != NULL) delete this->name;

       this->studentId = new char[strlen(copyStudent.studentId)];
       this->name = new char[strlen(copyStudent.name)];

       strcpy(this->studentId, copyStudent.studentId);
       strcpy(this->name, copyStudent.name);
       this->year = copyStudent.year;
       this->gpa = copyStudent.gpa;
   }

  // Destructor
   ~Student() {
       // std::cout << "Deleting: " << this->name << std::endl;
       delete this->name;
       delete this->studentId;
   }

   // Comparing
   bool greatThan(Student &student) {
       return this->year > student.getYear();
   }

   bool lessThan(Student &student) {
       return this->year < student.getYear();
   }

   bool isEqual(Student &student) {
       return this->year == student.getYear();
   }

   bool before(Student &student) {
       return strcmp(this->name, student.getName()) > 0;
   }
  
   bool after(Student &student) {
       return strcmp(this->name, student.getName()) < 0;
   }



private:
   char *studentId = NULL;
   float gpa;
   const static int counter = 1;

};
