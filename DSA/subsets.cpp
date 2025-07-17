#include <iostream>
#include <vector>
using namespace std;

// Time Complexity of Recursion = Total Calls * Work Done in each call
// = (2^n * n) * 0(1) = 0(2^n * n)
void printSubsets(vector<int> &arr, vector<int> &ans, int i)
{
    if (i == arr.size())
    {
        for (int x : ans)
            cout << x << " ";
        cout << endl;
        return;
    }
    // inclusion
    ans.push_back(arr[i]);
    printSubsets(arr, ans, i + 1);

    // exclusion
    ans.pop_back(); // backtrack step
    printSubsets(arr, ans, i + 1);
}
int main()
{
    vector<int> arr = {1, 2, 3};
    vector<int> ans;
    printSubsets(arr, ans, 0);
    return 0;
}