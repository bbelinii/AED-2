# Quick Sort — foco de prova

## Versão principal estudada: Lomuto

Escolhe normalmente o último elemento como pivô.

- `j` percorre o intervalo.
- `i` marca o final da região dos menores/iguais ao pivô.
- quando `v[j] <= pivo`, incrementa `i` e troca `v[i]` com `v[j]`.
- no final, coloca o pivô em `i + 1`.
- retorna `i + 1` para o Quick Sort saber onde dividir.

## Recursão

```text
p = particionar(...)
quickSort(inicio, p - 1)
quickSort(p + 1, fim)
```

O vetor é sempre o MESMO objeto. O que muda é somente o intervalo `inicio..fim`.

## Variações que podem cair
- Lomuto com último pivô;
- pivô no primeiro elemento;
- pivô no meio;
- Hoare com dois ponteiros;
- ordem decrescente;
- ordenar só um subvetor;
- contar comparações/trocas;
- versão genérica com Comparator.
