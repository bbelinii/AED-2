# Erros comuns em Quick Sort

1. Usar `j <= fim` em Lomuto e acabar comparando o pivô com ele mesmo.
2. Esquecer `i = inicio - 1`.
3. Esquecer a troca final do pivô com `i + 1`.
4. Retornar `i` em vez de `i + 1`.
5. Chamar recursão incluindo o pivô novamente: `quickSort(inicio, p)` na versão Lomuto.
6. Confundir Hoare com Lomuto: as fronteiras recursivas são diferentes.
7. Achar que são criados novos vetores: normalmente é o mesmo array e só mudam `inicio` e `fim`.
8. Não perceber o caso base `inicio < fim`.
