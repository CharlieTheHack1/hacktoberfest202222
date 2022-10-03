#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
void main(){
float km,m,feet,inch,cm;
system("cls");
system("color 0C");
printf("Enter the Number(in km) to convert it in diffrent units):-\n>>>");
scanf("%f",&km);
m = km*1000;
feet= km*3280.84;
inch=km*39370.1;
cm=km*100000;
printf("\n>>>Units in kilometres = %f ",km);
printf("\n>>>Units in metres = %f ",m);
printf("\n>>>Units in feet = %f ",feet);

printf("\n>>>Units in inches = %f ",inch);

printf("\n>>>Units in centimetres = %f ",cm);

getch();

}
