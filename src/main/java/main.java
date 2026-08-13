import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    }

        public static void newPetRegistration() {
            File form = new File("formulario.txt");

            try (FileReader fr = new FileReader(form)) {
                BufferedReader bf = new BufferedReader(fr);

                String linha;
                while ((linha = bf.readLine()) != null) {
                    System.out.println(linha);
                }

            } catch (FileNotFoundException e) {
                System.out.println("O caminho / arquivo não foi encotrado! "+ e.getMessage());
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo! "+ e.getMessage());
            }

        }
    }

