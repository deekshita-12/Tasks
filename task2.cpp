#include <iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"Enter two numbers :\n";
    cin>>a>>b;
    cout<<"Before swapping a= "<<a<<" b= "<<b;
    a=a+b;
    b=a-b;
    a=a-b;
    cout<<"\nAfter swapping a= "<<a<<" b= "<<b;
    return 0;
}
