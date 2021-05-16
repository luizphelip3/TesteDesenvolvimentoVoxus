Ferramentas de desenvolvimento utilizadas e necessárias para funcionamento da solução:
Eclipse IDE com Perspective Java EE setada;
JBoss Forge para construção de dependências e libs;
Servidor Wildfly;
Banco de Dados: MySQL;
Insomnia para validação de API;
Tutorial de instalação e configuração do MySQL caso você não tenha ele instalado na sua máquina: https://www.alura.com.br/artigos/mysql-do-download-e-instalacao-ate-sua-primeira-tabela?gclid=CjwKCAjw07qDBhBxEiwA6pPbHpA0Fco_zHpgnczDjnqOKeRInVrLtR-f4LGJEAxmyVanPPyznmmEuBoCg-kQAvD_BwE

•	Instruções para instalação do JBoss Forge:
1.	No Eclipse acesse o menu Help > Install New Software...
2.	No campo Work with cole o endereço do JBoss Tool e tecle enter:
(https://download.jboss.org/jbosstools/photon/stable/updates/)
3.	Digite Forge no filtro e selecione o Forge Tools do Java EE
4.	Clique em Next, aceite os termos e clique em Finish. O Eclipse será reinicializado.
5.	Para exibir o Forge Console aperte Ctrl + 3 > forge > enter. 



•	Instruções para instalação do WildFly:
1. Com o Eclipse IDE instalado clique em Servers para criar um novo servidor;
2. Filtre por WildFly e selecione a opção conforme a figura: 
 
3. Clique em Next, 
4. Aceite os termos,
5. Clique em Finish.

Para criar um servidor de aplicação, repita o passo 1 e agora selecione a opção WildFly 22.

Como rodar o programa:
Depois de importado o projeto dentro da sua workspace devidamente configurada do Eclipse você deve alterar o arquivo persistence.xml localizado em:   
Ao abrir o arquivo você deverá alterar a visualização de General para Source com um duplo-clique:
 
As alterações devem ser feitas nestas linhas:  
Na linha 11 o value=”root” deverá ser alterado para o usuário setado no seu banco de dados e na linha 12 o value=”130302” deverá ser alterado para a senha do usuário setado no seu banco de dados. Pressione ctrl + s para salvar as alterações feitas.


Feito isso, agora você deverá adicionar o projeto ao seu WildFly Server.
Clique na aba Servers e clique com o botão direito em WildFly 23. 
Seleciona a opção Add and Remove...
Do lado esquerdo clique o projeto a ser adicionado, e em seguida clique em “Add >”.
Clique em Finish.
Depois de feito esse processo, clique com o botão direito em projectVoxus e em seguida em “Start”.
 

Endpoints API: 
POST: http://localhost:8080/testeVoxus/api/posts
JSON:
{
    "content": "Content",
    "tag":"Tag",
    "title": "Title"
  }
PUT: http://localhost:8080/testeVoxus/api/posts/1
JSON: {
    "content": "content",
    "tag": "tag",
    "title": "title"
  }
DELETE: http://localhost:8080/testeVoxus/api/posts/id
Em “id” insira o ID do post que deseja deletar.
GET: http://localhost:8080/testeVoxus/api/posts/id
Em “id” insira o ID do post que deseja verificar todos os componentes guardados no banco faça a inserção sem o dado de ID: http://localhost:8080/testeVoxus/api/posts/.

A maior dificuldade que tive no desenvolvimento desse trabalho foi da parte de front end... Utilizei de APIs como PrimeFaces e Bean para facilitar o processo. 
E a parte de desenvolvimento que mais tive apreço em desenvolver foi a da API, mesmo sendo a parte mais trabalhosa, é onde me encontro no mundo da programação.
