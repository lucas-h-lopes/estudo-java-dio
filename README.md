# Pilares da Programação Orientada a Objetos (POO) 🏛️💻

É baseada em estruturação de _objetos_ com _características_ e _comportamentos_.
Tudo o que nos referimos são objetos (p.ex.: Conta bancária, Aluno, Veículo, Transferência, etc).

Para uma linguagem ser considerada Orientada a Objetos, ela deve seguir o que chamamos de _Os quatro pilares da POO_, são eles:

- Encapsulamento: Nem tudo que é desenvolvido precisa ser visível a todos.
    Exemplo: Ligar um veículo exige muitas etapas para a engenharia, mas o condutor só _visualiza_ a ignição, dar a partida e a "magia" acontece.
    ![imagem-codigo](https://iili.io/JgajAbt.md.png)

    ![imagem-codigo](https://iili.io/JgawRYQ.png)

- Herança: Características e comportamentos podem ser _herdados_ através de uma hierarquia de objetos.             
    Exemplo: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como acelerar e frear. Para evitar uma codificação redundante, podemos criar uma outra classe Veículo, e passar as características que são de _todos_ os veículos (Carro e Motocicleta) para eles (todo Carro e Motocicleta aceleram, todo Carro e Motocicleta possuem um ano de fabricação, e por ai vai).

    ![exemplo-codigo](https://iili.io/Jgar4qB.png)

    ![EXEMPLO-CODIGO](https://iili.io/Jga4I29.png)

    ![codigo](https://iili.io/Jga6Cua.png)
- Abstração: Indisponibilidade para determinar a lógica de um ou vários elementos em um objeto.

    ![codigo](https://iili.io/JgaPxRe.png)

        💡 Ver Polimorfismo!  
    Exemplo: _Veículo_ determina duas ações como acelerar e frear, logo esses comportamentos deverão ser abstratos pois existem mais de uma forma de se realizar a mesma operação.

        
- Polimorfismo: Representa as inúmeras maneiras de se realizar a mesma ação.
    Exemplo: Veículo determina duas ações como acelerar e frear, em primeiro momento precisamos identificar se estaremos falando de _Carro_ ou _Motocicleta_ para determinar a lógica de aceleração e frenagem dos respectivos veículos.

    ![codigo](https://iili.io/JgaiT7t.png)

    ![codigo](https://iili.io/JgaiXTu.png)
        Há diferentes formas de ligar um veículo, por mais que o método ainda seja ligar ( )