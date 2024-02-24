#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main()
{
    cout<<"enter length";
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cout<<"enter value";
        cin>>arr[i];
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    cout<<sum<<"\n";
    cout<<sizeof(arr)/sizeof(int);
    return 0;
}