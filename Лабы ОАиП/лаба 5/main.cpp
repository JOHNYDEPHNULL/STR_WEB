#include <iostream>
#include <windows.h>
#include <math.h>


using namespace std;

int main()
{int a,b,c;
SetConsoleOutputCP(1251);
cout << "������� ������� ������������" <<endl;
cout <<"������� A" <<endl;
cin >>a;
cout <<"������� B" <<endl;
cin >>b;
cout <<"������� C" <<endl;
cin >>c;
if (a==b && b==c && c==a)
{
    cout <<"����������� ��������������";}
else if(a!=c && b!=c && c!=a)
{
     cout <<"����������� ������������";}
else
{
    cout <<"����������� ��������������";}
    return 0;

}


