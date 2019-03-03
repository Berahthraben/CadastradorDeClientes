/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.NumberAddition;
    import java.io.*;
    import my.NumberAddition.ManageLista;
    import my.NumberAddition.PrincipalUI;
/**
 *
 * @author Soerakraven
 */
public class ArquivoClientes {
    public static File logs = new File("logs.txt");
    
    public static void ArquivoClientes(File logos){
        logs = logos;
    }
    
    public static void CriaArquivo(){
        try{
            logs.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Nao foi possivel criar\n");
        }
    }
    public static void CarregaDados(){
        String entrada1, entrada2, entrada4;
        int linhas = ContaLinhas()/4, entrada3;
        try{
            FileReader fileReader = new FileReader(logs);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for(int i=0;i<linhas;i++){
                entrada1 = bufferedReader.readLine();
                entrada2 = bufferedReader.readLine();
                entrada3 = Integer.parseInt(bufferedReader.readLine());
                entrada4 = bufferedReader.readLine();
                Usuario us = new Usuario(entrada1, entrada2, entrada3, entrada4);
                ManageLista.AddUsuario(us);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Não foi possivel ler o arquivo\n");
        }
    }
    private static int ContaLinhas(){
        String line;
        int cont=0;
        try{
            FileReader fileReader = new FileReader("logs.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line=bufferedReader.readLine()) != null){
                cont++;
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.printf("Não foi possivel ler o arquivo\n");
        }
        return cont;
    }
    public static void EscreveArquivo(){
        String[] linha;
        FileWriter writer;
        try{
            writer = new FileWriter(logs, true);
            PrintWriter printer = new PrintWriter(writer);
            linha = ManageLista.RetornaNomeIndice(ManageLista.RetornaTamanho()-1);
            for(int i=0;i<4;i++){
                printer.append(linha[i]+ "\n");
            }
            printer.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Falha ao carregar arquivo2\n");
        }
        
    }
    
}
