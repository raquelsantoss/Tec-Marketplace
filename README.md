# Tec-Marketplace

<p>Projeto final da matéria de Programação Orientada a Objetos: Marketplace para venda de equipamentos de informática</p>

## Como rodar o projeto:

- Primeiramente é preciso configurar da seguinte forma:
- [ ] Abrir o application.properties e no ```spring.mail.username=``` e colocar o seu email para receber um token e acessar a sua conta.
 **Para que a nossa aplicação se conecte a sua conta Gmail é necessário ir em: Gerir conta Google -> Segurança -> Ativar autenticação de dois fatores -> ir na parte inferior da pág. e apertar em
Senhas de App -> copiar senha gerada**.
- [ ] Copiar senha gerada no item anterior e passar em ```spring.mail.password=```.
- [ ] Acessar o MySQL Workbench e criar um banco chamado **marketdatabase** (o nome precisa ser exatamente esse) para que as tabelas sejam geradas ou mudar o ```spring.datasource.url=```
caso prefira outro nome.
- Para acessar o Admin Portal, ultilize como usuário e senha a palavra: **admin**.
## **OBS:**
- Caso cadatre um produto e a imagem não apareça, dê um refresh na pasta ```image```. 
- Para que a imagem apareça nos produtos do Marketplace é necessário estar com o Admin Portal rodando.
