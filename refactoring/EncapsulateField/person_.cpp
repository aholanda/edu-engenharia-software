#include <iostream>
#include <string>

using namespace std;

class persona {
public:
	string name;
public:
	string get_name() {
		return this->name;
	}
	void set_name(string name) {
		this->name = name;
	}
};

int main() {
	persona p;

	p.name = "Alice";

	cout << p.name << "\n";
	
	return 0;
}
