#include<iostream> // = Stream of 1s & 0s (Bytes)
// STREAM API - Java 8
using namespace std;
class SNPSU {
    public:
    int data;
    string str;
    SNPSU(){
        cout << "Object created!" << endl;
    }
    ~SNPSU(){
        cout << "Object destroyed!" << endl;
    }
};
int main(){
    int x;
    cin >> x;
    SNPSU obj;
    SNPSU o2 = SNPSU();
    return 0;
}

