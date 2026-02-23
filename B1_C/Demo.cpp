#include<iostream>
using namespace std;
class Sapthagiri{
public:    
    int x;
    string y;
    Sapthagiri(int x, string y){
        cout << "Object has been created!" << endl;
        this->x = x;
        this->y = y;
    }
    // Destructor
    ~Sapthagiri() {
        cout << "Object has been destroyed!" << endl;
    }
};
int main(){
    
    // new keyword is reserved for DMA in C++
    // it is not used for object creation
    Sapthagiri obj(12, "CSE");
    obj.x ;
    Sapthagiri o = Sapthagiri(12, "ISE");
    o.y;
    return 0;
}