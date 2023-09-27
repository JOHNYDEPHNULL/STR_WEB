#include <iostream>
#include <math.h>

using namespace std;

int main()
{ double u,r1,r2;
cout <<"U=";
cin >>u;
cout <<"R1=";
cin >> r1;
cout << "R2=";
cin >> r2;
double i1=u/(r1+r2);
double i=u/r1;
double i22 =i/i1;
cout <<fixed <<"I change in=" <<i22 <<endl;
return 0;







}
