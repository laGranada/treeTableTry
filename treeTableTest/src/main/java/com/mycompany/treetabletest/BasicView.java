/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.treetabletest;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import org.primefaces.model.TreeNode;

/**
 *
 * @author margarita.dueck
 */
@ManagedBean(name="ttBasicView")
@ViewScoped
//wie ContactController
public class BasicView implements Serializable {
     
     private TreeNode root;
    
     //private Contact
    private Document selectedDocument;
    
    @ManagedProperty("#{documentService}")
    private DocumentService service;
    
    @PostConstruct
    public void init() {
        root = service.createDocuments();
    }
    
    public TreeNode getRoot() {
        return root;
    }
 
    public void setService(DocumentService service) {
        this.service = service;
    }
 
    public Document getSelectedDocument() {
        return selectedDocument;
    }
 
    public void setSelectedDocument(Document selectedDocument) {
        this.selectedDocument = selectedDocument;
    }
}
