# 🌳 Sistema de Gestão de Alunos com Árvore Binária de Busca

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge" alt="Status: Concluído"/>
</p>

Este projeto implementa um sistema de gerenciamento de alunos utilizando uma estrutura de dados de **Árvore Binária de Busca (ABB)** em Java. O sistema permite gerenciar informações de alunos de forma eficiente.

## 📋 Funcionalidades

- ✅ **Inserir** um novo aluno na árvore
- ✅ **Remover** um aluno existente pelo RGM
- 🔍 **Pesquisar** um aluno pelo RGM
- 🗑️ **Esvaziar** completamente a árvore
- 📊 **Exibir** todos os alunos em diferentes percursos (pré-ordem, em-ordem, pós-ordem)
- 📁 **Carregar** dados de alunos a partir de um arquivo de texto

## 🧩 Estrutura do Projeto

O projeto é organizado em pacotes para melhor organização do código:

```
Trabalho/
├── src/
│   ├── BClasses/
│   │   ├── ClassNode.java      # Representa um nó na árvore
│   │   ├── ClassStudent.java   # Representa um aluno
│   │   └── ClassTree.java      # Implementa a árvore binária de busca
│   ├── CLoadTxT/
│   │   └── LoadTree.java       # Utilitário para carregar dados de arquivos
│   └── Menu.java               # Interface de linha de comando
└── data/
    └── students.txt            # Dados de alunos para importação
```

## 📊 Formato dos Dados

O arquivo `data/students.txt` contém os dados dos alunos no formato:
```
RGM,Nome,Disciplina
```

Exemplo:
```
1,Vinicius,Estrutura de Dados
2,Samuel,Algoritmos
3,Luana,Programação Orientada a Objetos
```

## 📝 Algoritmos Implementados

- **Inserção**: Adiciona um novo aluno mantendo a propriedade de ordenação da ABB
- **Busca**: Localiza um aluno pelo RGM 
- **Remoção**: Remove um aluno tratando três casos: nó folha, nó com um filho e nó com dois filhos
- **Travessias**:
  - **Pré-ordem**: Visita a raiz, subárvore esquerda, subárvore direita
  - **In-ordem**: Visita a subárvore esquerda, raiz, subárvore direita (exibe em ordem crescente de RGM)
  - **Pós-ordem**: Visita a subárvore esquerda, subárvore direita, raiz

---

<p align="center">
  <b>Universidade Cruzeiro do Sul (UNIPÊ)</b><br>
  Disciplina de Estrutura de Dados<br>
  2025
</p>