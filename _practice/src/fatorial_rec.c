#include <stdio.h>
#include <stdlib.h>

int fatorial(int n)
{
	if (n==1)
		return 1;
	else if (n<=12)
		return n*fatorial(n-1);
	else {
		printf(stderr, "n deve estar entre 0 e 12!\n");
		exit(-1);
	}
}
