#include <cstdio>
#include <iostream>
#include <cmath>

using namespace std;

int main(int argc, char **argv)
{
    /* get length */
    int length;
    printf("Enter length for Pascal's Triangle\n");
    scanf("%i",&length);
    
    /* set elements to zero */
    int rows[length][length];
    for(int i = 0; i < length; i++) {
        for(int j = 0; j < length; j++){
            rows[i][j] = 0;
        }
    }
    
    /* complete algorithym */
    int countDown = length-2; //to set spaces for triangle
	for(int i = 0; i < length; i++) {
    rows[i][0] = 1; // set first number of each row to 1
    
        /* set blank space */
        int count = countDown; 
        while(count > 0){
            printf(" ");
            count--;
        }
        for(int j = 0; j < length; j++){
            rows[i+1][j] = rows[i][j-1]+rows[i][j];
            if(rows[i][j] != 0) {
                printf("%i ",rows[i][j]);
            }
        }
        countDown--;
        printf("\n");
    }
	return 0;
}
