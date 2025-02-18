Descrição das Pastas e Arquivos:

# Space-X-Launches

## Projeto Back end Java de uma API Graphql para consulta de registros de lançamentos de foguetes da SapaceX.

** spacex-launches/: Diretório raiz do projeto.

** src/main/java/com/seunome/spacexlaunches/: Pacote base do projeto.

** controller/: Contém classes responsáveis por lidar com as requisições HTTP.

** LaunchController.java: Controlador REST para endpoints relacionados aos lançamentos. model/: Define as classes de modelo que representam os dados da aplicação.

** Launch.java: Classe que representa um lançamento da SpaceX.

** Rocket.java: Classe que representa um foguete da SpaceX.

** repository/: Contém interfaces para acesso aos dados.

** LaunchRepository.java: Interface para operações de persistência relacionadas aos lançamentos. service/: Contém classes que implementam a lógica de negócio.

** SpaceXService.java: Classe que consome a API da SpaceX e processa os dados. resolver/: Contém classes que resolvem as queries do GraphQL.

** LaunchResolver.java: Classe que mapeia as queries GraphQL para os métodos correspondentes. SpacexLaunchesApplication.java: Classe principal que inicializa a aplicação Spring Boot.

** src/main/resources/: Contém recursos da aplicação.

** graphql/: Armazena os schemas GraphQL.

** schema.graphqls: Arquivo que define o schema GraphQL da aplicação. application.properties: Arquivo de configuração da aplicação.

** static/graphiql/: Contém arquivos estáticos para a interface GraphiQL.

** index.html: Interface para testar as queries GraphQL. src/test/java/com/seunome/spacexlaunches/: Contém classes de teste.

** SpacexLaunchesApplicationTests.java: Classe para testes unitários da aplicação. pom.xml: Arquivo de configuração do Maven, onde são declaradas as dependências do projeto.
