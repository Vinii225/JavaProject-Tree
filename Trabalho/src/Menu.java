import BClasses.*;
import CLoadTxT.LoadTree;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean continueRunning = true;
        int option;

        Scanner keyboard = new Scanner(System.in);
        ClassTree Tree = new ClassTree();
    
        while (continueRunning) {
            System.out.println("\n  ---   Menu :)   ---  ");
            System.out.println("1. Inserir aluno");
            System.out.println("2. Remover aluno");
            System.out.println("3. Pesquisar aluno");
            System.out.println("4. Esvaziar árvore");
            System.out.println("5. Exibir árvore");
            System.out.println("6. Carregar alunos do arquivo");
            System.out.println("0. Sair");

            System.out.println("Digite opção: ");
            option = keyboard.nextInt();
            keyboard.nextLine();

            if (option == 1) {
                System.out.println("\n -- Inserir Aluno -- ");

                System.out.print("Digite o RGM do aluno: ");
                int rgm = keyboard.nextInt();
                keyboard.nextLine();

                System.out.print("Digite o nome do aluno: ");
                String name = keyboard.nextLine();
                
                System.out.print("Digite a disciplina do aluno: ");
                String disciplina = keyboard.nextLine();

                Tree.insert(new ClassStudent(rgm, name, disciplina));
                System.out.println("Aluno Inserido.");

            } else if (option == 2) {
                System.out.println("\n -- Remover aluno -- ");

                // INFO: get RGM
                System.out.print("Digite o RGM do aluno a remover: ");
                int rgm = keyboard.nextInt();
                keyboard.nextLine();
                
                // Chama do método para remover e confirmar se foi feito ou n
                boolean removed = Tree.remove(rgm);
                if (removed) {
                    System.out.println("Aluno removido.");
                } else {
                    System.out.println("Aluno não encontrado.");
                }

            } else if (option == 3) {
                System.out.println("\n -- Pesquisar aluno -- ");
                System.out.print("Digite o RGM do aluno a pesquisar: ");
                int rgm = keyboard.nextInt();
                keyboard.nextLine();
                
                ClassStudent student = Tree.search(rgm);
                if (student != null) {
                    System.out.println("Aluno encontrado: " + student);
                } else {
                    System.out.println("Aluno não encontrado.");
                }

            } else if (option == 4) {
                System.out.println("\n -- Esvaziando árvore -- ");
                Tree.clear();
                System.out.println("Árvore esvaziada com sucesso.");

            } else if (option == 5) {
                System.out.println("\n -- Exibir árvore -- ");
                System.out.println("Escolha o tipo de percurso:");
                System.out.println("1. Pré-ordem (raiz, esquerda, direita)");
                System.out.println("2. Em-ordem (esquerda, raiz, direita)");
                System.out.println("3. Pós-ordem (esquerda, direita, raiz)");
                
                int traversalChoice = keyboard.nextInt();
                keyboard.nextLine();
                
                switch (traversalChoice) {
                    case 1:
                        Tree.showTreePreOrder();
                        break;
                    case 2:
                        Tree.showTreeInOrder();
                        break;
                    case 3:
                        Tree.showTreePostOrder();
                        break;
                    default:
                        Tree.showTreeInOrder();
                }
                
            } else if (option == 6) {
                System.out.println("\n -- Carregar alunos do arquivo -- ");
                String filePath = "data/students.txt";
                LoadTree.carregarArquivo(Tree, filePath);
                System.out.println("Arquivo de alunos carregado.");
                
            } else if (option == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Comando Inválido");
            }
        }
        keyboard.close();
    }
}