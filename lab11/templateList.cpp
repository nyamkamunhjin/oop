#include <stdio.h>
#include <iostream>
#include <string>
using namespace std;

template <class T>
class Node {
public:
	T value;
	Node *next;
	Node() {
	}

	Node(T value) {
		this->value = value;
		next = NULL;
	}
};


template <class T>
class List{
public:
	int length;
	Node<T> *head;
	Node<T> *tail;

	List() {
		// printf("Constructor called!");
		length = 0;
		head = NULL;
		tail = NULL;
	}
	void print() {
		Node<T> *temp = head;
		int index = 0;
		while(temp != NULL) {
			cout << index << ": " << temp->value << endl;
			temp = temp->next;
			index++;
		}
	}
	void add(T value) {
		if(head == NULL) { // if list is empty
			head = new Node<T>(value);
			tail = head;
		} else { // add node after tail
			tail->next = new Node<T>(value);
			tail = tail->next;
		}

		// increase length by 1
		length++;
	}

	void insert(T value, int index) {
		if(head == NULL) { // if list is empty
			head = new Node<T>(value);
			tail = head;
			return;
		}

		int i = 1;
		Node<T> *temp = head;
		while(i < index) {
			temp = temp->next;
			i++;
		}
		cout << "debug: " << temp->value << endl;
		// save next temp
		Node<T> *tempNext = temp->next;

		// assign new node to next temp
		temp->next = new Node<T>(value);
		temp->next->next = tempNext;

		length++;
	}


	auto get(int index) {
		int i = 0; // counter
		Node<T> *temp = head;
		while(i < index) { // counter until index
			temp = temp->next;
			i++;
		}
		return temp->value;
	}

	void deleteNode(int index) {
		int i = 0;  // counter
		Node<T> *temp = head;

		while(i < index - 1) { // count until index
			temp = temp->next;
			i++;
		}

		Node<T> *freeNode = temp->next; // node that's going to be deleted
		temp->next = temp->next->next; // re connecting the link
		delete freeNode; // deleting the node

		length--; // decrease length
	}

	int getLength() {
		return this->length;
	}
};


int main() {
	List<string> link;
	link.add("1");
	link.add("2");
	link.add("3");
	link.add("4");
	link.add("5");
	link.insert("insert", 3);
	link.deleteNode(3);
	link.print();

	cout << link.get(3) << endl << link.getLength() << endl;
	return 0;
}
 