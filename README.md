# Gerenciador de Alunos

Este projeto em Java é uma aplicação que gerencia uma lista de alunos, utilizando a interface `Set` para armazenar os dados. Cada aluno possui atributos como nome, matrícula e nota. A aplicação permite manipular e exibir informações sobre os alunos de forma organizada.

## Funcionalidades

A classe `GerenciadorAlunos` implementa os seguintes métodos:

- **adicionarAluno(String nome, Long matricula, double media)**: Adiciona um aluno ao conjunto.
- **removerAluno(long matricula)**: Remove um aluno do conjunto pela matrícula, se estiver presente.
- **exibirAlunosPorNome()**: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- **exibirAlunosPorNota()**: Exibe todos os alunos do conjunto em ordem crescente de nota.
- **exibirAlunos()**: Exibe todos os alunos do conjunto.

## Tecnologias Utilizadas

- Java SE
- Interface `Set` para garantir a unicidade dos alunos.
- Ferramentas de ordenação para exibir os alunos por nome e por nota.
