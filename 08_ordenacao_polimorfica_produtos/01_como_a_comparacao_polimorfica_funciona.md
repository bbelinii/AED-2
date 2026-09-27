# Como a comparação se conecta ao polimorfismo

No Quick Sort de inteiros você tinha:

```java
if (v[j] <= pivo)
```

Para produtos, neste exemplo de estudo, usamos:

```java
if (v[j].valorVenda() <= pivo.valorVenda())
```

O vetor é:

```java
Produto[]
```

mas cada posição pode guardar objetos concretos diferentes.

Quando o algoritmo chama:

```java
v[j].valorVenda()
```

Java executa o método do objeto real daquela posição.

Assim, a lógica do algoritmo continua a mesma; o valor usado na comparação pode vir de um comportamento polimórfico.
