#include <iostream>
#include <vector>
#include <cmath>
#include <tuple>
#include <string>

using namespace std;

int main()
{
    tuple<int, int> help (1,1);  // Move the declaration to the top of the function
    cout << get<0>(help);
    return 0;
}
//use g++ -std=c++11 