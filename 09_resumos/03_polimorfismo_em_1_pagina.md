# Polimorfismo + Ordenação em 1 página

Polimorfismo permite tratar implementações diferentes por uma mesma interface.

```java
Ordenador<Aluno> o;

o = new OrdenadorBubble<>();
o = new OrdenadorQuick<>();
o = new OrdenadorHeap<>();
```

Todos possuem:

```java
void ordenar(T[] vetor, Comparator<T> comparador)
```

O `Comparator` separa o **critério** do **algoritmo**.

```java
Comparator<Aluno> porNome = Comparator.comparing(Aluno::getNome);
Comparator<Aluno> porNota = Comparator.comparingDouble(Aluno::getNota);
```

Assim:
- mesmo Quick pode ordenar por nome ou nota;
- mesmo critério pode ser usado por Bubble, Merge, Heap etc.;
- a aplicação pode trocar o algoritmo sem mudar quem chama.
