# Complexidades

| Algoritmo | Melhor | Médio | Pior | Memória extra | Estável? |
|---|---:|---:|---:|---:|---|
| Bubble otimizado | O(n) | O(n²) | O(n²) | O(1) | Sim |
| Selection | O(n²) | O(n²) | O(n²) | O(1) | Não |
| Insertion | O(n) | O(n²) | O(n²) | O(1) | Sim |
| Merge | O(n log n) | O(n log n) | O(n log n) | O(n) | Sim |
| Quick | O(n log n) | O(n log n) | O(n²) | O(log n) médio | Não |
| Heap | O(n log n) | O(n log n) | O(n log n) | O(1) | Não |

## O que costuma cair

- Bubble: por que o otimizado pode virar O(n)?
- Selection: número de comparações quase não muda com a entrada.
- Insertion: excelente quando o vetor já está quase ordenado.
- Merge: sempre divide e usa vetor auxiliar para intercalar.
- Quick: depende da qualidade do pivô.
- Heap: garante O(n log n) mesmo no pior caso.
