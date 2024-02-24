#include <iostream>
#include <cmath>
#include <string>
using namespace std;

int main()
{
    cout<<"helloworld\n";
    cout<<"Type a number:"; //cout to  print
    int num=0;
    cin>>num;
    cout<<"number:"<<num;
    string a="helloworld";
    cout<<a[0];
    string y="yo";
    string h=y.append(a);
    cout<<h;
    cout<<sqrt(25);
    cout<<log(45);
    cout<<min(4,5);
    cout<<max(5,69);
    return 0;
}