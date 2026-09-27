# Gabarito resumido das ideias

1. Bubble otimizado: variável `trocou`; se falsa após passada, `break`.
2. Selection maior para fim: procurar `indiceMaior` em `0..fim` e trocar com `fim`.
3. Insertion subvetor: começar em `inicio + 1` e impedir `j` de passar de `inicio`.
4. Merge: dois ponteiros nas metades, copiar menor e depois copiar sobras.
5. Quick Lomuto: `i=inicio-1`, `j<fim`, troca final em `i+1`, retorna `i+1`.
6. Pivô do meio: pode mover o elemento do meio para o fim e usar Lomuto normalmente.
7. Heapify: comparar pai, esquerdo e direito; trocar com maior filho; continuar na posição para onde o antigo pai desceu.
8. Heap Sort: trocar raiz com `fim`, diminuir heap e `heapify(v, fim, 0)`.
9. Interface polimórfica: `void ordenar(T[] v, Comparator<T> c)`.
10. Critério muda pelo `Comparator`, algoritmo não precisa mudar.
