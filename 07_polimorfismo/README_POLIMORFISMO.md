# Ordenação Polimórfica usando os 6 algoritmos estudados

A ideia aqui não é aprender novos algoritmos.
É usar os mesmos seis algoritmos com objetos e critérios diferentes.

## Peças principais

### `Comparator<T>`
Diz como comparar dois objetos.

Exemplo:
- aluno por nota;
- aluno por nome;
- aluno por matrícula.

### `Ordenador<T>`
Interface comum para qualquer algoritmo de ordenação.

Assim podemos escrever:

```java
Ordenador<Aluno> ordenador;
ordenador = new OrdenadorQuick<>();
ordenador.ordenar(alunos, porNota);

ordenador = new OrdenadorHeap<>();
ordenador.ordenar(alunos, porNome);
```

A variável tem o tipo da interface, mas em tempo de execução pode apontar para implementações diferentes: isso é polimorfismo.
