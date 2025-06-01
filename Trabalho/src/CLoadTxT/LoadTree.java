package CLoadTxT;

import java.io.File;
import java.util.Scanner;
import BClasses.ClassTree;
import BClasses.ClassStudent;

public class LoadTree {
    
    /**
     * Método simplificado para carregar dados do arquivo para a árvore
     */
    public static void carregarArquivo(ClassTree tree, String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split(",");
                    if (parts.length >= 2) {
                        int rgm = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        
                        // Verificar se há disciplina no arquivo
                        String disciplina = parts.length >= 3 ? parts[2].trim() : "Não informada";
                        
                        tree.insert(new ClassStudent(rgm, name, disciplina));
                    }
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo.");
        }
    }
    
    // Método antigo mantido para compatibilidade
    public static boolean loadDataFromFile(ClassTree tree, String filename) {
        carregarArquivo(tree, filename);
        return true;
    }
    
    // Método antigo mantido para compatibilidade
    public static boolean loadDataFromFile(ClassTree tree, String filename, boolean showStatus) {
        carregarArquivo(tree, filename);
        return true;
    }
}