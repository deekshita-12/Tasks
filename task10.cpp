#include<iostream>
using namespace std;
class A
{
	protected:
		int i;
};
class child:public A
{
	public:
		int cube()
		{
			cout<<"Enter the number :"<<endl;
			cin>>i;
				cout<<"Cube of "<<i<<" is "<<"="<<(i*i*i)<<endl;
		}
};
int main()
{
    child obj;
    obj.cube();

}
