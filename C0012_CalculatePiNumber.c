//#define _USE_MATH_DEFINES
#include <stdio.h>
#include <stdbool.h>
//#include <math.h>

int main()
{

	double value = 0;
	bool flag1 = true, flag2 = true, flag3 = true, flag4 = true, flag5 = true;
	int i = 0, j = 1;
	do
	{
		
		(i++ % 2 == 0) ? (value += (double)4.0 / j) : (value -= (double)4.0 / j);
		//printf(" %d\t %lf\t %lf\n", i, value, value - M_PI);
		j += 2;
		if (3.1 <= value && value < 3.2 && flag1) // 3.1
		{
			printf("First one fraction digit is the same in %dth term of series.\n\n", i);
			flag1 = false;
		}
		if (3.14 <= value && value < 3.15 && flag2) // 3.14
		{
			printf("First two fraction digit is the same in %dth term of series.\n\n", i);
			flag2 = false;
		}
		if (3.141 <= value && value < 3.142 && flag3) // 3.141
		{
			printf("First three fraction digit is the same in %dth term of series.\n\n", i);
			flag3 = false;
		}
		if (3.1415 <= value && value < 3.1416 && flag4) // 3.1415
		{
			printf("First four fraction digit is the same in %dth term of series.\n\n", i);
			flag4 = false;
		}
		if (3.14159 <= value && value < 3.1416 && flag5) // 3.14159
		{
			printf("First five fraction digit is the same in %dth term of series.\n\n", i);
			flag5 = false;
		}
	} while (flag5);
}