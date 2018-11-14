# CodingDojo
#### Este Repositório foi feito para compartilhar problemas resolvidos no Coding Dojo do 2º Semestre da FJN. Sinta-se livre para acessar as soluções, elas serão "commitadas" semanalmente. 

#### Todas serão escritas em Java (JDK 8), utilizando a IDE Eclipse Photon. ☕


# Primeira vez no Github? 👶

Se está é sua primeira vez acessando este repositório, e não tem ideia de como obter os arquivos, este tutorial será útil para guiá-lo. 

Para utilizar o GitHub e ter total acesso aos arquivos, você deve primeiramente instalar o **GIT**, e clonar o repositório em sua máquina. Isso permite que você mantenha-se atualizado com os novos projetos, sem a necessidade de downloads repetitivos.

**Mas lembrando que, caso você prefira, pode naturalmente fazer o download dos arquivos em .zip clicando no botão verde do lado esquerdo da tela.**
 
 
## 1. Instalando o git

### Windows 🖥
Basta entrar [neste link](https://git-scm.com/download/win) e o download iniciará automaticamente, com o instalador do git em mãos não terá dificuldade, basta abri-ló e sair clicando em *```next```*.

Para saber se a instalação foi um sucesso, basta clicar com o botão direito do mouse em qualquer local e aparecerá o **GIT GUI** e o **GIT BASH**, com isso sua instalação foi um sucesso.

### Linux 🐧
No ambiente Linux é tão simples quanto no Windows. Se sua distro é debian-based (Distros baseadas no Debian, como Ubuntu e Deepin) basta executar o seguinte comando no terminal:
```
$ sudo apt-get install git
```
Pronto! Agora o git está instalado no seu computador.

Caso você não utilize uma distro debian-based, basta seguir [este link](https://git-scm.com/download/linux) e encontrar as instruções para a sua distro.


## 2. Utilizando o git

### Windows 🖥

#### Parte 1: 

Após a instalação ter sido um sucesso, você deverá criar ou ir na pasta onde deseja clonar o repositório(caso já tenha clonado, pule para a segunda parte), dentra desta pasta, você deve clicar com o botão direito e selecionar o **git bash**.

Dentro do terminal do **git bash** você deve colocar o comando que irá clonar o repositório:
```
$ git clone https://github.com/andre1126/CodingDojo.git
```
Se a clonagem tiver sido um sucesso, no diretório selecionado deverá aparecer uma pasta com os códigos, você também pode digitar um ```ls``` no terminal para conferir se a pasta está no diretório ou se na ultima linha do terminal estiver o seguinte comando:
```
Unpacking objects: 100% (??/??), done.
```
#### Parte 2:

Após ter um clone do repositório no seu computador, para não precisar ficar clonando sempre que surgir algo novo, iremos apenas atualizar o repositório existente em sua máquina, primeiramente vamos na pasta onde está o repositório e abrimeros novamente o **git bash** com o botão direito do mouse

É possível atualizar sua pasta com o seguinte comando:
```
$ git pull https://github.com/lenossa/lenossamake.git master
```


### Linux 🐧

Diferente do Windows, no ambiente Linux podemos executar os comandos do git diretamente pelo terminal, então não perca tempo e abra o terminal em seu computador.

Primeiro temos que clonar o repositório em alguma pasta do seu sistema. Recomendamos que use uma pasta vazia, portanto, você pode criar uma usando o comando:
```
$ sudo mkdir nome-da-pasta
```
Agora, navegue até a pasta com o comando:
```
$ cd nome-da-pasta
```
Já dentro da pasta vazia, você deve executar somente:
```
$ sudo git clone https://github.com/andre1126/CodingDojo.git
```
O processo de clonagem deve acabar logo, e com o comando ```ls``` você pode checar se todos os arquivos estão na sua pasta.
Pronto! Agora você tem uma cópia dos arquivos em seu computador, toda vez que precisar atualizar a pasta com novos arquivos acessá-la via terminal e executar os seguintes comandos.

Para configurar suas credenciais:
```
$ git config --global user.name "Coloque seu nome de usuário aqui"
$ git config --global user.email "Coloque seu email aqui"
```

Para configurar seu git com este repositório, este comando irá solicitar as credencias de sua conta no GitHub:

```
$ git remote add origin https://github.com/andre1126/CodingDojo.git
```

E por fim, para atualizar sua pasta:
```
$ git pull origin master
```

Agora que você já configurou seu repositório local com o Coding Dojo, basta que toda vez que um novo problema for "commitado" neste repositório, você execute o último comando mostrado.
