/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.treetabletest;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.primefaces.model.CheckboxTreeNode;

/**
 *
 * @author margarita.dueck
 */
@ManagedBean(name = "documentService")
@ApplicationScoped
public class DocumentService {
     
    public TreeNode createDocuments(){
        TreeNode root = new DefaultTreeNode(new Document("Name"), null);
        
        
        TreeNode name1 = new DefaultTreeNode(new Document("Uwe Müller"), root);
        TreeNode name2 = new DefaultTreeNode(new Document("Geralt von Riva"), root);
        
        TreeNode adress1 = new DefaultTreeNode(new Document("Adresse"), name1);
        TreeNode communication1 = new DefaultTreeNode(new Document("Kommunikation"), name1);
        TreeNode adress2 = new DefaultTreeNode(new Document("Adresse"), name2);
        TreeNode communication2 = new DefaultTreeNode(new Document("Kommunikation"), name2);
        
        //Adresses
        TreeNode street1 = new DefaultTreeNode("contact", new Document("Hamburgerstraße"), adress1);
        TreeNode street2 = new DefaultTreeNode("contact", new Document("Hamburgerstraße"), adress2);
        
        //Communication
        TreeNode commu1 = new DefaultTreeNode("contact", new Document("Mail"), communication1);
        TreeNode commu2 = new DefaultTreeNode("contact", new Document("Skype"), communication2);
        
        return root;
    }
    
    public TreeNode createCheckboxDocuments(){
        TreeNode root = new CheckboxTreeNode(new Document("Names"), null);
        
        TreeNode name1 = new CheckboxTreeNode(new Document("Uwe Müller"), root);
        TreeNode name2 = new CheckboxTreeNode(new Document("Geralt von Riva"), root);
        
        TreeNode adress1 = new CheckboxTreeNode(new Document("Adresse"), name1);
        TreeNode communication1 = new CheckboxTreeNode(new Document("Kommunikation"), name1);
        TreeNode adress2 = new CheckboxTreeNode(new Document("Adresse"), name2);
        TreeNode communication2 = new CheckboxTreeNode(new Document("Kommunikation"), name2);
        
        //Adresses
        TreeNode street1 = new CheckboxTreeNode("contact", new Document("Hamburgerstraße"), adress1);
        TreeNode street2 = new CheckboxTreeNode("contact", new Document("Hamburgerstraße"), adress2);
        
        //Communication
        TreeNode commu1 = new CheckboxTreeNode("contact", new Document("Mail"), communication1);
        TreeNode commu2 = new CheckboxTreeNode("contact", new Document("Skype"), communication2);
        return root;
    }
}
