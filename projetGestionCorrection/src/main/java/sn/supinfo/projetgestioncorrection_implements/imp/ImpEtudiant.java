/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.projetgestioncorrection_implements.imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.projetgestioncorrection.Etudiant;
import sn.supinfo.projetgestioncorrection_interfaces.dao.IEtudiant;

/**
 *
 * @author layedamehane
 */
public class ImpEtudiant implements IEtudiant {
    List<Etudiant> etudiants=new ArrayList<>();

    @Override
    public void addEtudiant(Etudiant etudiant) {
       etudiants.add(etudiant);
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) {
        for(Etudiant etudiant2: etudiants){
            if(etudiant2.getIdEtudiant()==etudiant.getIdEtudiant()){
                etudiant2.setPrenom(etudiant.getPrenom());
                etudiant2.setNom(etudiant.getNom());
                etudiant2.setNumeroEtudiant(etudiant.getNumeroEtudiant());
                etudiant2.setDepartement(etudiant.getDepartement());
                etudiant2.setDateNaissance(etudiant.getDateNaissance());
                
                
            }
        }
        
    }

    @Override
    public Etudiant getEtudiantById(int i) {
        for(Etudiant etudiant:etudiants){
            if(etudiant.getIdEtudiant()==i){
                return etudiant;
                
            }
        }
        return null;
        
    }

    @Override
    public void removeEtudiant(Etudiant etudiant) {
     etudiants.remove(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiants;
       
    }
    
}
