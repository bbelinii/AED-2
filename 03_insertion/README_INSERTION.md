# Insertion Sort

## Ideia
A parte esquerda do vetor é tratada como já ordenada.

A cada rodada:
1. pega `chave = v[i]`;
2. desloca para a direita os elementos maiores que a chave;
3. encaixa a chave no espaço criado.

## Ponto que costuma cair
Insertion normalmente desloca elementos; não precisa ficar trocando a chave várias vezes.
