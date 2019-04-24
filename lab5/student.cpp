#include <iostream>
#include <string.h>
#include <ctype.h>
using namespace std;

#define SALARY_BOSS 60;
#define SALARY_EMPLOYEE 16;
#define SALARY_MANAGER 30;

class employee{
public:
    employee(int id, char *name, char *occupation, float workedHours);
    ~employee();
    void setId(int);
    void setName(char*);
    void setOccupation(char*);
    void setWorkedHours(float);
    void showInfo();
    int getId();
    char* getName();
    char* getOccupation();
    float getWorkedHours();

private:
    
    int id;
    char *name;
    char *occupation;
    float workedHours;

};

employee::employee(int id, char *name, char *occupation, float workedHours) {
    this->id = id;
    this->name = new char[strlen(name) + 1];
    strcpy(this->name, name);
    this->occupation = new char[strlen(occupation) + 1];
    strcpy(this->occupation,occupation);
    this->workedHours = workedHours;
}

employee::~employee() {
    cout << "deleted " << this->name << endl;
    delete this->name;
    delete this->occupation;
    
}
void employee::showInfo() {
    cout << "id: " << this->id << endl;
    cout << "name: " << this->name << endl;
    cout << "occupation: " << this->occupation << endl;
    cout << "workedHours: " << this->workedHours << endl;
}

void employee::setId(int id) {
    this->id = id;
}

void employee::setName(char *name) {
    delete this->name;
    this->name = new char[strlen(name) + 1];
    strcpy(this->name, name);
}

void employee::setOccupation(char *occupation) {
    delete this->occupation;
    this->occupation = new char[strlen(occupation) + 1];
    strcpy(this->occupation, occupation);
}

void employee::setWorkedHours(float workedHours) {
    this->workedHours = workedHours;
}

int employee::getId() {
    return this->id;
}

char* employee::getName() {
    return this->name;
}

char* employee::getOccupation() {
    return this->occupation;
}

float employee::getWorkedHours() {
    return this->workedHours;
}

int main(){
    employee sam(1, "sanchir", "notBoss", 12.3);
    sam.showInfo();
}