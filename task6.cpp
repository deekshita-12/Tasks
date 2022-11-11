#include<iostream>
using namespace std;
class Data
{
    int dsd,maths,sl,edc;
    double percentage;
    public :
        Data()
        {
            dsd=maths=sl=edc=0;
            percentage=0;
        }
        Data(int d, int m, int s, int e)
        {
            dsd=d;
            maths=m;
            sl=s;
            edc=e;
            percentage=((dsd+maths+sl+edc)*100)/200;
        }
        void display()
        {
            cout<<"\nPercentage obtained : "<<percentage;
        }
};
int main()
{
    int d,m,s,e;
    cout<<"Enter the marks of the student in DSD, Maths, Skill Lab and EDC ot of 50:\n";
    cin>>d>>m>>s>>e;
    Data data(d,m,s,e);
    data.display();
    return 0;
}
