#include <iostream>
using namespace std;
int main() {
  int oper;
  float a,b;
  cout<<"Please enter two numbers: ";
  cin>>a>>b;
  cout<<"Enter the operator number: ";
  cin>>oper;
  /* Cases are as follows:- 
     1 -> sum
     2 -> difference
     3 -> product
     4 -> divison */
  switch(oper) {
      case 1: cout<<a<<" + "<<b<<" = "<<(a+b);
      break;
      case 2: cout<<a<<" - "<<b<<" = "<<(a-b);
      break;
      case 3: cout<<a<<" * "<<b<<" = "<<(a*b);
      break;
      case 4: if(b==0) {
          cout<<"Invalid calculation.";
      }
          else {
          cout<<a<<" / "<<b<<" = "<<(a/b);
        }
      break;
  }
  return 0;
}