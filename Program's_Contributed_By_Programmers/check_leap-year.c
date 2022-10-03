#include <stdio.h>
#include<stdlib.h>
//This is a c comment
int main()
{
int year;
system("cls");
system("color 0C");
printf("Enter a year to check if it is a leap year:-\n>>>");
scanf("%d", &year);
if ( year%400 == 0)
  printf(">>> %d is a leap year.\n", year);
else if ( year%100 == 0)
  printf(">>> %d isn't a leap year.\n", year);
else if ( year%4 == 0 )
  printf(">>> %d is a leap year.\n", year);
else //
  printf(">>> %d isn't a leap year.\n", year); 
 return 0;
}
