# Bubble Sort

## Ideia
Compara vizinhos. Se estiverem fora de ordem, troca.

Depois de uma passada completa, o maior elemento da parte ativa chega ao final.

## Padrão de prova

```java
for (int fim = n - 1; fim > 0; fim--) {
    for (int j = 0; j < fim; j++) {
        if (v[j] > v[j + 1]) {
            trocar(...);
        }
    }
}
```

## Variações comuns
- versão clássica;
- versão otimizada com `trocou`;
- ordem decrescente;
- contar comparações e trocas;
- ordenar objetos com `Comparator`.
