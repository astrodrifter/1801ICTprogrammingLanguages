#include <cstdio>
#include <iostream>

using namespace std;

int main(int argc, char * argv[]) {
    char * name = new char[50];
    printf("Enter your name: ");
    cin >> name;
    printf("Hello %s\n",name);
    return 0;
}
