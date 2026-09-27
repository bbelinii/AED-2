# Bubble Sort

## Ideia
Compara elementos vizinhos. Se estiverem fora de ordem, troca.

```text
[5, 2, 4, 1]
5 > 2 -> troca
5 > 4 -> troca
5 > 1 -> troca
```

Ao fim da primeira passada, o maior chegou ao final.

## Arquivos
- `BubbleBasico.java` — versão principal.
- `BubbleOtimizado.java` — para cedo quando nenhuma troca acontece.
- `BubbleDecrescente.java` — inversão da comparação.
- `BubbleContadores.java` — comparações e trocas.

## Variações comuns em prova
- crescente x decrescente;
- vetor já ordenado e flag `trocou`;
- contar comparações/trocas;
- rastrear uma ou duas passadas;
- adaptar de `int[]` para `Produto[]` comparando algum valor do objeto.

## Complexidade
- tradicional: O(n²);
- otimizado: melhor caso O(n).
