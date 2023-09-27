#include <iostream>
#include <windows.h>
#include <math.h>


using namespace std;

int main()
{int a,b,c;
SetConsoleOutputCP(1251);
cout << "Задайте стороны треугольника" <<endl;
cout <<"Сторона A" <<endl;
cin >>a;
cout <<"Сторона B" <<endl;
cin >>b;
cout <<"Сторона C" <<endl;
cin >>c;
if (a==b && b==c && c==a)
{
    cout <<"Треугольник равносторонний";}
else if(a!=c && b!=c && c!=a)
{
     cout <<"Треугольник произвольный";}
else
{
    cout <<"Треугольник равнобедренный";}
    return 0;

}


