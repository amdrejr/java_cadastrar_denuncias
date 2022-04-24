# java_cadastro_denuncias
## Aplicação Desktop Java com framework Swing. Cadastrar denúncias de usuários e login simples.
 
### Wireframes

Abaixo, temos os prints referente ao resultado final da aplicação.
Nesta primeira imagem trata-se da tela de login, a onde o usuário preencherá suas credenciais, e caso possua um acesso cadastrado, conseguirá conectar na aplicação. 
 
![image](https://user-images.githubusercontent.com/98674448/164956200-3310c9c3-094a-446c-92be-10298e57b6ac.png)

Não há um banco de dados dedicado para o cadastro dos usuários, apenas uma verificação interna no próprio código, que pode ser encontrada na classe Usuários e no algoritmo desenvolvido ao clicar no botão ‘Fazer Login’.
Caso o usuário venha preencher seu acesso ou senha errada, será apresentado um campo explicitando qual o problema, como nas imagens abaixo:
Ao preencher a senha de forma errada:

![image](https://user-images.githubusercontent.com/98674448/164956210-9c3a6e7c-2e0b-4c44-aa8c-cfc8ee074735.png)

Caso o usuário não esteja cadastrado:
 
![image](https://user-images.githubusercontent.com/98674448/164956216-d121506f-6f28-49fe-82d0-4ebe7027f6ee.png)

Ao preencher os campos com credenciais que estejam cadastradas e clicar no botão ‘Fazer Login’, será direcionado para a próxima tela, que tem como principal função cadastrar as denúncias, assim como solicitado na proposta:
 
![image](https://user-images.githubusercontent.com/98674448/164956220-9f8d7756-9004-452b-afb7-e80d5589a08e.png)

Nesta tela, encontramos um label na parte superior, com um título ‘DENUNCIAR OCORRENCIAS’. Logo abaixo, temos um TextField, onde será preenchido com a denúncia a ser reportada. Abaixo um Button, responsável por cadastrar a denúncia, e nos cantos inferiores mais dois Buttons, um a esquerda, para se desconectar, voltando a tela de login, e o outro a direita, que ao clicar será aberto a tela com as denúncias cadastradas, onde podemos ver na próxima imagem:
 
![image](https://user-images.githubusercontent.com/98674448/164956226-37cf0971-5804-41e4-9b32-0f5599364f72.png)

Na imagem acima, temos a tela de cadastro de denúncias, nela encontramos uma Table que é listada as denúncias feitas. Para exemplificação, foram criadas 4 denúncias.
A tabela é dividida em três columns, onde na primeira encontramos o nome do usuário que veio a cadastrar a denúncia, na segunda o horário, que é coletado no exato momento em que o usuário cria a denúncia, e a terceira, a descrição da denúncia. 

