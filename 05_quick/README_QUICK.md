# Quick Sort — foco aprofundado

## Ideia
O Quick Sort escolhe um pivô, coloca esse pivô em uma posição que separa menores e maiores e chama o próprio algoritmo nos intervalos restantes.

```text
[ parte esquerda ] | PIVÔ | [ parte direita ]
```

## Versão Lomuto
Na versão principal deste material, o último elemento é o pivô.

- `j` percorre os elementos de `inicio` até `fim - 1`;
- `i` marca o último índice da região dos menores/iguais ao pivô;
- quando `v[j] <= pivo`, fazemos `i++` e trocamos `v[i]` com `v[j]`;
- ao final, o pivô é colocado em `i + 1`;
- `return i + 1` devolve a posição definitiva do pivô.

## Recursão

```java
int p = particionar(v, inicio, fim);
quickSort(v, inicio, p - 1);
quickSort(v, p + 1, fim);
```

Todas as chamadas recebem uma referência para o **mesmo array**. O que muda é somente o intervalo `inicio..fim`.

## Caso base

```java
if (inicio < fim)
```

Se `inicio == fim`, existe apenas um elemento naquele intervalo.
Se `inicio > fim`, o intervalo está vazio.
Nos dois casos não há nada para ordenar.

## Arquivos
- `QuickLomuto.java` — principal.
- `QuickLomutoPassoAPasso.java` — imprime o processo.
- `QuickHoare.java` — outra partição importante.
- `QuickPivoPrimeiro.java` — pivô no primeiro elemento.
- `QuickPivoMeio.java` — pivô escolhido no meio.
- `QuickDecrescente.java` — ordem decrescente.
- `QuickSubvetor.java` — ordena somente um intervalo.
- `QuickContadores.java` — comparações/trocas.

## Variações que podem aparecer
- mudar escolha do pivô;
- completar `particionar`;
- explicar `return i + 1`;
- prever valores de `i` e `j`;
- mostrar sequência de chamadas recursivas;
- ordenar decrescente;
- receber `Produto[]` em vez de `int[]`.

## Complexidade
- médio: O(n log n);
- pior: O(n²), quando as partições ficam muito desequilibradas.
