#include <iostream>
#include <vector>
#include <stack>
using namespace std;

// Function to find the celebrity
// TC : 0(N)
// SC : 0(N)
int getCelebrity(const vector<vector<int>> &arr) {
    int n = arr.size();
    stack<int> s;

    // Push all candidates into the stack
    for (int i = 0; i < n; i++) {
        s.push(i);
    }

    // Find the potential celebrity
    while (s.size() > 1) {
        int i = s.top();
        s.pop();

        int j = s.top();
        s.pop();

        if (arr[i][j] == 1) {
            // i knows j, so i cannot be a celebrity
            s.push(j);
        } else {
            // i does not know j, so j cannot be a celebrity
            s.push(i);
        }
    }

    // Verify the potential celebrity
    int celeb = s.top();
    for (int i = 0; i < n; i++) {
        if (i != celeb && (arr[i][celeb] == 0 || arr[celeb][i] == 1)) {
            return -1; // No celebrity found
        }
    }

    return celeb;
}

int main() {
    vector<vector<int>> arr = {
        {0, 1, 0},
        {0, 0, 0},
        {0, 1, 0}};
        
    int ans = getCelebrity(arr);
    cout << "The celebrity is: " << ans << endl;

    return 0;
}