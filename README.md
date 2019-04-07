# CodingDojo - EM HIATO 💀
#### Este Repositório foi feito para compartilhar problemas resolvidos no Coding Dojo da FJN, uma iniciativa de [André Pereira](https://github.com/AndrePereiraSF) e [Levi Bastos](https://github.com/LeviBastosLima). Sinta-se livre para acessar as soluções, elas serão "commitadas" semanalmente. 

#### Todas serão escritas em Java (JDK 8), utilizando a IDE Eclipse Photon. ☕


# Primeira vez no Github? 👶

Se está é sua primeira vez acessando o Github, e não faz ideia de como obter os arquivos deste repositório, este tutorial será útil para guiá-lo. 

Para ter total acesso aos arquivos, você deve primeiramente instalar o **GIT**, que é o VCS utilizado pelo GitHub,  e clonar o repositório em sua máquina. Isso permite que você mantenha-se atualizado com os novos projetos, sem a necessidade de downloads repetitivos.

**Mas lembrando que, caso você prefira, pode naturalmente fazer o download dos arquivos em .zip clicando no botão verde do lado direito da tela.**
 
 
## 1. Instalando o git:octocat:

### Windows 🖥
Basta entrar [neste link](https://git-scm.com/download/win) e o download iniciará automaticamente. Com o instalador do git em mãos, não terá dificuldade, basta abrí-lo e clicar em *```next```* até o fim da instalação.

Para saber se a instalação foi um sucesso, basta clicar com o botão direito do mouse em qualquer diretório do seu computador e aparecerá como opção o **GIT GUI** e o **GIT BASH**, com isso sua instalação foi um sucesso.

### Linux 🐧
No ambiente Linux é tão simples quanto no Windows. Se sua distro é debian-based (Distros baseadas no Debian, como Ubuntu e Deepin) basta executar o seguinte comando no terminal:
```
$ sudo apt-get install git
```
Pronto! Agora o git está instalado no seu computador.

Caso você não utilize uma distro debian-based, basta seguir [este link](https://git-scm.com/download/linux) e encontrar as instruções para a sua distro.


## 2. Utilizando o git:octocat:

### Windows 🖥

#### Parte 1: 

Após a instalação ter sido um sucesso, você deverá criar ou ir na pasta onde deseja clonar o repositório(caso já tenha clonado, pule para a segunda parte), dentro desta pasta, você deve clicar com o botão direito e selecionar o **git bash**.

Dentro do terminal do **git bash** você deve colocar o comando que irá clonar o repositório:
```
$ git clone https://github.com/andre1126/CodingDojo.git
```
Se a clonagem tiver sido um sucesso, no diretório selecionado deverá aparecer uma pasta com os códigos, você também pode digitar um ```ls``` no terminal para conferir se a pasta está no diretório ou se na ultima linha do terminal estiver o seguinte comando:
```
Unpacking objects: 100% (??/??), done.
```
#### Parte 2:

Após ter um clone do repositório no seu computador, para não precisar ficar clonando sempre que surgir algo novo, iremos apenas atualizar o repositório existente em sua máquina, primeiramente vamos na pasta onde está o repositório e abriremos novamente o **git bash** com o botão direito do mouse

É possível atualizar sua pasta com o seguinte comando:
```
$ git pull
```


### Linux 🐧

Diferente do Windows, no ambiente Linux podemos executar os comandos do git diretamente pelo terminal, então não perca tempo e abra o terminal em seu computador.

Primeiro temos que clonar o repositório em alguma diretório do seu sistema. Ao clonar, será criado um diretório com o nome do repositório, portanto, navegue até uma pasta de fácil acesso. No meu caso, utilizei a pasta Documentos:
```
$ cd ~/Documentos/
```
Agora, vamos devemos executar o comando para clonar:
```
$ sudo git clone https://github.com/andre1126/CodingDojo.git
```
O processo de clonagem deve acabar logo, e com o comando ```cd CodingDojo && ls``` você pode checar se todos os arquivos estão na sua pasta. Pronto! Agora você tem uma cópia dos arquivos em seu computador, toda vez que precisar atualizar a pasta com novos arquivos, é só acessá-la via terminal e executar o seguinte comando:

```
$ git pull
```

Feito! Agora toda vez que um novo problema for "commitado" neste repositório, você só precisa executar esse último comando, evitando de ter que clonar os arquivos várias e várias vezes.
