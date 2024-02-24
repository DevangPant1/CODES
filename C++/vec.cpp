// Online C++ compiler to run C++ program online
#include <iostream>
#include <cmath>
#include <vector>
#include <string>
#include <tuple>
using namespace std;

int main() 
{
    cout<<"enter size of vector array";
    int n;
    cin>>n;
    vector<int>vec(n);
    for(int i=0;i<n;i++)
    {
        cout<<vec[i]<<" ";
    }
    cout<<vec.size();
    return 0;
}