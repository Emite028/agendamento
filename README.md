
# Sistema de Agendamento para Salão de Beleza

Sistema desenvolvido em Java com o objetivo de auxiliar no gerenciamento das informações de um salão de beleza, utilizando operações CRUD (Create, Read, Update e Delete).

O projeto busca organizar o desenvolvimento de uma solução para gerenciamento de dados, aplicando conceitos de programação e estruturação de software.

## Sumário

- [Sobre o projeto](#sobre-o-projeto)
- [Objetivos](#objetivos)
- [Funcionalidades](#funcionalidades)
- [Tecnologias utilizadas](#tecnologias-utilizadas)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Execução](#execução)
- [Contribuição](#contribuição)
- [Autor](#autor)
- [Licença](#licença)

## Sobre o projeto

O Sistema de Agendamento para Salão de Beleza é um projeto desenvolvido em Java para apoiar o gerenciamento de informações relacionadas às atividades de um salão.

A proposta do sistema é utilizar operações CRUD para permitir a criação, consulta, atualização e exclusão de registros, conforme as funcionalidades implementadas na aplicação.

O projeto utiliza Gradle para a configuração e o gerenciamento do processo de build.

## Objetivos

- Desenvolver uma aplicação utilizando Java.
- Aplicar operações CRUD no gerenciamento de informações.
- Organizar o código-fonte de forma estruturada.
- Facilitar a manutenção e a evolução do sistema.
- Aplicar conceitos de desenvolvimento de software em um cenário prático.

## Funcionalidades

O projeto tem como foco operações CRUD para um contexto de salão de beleza.

- **Create:** criação de novos registros.
- **Read:** consulta de registros existentes.
- **Update:** atualização de informações cadastradas.
- **Delete:** exclusão de registros.

A disponibilidade e o comportamento de cada operação dependem das implementações presentes no código-fonte.

## Tecnologias utilizadas

| Tecnologia | Finalidade |
|---|---|
| Java | Linguagem de programação |
| Gradle | Gerenciamento do build e das dependências |
| Git | Controle de versão |
| GitHub | Hospedagem do código-fonte |

## Estrutura do projeto

```text
agendamento/
├── gradle/
│   └── wrapper/
├── src/
├── .gitattributes
├── .gitignore
├── build.gradle
├── gradlew
├── gradlew.bat
└── settings.gradle
```

### Principais arquivos

- `src/`: contém o código-fonte da aplicação.
- `build.gradle`: define configurações de build e dependências.
- `settings.gradle`: configura o projeto Gradle.
- `gradlew`: permite executar o Gradle em ambientes Unix-like.
- `gradlew.bat`: permite executar o Gradle no Windows.
- `gradle/wrapper/`: contém os arquivos utilizados pelo Gradle Wrapper.
- `.gitignore`: define arquivos que não devem ser versionados.
- `.gitattributes`: configura atributos dos arquivos no Git.

## Pré-requisitos

Antes de executar o projeto, verifique se você possui:

- JDK compatível com a versão configurada no projeto.
- Git instalado.
- Acesso ao terminal ou a uma IDE compatível com Java.

O Gradle Wrapper incluído no repositório permite executar tarefas do Gradle sem precisar instalar manualmente uma distribuição global, desde que o ambiente esteja configurado corretamente.

## Instalação

### 1. Clone o repositório

```bash
git clone https://github.com/Emite028/agendamento.git
```

### 2. Acesse o diretório

```bash
cd agendamento
```

### 3. Verifique a versão do Java

```bash
java -version
```

Certifique-se de que a versão instalada seja compatível com a configuração do projeto.

## Execução

Como o projeto utiliza Gradle, é possível verificar as tarefas disponíveis antes de executar a aplicação.

### Windows

```bash
gradlew.bat tasks
```

### Linux ou macOS

```bash
./gradlew tasks
```

Para compilar o projeto, utilize:

**Windows:**

```bash
gradlew.bat build
```

**Linux ou macOS:**

```bash
./gradlew build
```

A forma de iniciar a aplicação depende da configuração do projeto e da existência de uma classe principal ou de uma tarefa específica de execução.

## Contribuição

Contribuições para melhorias, correções e novas funcionalidades são bem-vindas.

1. Faça um fork do repositório.
2. Crie uma branch para sua alteração.

   ```bash
   git checkout -b feature/nova-funcionalidade
   ```

3. Implemente as alterações.
4. Teste o código e verifique se o build é executado corretamente.
5. Registre suas modificações.

   ```bash
   git add .
   git commit -m "feat: descreve a alteração"
   ```

6. Envie a branch para seu repositório remoto.

   ```bash
   git push origin feature/nova-funcionalidade
   ```

7. Abra um Pull Request para revisão.

## Autor

Desenvolvido por **Emite028**.

- GitHub: [@Emite028](https://github.com/Emite028)
- Repositório: [agendamento](https://github.com/Emite028/agendamento)

## Licença

Verifique se o repositório possui um arquivo de licença antes de reutilizar ou distribuir o código.

Caso ainda não exista uma licença, recomenda-se adicionar um arquivo `LICENSE` com os termos de uso e distribuição definidos pelo responsável pelo projeto.
