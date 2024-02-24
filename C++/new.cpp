#include <iostream>
#include <cmath>
using namespace std;
int sum=0;
int solve(int x,int y,int z)
{
    int a;
    for(int i=1;i<1000000;i++)
    {
        int r=0;
        r=z-(i*z);
        if(r==-1)
        {
            sum+=2;
            a=i;
            break;
        }
        else if(r==-2)
        {
            sum+=3;
            a=i;
            break;
        }
    }
    return a;
}
int main()
{
    int sum=0;
    int x,y,z;
    cin>>x>>y>>z;
    while(true)
    {
        int i=solve(x,y,z);
        if(i==x)
        {
            cout<<sum;
            break;
        }
    }
    return 0;
}