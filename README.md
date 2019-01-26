**Design Patterns**
Padrões de Projeto

Nome - Problema - Solução - Consequencias



Singleton  (Criação)

Não permite que haja duas ou mais instancias de uma determinada classe
no projeto (Ex.: conexão com banco de dados )

Factory Method (Criação)

Facilita a criação de objetos que a classe não foi 
especificada, criando uma interface cujo as subclasses 
que implementarem este método dirá como o objeto será criado

Builder (Criação)

Auxilia na criação de objetos complexos

Abstract Factory (Criação)

Fornece um interface para criar uma familias de objetos dependentes
sem especificar suas classes concretas

MVC (Criação)

Isola a camada lógica da interface gráfica por meio de um controlador, com isso
temos uma maior reusabilidade de código, pois cada uma das camadas 
fica responsável por uma funcionalidade específica do projeto

Decorator (Estrutural)

adiciona novas funcionalidades em um objeto existente sem mexer em sua estrutura

Strategy (Comportamental)

visa um refatoramento sutil quando grupos de algoritmos utilizam uma estratégia, porém
é necessário mudança, o Strategy faz essa mudança de forma a não atrapalhar os demais que
utilizam da estratégia anterior

State (Comportamental)

altera o estado de determinado objeto

Adapter (Comportamental)

Visa adaptar a relação entre dois objetos incompatíveis

Facade 

Permite criar uma frente para lidar com diversos módulos do projeto
evitando assim o acesso unitário 