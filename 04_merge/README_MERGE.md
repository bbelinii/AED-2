# Merge Sort

## Ideia
Divide o intervalo no meio até chegar em partes com 1 elemento.
Depois intercala duas partes já ordenadas.

## Estrutura mental

```text
mergeSort(inicio, fim)
  meio
  mergeSort(esquerda)
  mergeSort(direita)
  merge(esquerda, direita)
```

## Pegadinhas
- `meio = (inicio + fim) / 2`;
- condição de parada: `inicio < fim`;
- o `merge` usa temporários;
- as duas metades precisam estar ordenadas antes da intercalação.
