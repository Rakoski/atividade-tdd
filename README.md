# atividade-tdd

10 commits no total

## Divisão:

### commit test:

- [ x ] Estabelecimento dos testes e do que irei implementar
- [ x ] Determinação do escopo da class PasswordValidator e do método isValid
- [ x ] COnfiguração do Junit e mvn test
- [ x ] Tive dificultade em configurar o JUnit5 pois o intellij me recomendou a versão 2.x do maven sendo que eu precisava da versão 3.x pra funcionar no meu notbook já que era a versão do maven instalado

### commits feat:

- [ x ] Implementação dos métodos que foram testados
- [ x ] Percebi que em um dos refactors não tinha incluído caracteres especiais, corri pra fazer essa feature
- [ x ] Tive dificuldade em fazer o specialCharacters pois estava tentando literalmente fazer um array de chars ao invés de uma string

### commits refactor: 

- [ x ] Refatoração da classe e do método isValid para melhor legibilidade
- [ x ] Tive dificultade em encontrar uma classe (que eventualmente era a Character) que fazia tudo que eu precisava de uma forma mais legível, eu sabia que ela existia mas tive que pesquisar pra descobrir que era a "Character"

Eu acho que o TDD e o jeito q ele me obrigou a pensar no comportamento esperado da validação antes mesmo de me preocupar com a sintaxe do Java me deu a confiança de por exemplo trocar os meus próprios métodos pelos da classe Character sem sentir medo de quebrar em prod/não dar certo
