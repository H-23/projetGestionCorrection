/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.projetgestioncorrection_implements.imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.projetgestioncorrection.Groupe;
import sn.supinfo.projetgestioncorrection_interfaces.dao.IGroupe;

/**
 *
 * @author layedamehane
 */
public class ImpGroup implements IGroupe {
     ArrayList<Groupe> groupes=new ArrayList<>();
    
    @Override
    public void addGroupe(Groupe groupe){
        groupes.add(groupe);
        
    }

    @Override 
    public void updateGroupe(Groupe groupe) {
        
         for(Groupe groupe2:groupes){
            if(groupe2.getId_groupe()==groupe.getId_groupe()){
                
                groupe2.setNom_groupe(groupe.getNom_Groupe());
                groupe2.setDate_creation(groupe.getDate_creation());
                groupe2.setModule_groupe(groupe.getModule_groupe());
            }
       
        }
    }

    @Override
    public Groupe getGroupeById(int i) {
        for(Groupe groupe:groupes){
            if(groupe.getId_groupe()==i){
            return groupe;
            }
        }  
        return null;
    }

    @Override
    public void removeGroupe(Groupe groupe) {
        groupes.remove(groupe);
       
    }

    @Override
    public List<Groupe> getAllGroupe() {
        return groupes;
       
    }
    
}
