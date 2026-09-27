# Atenção: produto vencido

Na oficina, um produto perecível vencido não pode ter seu `valorVenda()` solicitado.

Por isso, se uma ordenação usar `valorVenda()` como chave e existir um produto vencido no vetor, a própria comparação pode gerar erro/exceção.

Isso é uma boa discussão de prova:

- o algoritmo de ordenação está correto;
- mas o domínio do objeto impõe uma regra adicional;
- antes de ordenar por `valorVenda()`, os objetos precisam estar em um estado em que essa operação seja permitida.

No material de exemplo, todos os produtos criados estão válidos.
