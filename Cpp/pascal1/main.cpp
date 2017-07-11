#include <cstdio>
#include <iostream>
#include <cmath>

using namespace std;

int main(int argc, char **argv)
{
    int length = 11;
    /* get length 
    printf("Enter length\n");
    cin >> length; */
    
    /* set elements to zero */
    int rows[length][length];
    for(int i = 0; i < length; i++) {
        for(int j = 0; j < length; j++){
            rows[i][j] = 0;
        }
    }
    
    /* first element set to 1 */
    rows[0][0] = 1;
    /* complete algorithym */
	for(int i = 0; i < length; i++) {
        for(int j = 0; j < length; j++){
            rows[i+1][j] = rows[i][j-1]+rows[i][j];
            printf("%i ",rows[i][j]);
        }
        printf("\n");
    }
	return 0;
}
