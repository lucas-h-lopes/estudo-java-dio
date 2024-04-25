# Introdução à Classe Scanner 👨‍💻

Ao desenvolver aplicações, é comum que você queira ter uma maior interatividade com o usuário, através de receber entradas e decidir qual fluxo o programa seguirá com base nisso.

Em Java, podemos pegar entradas inseridas pelo usuário através dos _argumentos_ ao chamar a classe pelo console.

![codigo](https://iili.io/JU2pLvV.png)

![terminal](https://iili.io/JU3Fcb4.png)

```
String nome = args[0];
String sobrenome = args[1];
int idade = Integer.valueOf(args[2]);
double altura = Double.valueOf(args[3]);
```

## Problema ⚠️❗

Ao receber entradas utilizando _args_, nos deparamos com um problema: sem nenhuma indicação de qual deve ser a posição de cada dado, o programa passa a ter um alto risco de falha, pois o usuário pode informar, por engano ou desconhecimento, o nome como terceiro argumento, por exemplo, resultando num erro de conversão ao tentar armazenar uma String numa variável int.

## E agora? 🤔

Para solucionarmos o problema apresentado acima e melhorarmos a qualidade do código, vamos importar e utilizar duas classes, são elas:

```
- import java.util.Scanner;
- import java.util.Locale;
```

![codigo](https://iili.io/JU3nhdP.png)

![terminal](https://iili.io/JU3o5Cv.png)

Utilizando a classe Scanner, podemos dividir as entradas solicitadas em blocos, diminuindo a chance da aplicação falhar.

A linha _String nome = next()_ faz com que o terminal passe para próxima linha, armazenando na variável _nome_ o valor inserido pelo usuário.

Métodos como nextInt() e nextDouble() são para indicar que o dado inserido naquela linha será do tipo int e double, respectivamente.

## Conclusão 📖

Agora que conhecemos um pouco sobre a classe Scanner e suas utilidades, podemos explorar mais esse assunto desenvolvendo códigos mais interativos ao receber entradas do usuário. 🙂 
