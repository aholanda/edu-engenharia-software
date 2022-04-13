float media(float v[], int N)
{
	int i;
	float soma = 0.0;

	for (i = 0; i < N; i++)
		soma += v[i];

	return soma/N;
}
