#include <iostream>
using namespace std;
class Complex{
    public:
    float a, b;
    Complex(): a(0), b(0) {}
    Complex(float x, float y): a(x), b(y){}
    void display(){
        cout<<this->a<<" + "<<this->b<<"i"<<endl;
    }
    friend Complex operator-(const Complex&, const Complex&);
};
Complex operator+(const Complex& com, const Complex& comp)
{
        float x = com.a + comp.a;
        float y = com.b + comp.b;
        return Complex(x, y);
}
int main()
{
    int r1,r2,i1,i2;
    cout<<"Enter the real and imaginary part of the first number :\n";
    cin>>r1>>i1;
    cout<<"Enter the real and imaginary part of the second number :\n";
    cin>>r2>>i2;
    Complex a(r1, i1), b(r2, i2);
    cout<<"A = "; a.display();
    cout<<"B = "; b.display();
    cout<<"A + B = "; (a + b).display();
    return 0;
}
