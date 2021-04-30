/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.projetgestioncorrection_interfaces.dao;

import java.util.List;
import sn.supinfo.projetgestioncorrection.Professeur;

/**
 *
 * @author layedamehane
 */
public interface IProf {
    public void addProfesseur(Professeur professeur);
     public void updateProfesseur(Professeur professeur);
     public Professeur getProfesseurById(int i);
     public void removeProfesseur(Professeur professeur);
     public List<Professeur> getAllProfesseur();
}
