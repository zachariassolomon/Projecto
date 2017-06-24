/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormsamples;
import TrabAASI.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;


/**
 *
 * @author nelson
 */
public class Testing {
    public static void main(String[] args) {
        try {
            Projeto po = new Projeto();
            po.setNome("Nelson");
            po.setData_criacao(new Date().getTime());
            ProjetoDAO.save(po);
            
            Projeto p = ProjetoDAO.getProjetoByORMID(2);
            System.out.println(new Date(p.getData_criacao()).toString());
            p.getNome();
        } catch (PersistentException ex) {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
