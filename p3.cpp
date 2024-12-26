#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
main() {
srand(time(0));
int anyNum,perGuess;
int tryTempt = 0;
for(int i=0;i<=tryTempt;i++) 
    for(int j=0;j<=10;j++) {
        anyNum=rand()%100-j;
    } do {
        cout<<"Enter desired value: ";
        cin>>perGuess;
        tryTempt++;
        if(perGuess==anyNum) {
            cout<<"Whoa! It's a catch. You've WON.\n";
        } else if(anyNum>perGuess) {
            cout<<"The number guessed is low.\n";
        } else if(anyNum<perGuess) {
            cout<<"The number guessed is high.\n";
        }
    } while(anyNum!=perGuess);

    cout<<"The random number generated was: "<<anyNum;
    cout<<"\nThe number of attempts taken were: "<<tryTempt;

return 0;
}
