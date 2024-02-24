#include <iostream>
#include <vector>
#include <tuple>
#include <string>
#include <cmath>
#include <numeric>

using namespace std;

int main()
{
    vector<int> vec(5);
    iota(vec.begin(),vec.end(),0);
    vec[1]=1;
    cout<<vec.front();
    int x=0;
    while(cin>>x && x!=-1)
    {
        vec.push_back(x);
    }
    cout<<vec[6];
}