#include<iostream>
using namespace std;
class Sapthagiri{
public:    
    int x;
    string y;
};
int main(){
    // new keyword is reserved for DMA in C++
    // it is not used for object creation
    Sapthagiri obj;
    obj.x ;
    Sapthagiri o = Sapthagiri();
    o.y;
    return 0;
}