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
		// if list is empty or if index higher than length
		if(head == NULL || index >= this->length) { 
			this->add(value);
			return;
		}

		if(index == 0) {
			Node<T> *temp = new Node<T>(value);
			temp->next = head;
			head = temp;

			length++;
			return;
		}

		int i = 1;
		Node<T> *temp = head;
		while(i < index) {
			temp = temp->next;
			i++;
		}
		// cout << "debug: " << temp->value << endl;
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
		if(head == NULL) {
			cout << "List empty\n";
			return;
		}

		int i = 0;  // counter
		Node<T> *after = head;
		Node<T> *before;
		while(i < index) { // count until previous index
			before = after;
			after = after->next;
			i++;
		}

		if(head == after) {
			head = head->next;
			delete after;
			return;
		}

		if(tail == after) {
			tail = before;
			delete after;
			tail->next = NULL;
			return;
		}


		before->next = after->next; // re connecting the link
		delete after; // deleting the node

		length--; // decrease length
	}

	int getLength() {
		return this->length;
	}
};


int main() {
	List<int> link;
	link.add("1");
	link.add("2");
	link.add("3");
	link.add("4");
	link.add("5");
	link.insert("insert", 5);
	// link.deleteNode(5);
	link.print();


	// cout << link.get(3) << endl << link.getLength() << endl;
	return 0;
}
 