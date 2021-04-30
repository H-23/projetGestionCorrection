/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.projetgestioncorrection_implements.imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.projetgestioncorrection.Professeur;
import sn.supinfo.projetgestioncorrection_interfaces.dao.IProf;

/**
 *
 * @author layedamehane
 */
public class ImpProf implements IProf{
    List<Professeur> professeurs=new ArrayList<>();

    @Override
    public void addProfesseur(Professeur professeur) {
        professeurs.add(professeur);
    }

    @Override
    public void updateProfesseur(Professeur professeur) {
        for(Professeur professeur2: professeurs){
            if(professeur2.getIdProf()==professeur.getIdProf()){
                professeur2.setPrenom(professeur.getPrenom());
                professeur2.setNom(professeur.getNom());
                professeur2.setAdresse(professeur.getAdresse());
                professeur2.setTelephone(professeur.getTelephone());
                professeur2.setSpecialite(professeur.getSpecialite());
        
               }
        }
    }
    @Override
    public Professeur getProfesseurById(int i){
            for(Professeur professeur: professeurs){
            if(professeur.getIdProf()==i){
                return professeur;
                
            }
        
        }
        return null;
        
    }

    @Override
    public void removeProfesseur(Professeur professeur) {
        professeurs.remove(professeur);
         
    }

    @Override
    public List<Professeur> getAllProfesseur() {
        return professeurs;
         
    }
    
    
}
