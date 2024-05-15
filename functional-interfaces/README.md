# Stream API

## Map ( )

Utilizado para __modificar__ os itens de uma lista, por exemplo:

```
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

List<Integer> numerosDobrados = numeros.stream()
    .map(nu -> nu*2)
    .toList();

numerosDobrados.forEach(n -> System.out.println(n));
```

O trecho de código acima armazena cada item de numeros multiplicado por 2 em numerosDobrados.

## Filter ( )

Utilizado para __filtrar (verdadeiro ou falso)__ os elementos de uma lista, por exemplo:

```
List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6);

List<Integer> listaNumerosPares = listaNumeros.stream()
    .filter(numero -> numero % 2 == 0) //filtra os elementos do array baseado na condição( )
    .toList(); //converte para lista 
```

O _filter_ no trecho de código acima faz uma verificação: o valor é armazenado na variável listaNumerosPares __somente se__ a condição _numero -> numero % 2 == 0_ for satisfeita.

## Generate ( )

Utilizado para __gerar__ valores e __armazená-los__ numa lista, por exemplo:

```
List<String> listaComGenerate = Stream.generate( () -> "Teste" )
    .limit(5) 
    .toList();

System.out.println(listaComGenerate);
```

O exemplo de código acima armazenará na variável listaComGenerate 5 vezes a String "Teste".



```  O método generate() não recebe parâmetros na função Lambda, deve ser representado por parênteses vazios (). Para reforçar, aqui está um exemplo   ... generate( () -> ... ) ```

## Reduce ( )

Utilizado para __somar__ (ou alguma outra operação) todos os elementos de uma lista, por exemplo:

```
List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
int resultado = numeros.stream()
    .reduce(0, (num1, num2) -> num1 + num2);

System.out.println("A soma dos números é " + resultado);
//imprime: A soma dos números é 21
```

```  O método reduce() recebe dois parâmetros, sendo o primeiro (identity) a variável temporária onde será armazenado a soma (por exemplo), e o segundo parâmetro a operação a ser feita (recebe dois elementos), seguido de um Lambda para indicar o que será feito com os dois elementos informados.```

## forEach ( )

Utilizado para __realizar alguma ação__ para __todos os elementos de uma lista__, por exemplo:

```
List<String> listaDePalavras = Arrays.asList("Carregador", "Mouse", "Teclado");

listaDePalavras.forEach(palavra -> System.out.println(palavra));

/* Utilizando Method Reference
    listaDePalavras.forEach(System.out::println);
*/
```
O resultado para o trecho de código acima é:
Carregador
Mouse
Teclado

## toList ( )

Converte para lista, útil para filtrar os valores de uma lista e __armazená-los em outra__ por exemplo:

```
List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6);
         
List<Integer> listaNumerosPares = listaNumeros.stream()
    .filter(numero -> numero % 2 == 0) //filtra os elementos do array baseado na condição( )
    .toList(); //converte para lista 
```

Sem o método _toList( )_, não seria possível armazenar na lista listaNumerosPares, pois a conversão de _Predicate_ para _List_ não é feita automaticamente.


