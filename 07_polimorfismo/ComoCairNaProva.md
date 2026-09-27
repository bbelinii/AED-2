# Como ordenação polimórfica pode cair

## 1. Completar um método genérico
Trocar comparação direta:

```java
v[j] > v[j + 1]
```

por:

```java
comparador.compare(v[j], v[j + 1]) > 0
```

## 2. Criar uma interface comum

```java
interface Ordenador<T> {
    void ordenar(T[] v, Comparator<T> c);
}
```

Depois implementar Bubble, Selection, Insertion, Merge, Quick e Heap.

## 3. Trocar algoritmo em tempo de execução

```java
Ordenador<Aluno> o = new OrdenadorQuick<>();
o.ordenar(alunos, porNota);

o = new OrdenadorHeap<>();
o.ordenar(alunos, porNome);
```

## 4. Trocar critério sem trocar algoritmo

Mesmo Quick Sort:
- por nota;
- por nome;
- crescente;
- decrescente (`comparador.reversed()`).

Isso é muito provável em uma atividade chamada “Ordenação Polimórfica em Sistemas de Software”.
