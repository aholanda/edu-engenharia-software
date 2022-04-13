#include <stdio.h>
#include <stdlib.h>

int fatorial(int n)
{
	int i, fat=1;

	if (n<0 || n>12) {
		printf("n deve estar entre 0 e 12!\n");
		exit(-1);
	}

	for (i = 1, fat = 1; i <= n; i++)
		fat = fat * i;

	return fat;
}
