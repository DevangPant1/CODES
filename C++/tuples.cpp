#include <iostream>
#include <string>
#include <vector>
#include <cmath>
using namespace std;
int main()
{
    vector<int> vec(5); // vector with size 5
    int m; cin >> m;
    vec.resize(m); // changes size to m
    // imagine m = 3, vec = 0 1 2 or,
    // imagine m = 7, vec = 0 1 2 3 4 0 0

    // takes input unless it encounters EOF or -1, and adds it to back of vec
    int x = 0;
    while(cin >> x && x != -1)
    {
        vec.push_back(x);
    }

    int sz = int(vec.size()); // get the current size, note on the cast later
}