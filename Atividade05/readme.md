## Exercícios 05 – Parte 1

### 1. Qual a principal imagem relacionada ao princípio e qual a explicação sobre ela?

<img src="https://miro.medium.com/v2/resize:fit:750/1*g6TcTe-lwlyYKbLSc0RYNw.jpeg" width="400">

A imagem em questão mostra um objeto com várias entradas USB e apenas um conector. Como é possível observar, tal configuração viola o ISP, pois demonstram um claro excesso de métodos (entradas) que não serão utilizadas. O ISP prega que uma interface não deve forçar uma classe a implementar coisas que não irá utilizar, ou seja, tal princípio defende interfaces mais "limpas", com métodos mais específicos, e não uma coletânea destes.

### 2. Por que devemos segregar implementações através do uso de interfaces?

Isso facilita a manutenção e evolução do sistema, além de promover a reutilização de componentes de interface em diferentes contextos.

### 3. Podemos dizer que esse princípio é correlato ao Single Responsability Principle pelo fato de que classes e interfaces devem ter um único “foco” (SRP) e que as interfaces com métodos não correlatos devem ser segregadas (ISP)?

Sim, pois ambas partem do mesmo princípio, porém são aplicadas em contextos distintos. O SRP é aplicado a classes concretas e o ISP a interfaces, mas no fim, ambos vizam tornar as partes do código mais específicas e pouco acopladas.

### 4. Comente as seguintes frases à luz do ISP:
#### a. “Nenhum cliente deve ser forçado a depender de métodos que ele não usa”;

Neste contexto, "cliente" não se refere ao usuário final, mas sim às classes e algoritmos que dependem de uma interface dentro do sistema.

#### b. “Classes não devem ser forçadas a implementar interfaces que não usam”;

Classes com métodos que não utiliza apenas inflam o código e dificultam a manutenção do sistema, comprometendo também sua legibilidade.

### Pesquise a respeito do Dependency Invertion Principle (DIP) e responda as questões abaixo:

### 5. Qual a principal imagem relacionada ao princípio e qual a explicação sobre ela?

<img src="https://miro.medium.com/v2/resize:fit:720/format:webp/1*Fm_6woXqebKY0zOokzEt7g.jpeg" width="400">

O DIP ou Dependency Inversion Principle (Princípio da Inversão de Dependência) prega que devemos depender de abstrações e não de implementações. Na imagem em questão, a tomada representa a abstração, a interface; enquanto a sugestão de soldar a lâmpada diretamente na parede representa classes concretas, feitas com baixo nível de abstração, portanto, mais acopladas.

### 6. O que você entende por programar para Interfaces?

Programar para interfaces significa programar através de abstrações e não por meio de implementações concretas, tornando o código menos acoplado e mais flexível.

### 7. Cite um exemplo em que uma mudança em uma dependência, por exemplo, banco de dados, ou mecanismo de autenticação ou conexão via sockets poderia impactar uma implementação de outros módulos.

Um exemplo seria a implementação de um sistema de autenticação que utiliza o banco de dados para armazenar os dados dos usuários. Caso seja necessário alterar o banco de dados, por exemplo, de SQLite para PostgreSQL, será necessário alterar a implementação do sistema de autenticação, pois a classe que realiza a conexão com o banco de dados está acoplada à classe de autenticação.

### 8. Estude o conteúdo do link abaixo e explique como o DIP se aplicaria:

https://pt.stackoverflow.com/questions/101692/como-funciona-o-padr%C3%A3o-repository

O padrão repository parte do princípio de abstrair a persistência de dados, sendo comum, mas não obrigatório, que ele seja implementado através de uma interface ou classe abstrata que estabelece o contrato básico do que pode ser feito para persistir tais dados, sendo esta a aplicabilidade do DIP neste contexto.

### 9. Você acha que esse princípio deveria ser um dos primeiros em um eventual “check-list” de princípios SOLID a aplicarmos?

Sim, pois se desde o princípio focarmos na criação de interfaces e, portanto, classes pouco acopladas, teremos um código de fácil manutenção, com chances reduzidas de erros que impeçam a execução do algoritmo.

### 10. Numa visão geral, considera que se começarmos pelos 4 primeiros princípios SOLID, fatalmente o DIP já estaria implementado?

Sim, pois a implementação dos 4 primeiros princípios SOLID acabam por gerar algoritmos pouco acoplados, com grande número de interfaces e classes concebidas a partir de um alto nível de abstração.
