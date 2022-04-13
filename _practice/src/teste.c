#include <stdio.h>

int fatorial(int);
float media(float[], int);

int main()
{
	int falhou = 0;
	float v[4] = {3.0, 4.0, 5.0, 8.0};
	
	if (fatorial(4) != 24) {
		fprintf(stderr, "ERRO: Teste falhou para fatorial()!\n");
		falhou = 1;
	}

	if (media(v, 4) != 5.0) {
		fprintf(stderr, "ERRO: Teste falhou para fatorial()!\n");
		falhou = 1;
	}
	
	if (!falhou) {
		printf("Testes executados com sucesso!\n");
	}
	
	return 0;
}
