#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<conio.h>
//This is a C comment

void main()

{

int choice, num, I, Square;

double number, root;

system("cls");
system("color 0C");

while(1)

{

printf("\n1. Odd/Even \n");

printf("2. Positive/Negative\n");

printf("3. Square of number\n");

printf("4. Square root of number\n");

printf("5. Exit\n");

printf("Your choice?\n>>>");

scanf("%d",&choice);

switch(choice)

{

case 1:

       printf("\nEnter number:- \n>>>");

       scanf("%d",&num);

       if(num %2==0)

          printf("\n>>> Even number.\n");

      else

         printf("\n>>> Odd number.\n");

     break;

case 2:

   printf("Enter a number:- \n>>>");

   scanf("%lf", &number);

   if (number <= 0.0)

   {

       if (number == 0.0)

           printf(">>> You entered 0.");

       else

           printf(">>> You entered a negative number.");

   }

   else

       printf(">>> You entered a positive number.");

   break;

case 3:

   printf("\nPlease Enter any integer Value:-\n>>>");

   scanf("%d", &num);

    Square = num * num;

    printf("\n>>> Square of a given number %d is  =  %d", num, Square);

   break;

case 4:

   printf("\n>>> Enter any number to find square root: ");

   scanf("%lf", &number);

   root = sqrt(number);

   printf("\n>>> Square root of %.2lf = %.2lf", number, root);

   break;

case 5:
break;
//exit();



}

}

getch();
}


