/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.NumberAddition;

import java.util.*;
import java.lang.*;
import my.NumberAddition.Usuario;
import my.NumberAddition.PrincipalUI;
import my.NumberAddition.ComboBoxUI;
/**
 *
 * @author Soerakraven
 */
public class ManageLista {
    private static ArrayList<Usuario> uzers;
    public static void IniciaLista(ArrayList<Usuario> Usuarios){
       uzers = Usuarios;
    }
    public static void AddUsuario(Usuario user){
        uzers.add(user);
    }
    public static String[] RetornaIds(){
        String[] Ids = new String[uzers.size()];
        for(int i=0;i<uzers.size();i++){
            Ids[i]=Integer.toString(i);
        }
        return Ids;
    }
    public static String[] RetornaNomeIndice(int ind){
        String[] Info = new String[4];
        Usuario u = uzers.get(ind);
        Info[0] = u.GetNome();
        Info[1] = u.GetSobrenome();
        Info[2] = Integer.toString(u.GetIdade());
        Info[3] = u.GetSexo();
        return Info;
    }
    public static int RetornaTamanho(){
        return uzers.size();
    }
}
