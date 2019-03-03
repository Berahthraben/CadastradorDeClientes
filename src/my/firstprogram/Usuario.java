package my.NumberAddition;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soerakraven
 */
public class Usuario {
    private String nome, sobrenome, sexo;
    private int idade;
    
    public Usuario(){
    }
    public Usuario(String nome, String sobrenome, int idade, String sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }
    public String GetNome(){
        return this.nome;
    }
    public void SetSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String GetSobrenome(){
        return this.sobrenome;
    }
    public void SetSexo(String sexo){
        this.sexo = sexo;
    }
    public String GetSexo(){
        return this.sexo;
    }
    public void SetIdade(int idade){
        this.idade = idade;
    }
    public int GetIdade(){
        return this.idade;
    }
    
}
