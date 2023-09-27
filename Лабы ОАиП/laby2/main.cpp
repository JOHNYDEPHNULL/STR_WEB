#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    double x,y,z;

    cout << "Write X= ";cin >>x;

    cout << "Write Y= ";cin >>y;

    cout << "Write Z= ";cin >>z;
    double a=pow((sqrt(fabs(x-y))),y)*((M_PI*x)/y+log(atan(z)));


    cout.precision(6);
    cout<<fixed<<a<<endl;
    return 0;
}

