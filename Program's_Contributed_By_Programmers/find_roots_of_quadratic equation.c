Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@Kirosci 
CharlieTheHack1
/
hacktoberfest2022
Public
Code
Issues
Pull requests
4
Actions
Projects
Security
Insights
hacktoberfest2022/find_roots_of_quadratic-equation.c
@Kirosci
Kirosci Create find_roots_of_quadratic-equation.c
Latest commit 76c1fa0 5 minutes ago
 History
 1 contributor
57 lines (34 sloc)  951 Bytes

#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int main()
{
   double a, b, c, discr, root1, root2, realPart, imgPart;
   system("cls");
   system("color 0C");
   printf("Enter coefficients a, b and c:- \n>>>");
   scanf("%lf %lf %lf",&a, &b, &c);
   discr = b*b-4*a*c;
   // condition for real and different roots

   if (discr > 0)

   {

   // sqrt() function returns square root

       root1 = (-b+sqrt(discr))/(2*a);

       root2 = (-b-sqrt(discr))/(2*a);

       printf(">>>root1 = %.2lf and root2 = %.2lf",root1 , root2);

   }

   //condition for real and equal roots

   else if (discr == 0)

   {

       root1 = root2 = -b/(2*a);

       printf(">>>root1 = root2 = %.2lf;", root1);

   }

   // if roots are not real

   else

   {

       realPart = -b/(2*a);

       imgPart = sqrt(-discr)/(2*a);

       printf(">>>root1 = %.2lf+%.2lfi and root2 = %.2f-%.2fi", realPart, imgPart, realPart, imgPart);

   }

   return 0;

} 

Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
hacktoberfest2022/find_roots_of_quadratic-equation.c at main · CharlieTheHack1/hacktoberfest2022
