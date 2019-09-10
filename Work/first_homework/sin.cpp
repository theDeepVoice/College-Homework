#include <stdio.h>
#include <math.h>


int main()
{
	int  sign = 1;
	double x, demo=1.0;
	scanf_s("%lf", &x);
	double sum = 0;

	while (1.0/demo > 10e-30) {
		sum = sum + sign * (pow(x, 2) * x / demo);
		
		sign = -sign;
		x = pow(x, 2) * x;
		
		demo = demo * (demo + 1) * (demo + 2);
	}
	
	printf("%lf", sum);

	printf("\n%lf", sin(1));
	return 0;
}