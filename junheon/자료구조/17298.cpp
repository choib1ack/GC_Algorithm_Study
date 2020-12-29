#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> arr(n);
    vector<int> ans(n);
    stack<int> s;

    for(int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    
    for(int i = 0; i < n; i++) {
        while(!s.empty() && arr[s.top()] < arr[i]) {
            ans[s.top()] = arr[i];
            s.pop();
        }              
        s.push(i);
    }

    while(!s.empty()) {
        ans[s.top()] = -1;
        s.pop();
    }

    for(int i = 0; i < n; i++) {
        cout << ans[i] << ' ';
    }

    return 0;
}