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
     
    public TreeNode createDocuments() {
        TreeNode root = new DefaultTreeNode(new Document("Files", "-", "Folder"), null);
         
        TreeNode name1 = new DefaultTreeNode(new Document("Name1", "-", "Folder"), root);
        TreeNode pictures = new DefaultTreeNode(new Document("Pictures", "-", "Folder"), root);
        TreeNode movies = new DefaultTreeNode(new Document("Movies", "-", "Folder"), root);
         
        TreeNode work = new DefaultTreeNode(new Document("Work", "-", "Folder"), name1);
        TreeNode primefaces = new DefaultTreeNode(new Document("PrimeFaces", "-", "Folder"), name1);
         
        //Documents
        TreeNode expenses = new DefaultTreeNode("document", new Document("what.doc", "30 KB", "Word Document"), work);
        TreeNode resume = new DefaultTreeNode("document", new Document("Resume.doc", "10 KB", "Word Document"), work);
        TreeNode refdoc = new DefaultTreeNode("document", new Document("RefDoc.pages", "40 KB", "Pages Document"), primefaces);
         
        //Pictures
        TreeNode barca = new DefaultTreeNode("picture", new Document("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
        TreeNode primelogo = new DefaultTreeNode("picture", new Document("logo.jpg", "45 KB", "JPEG Image"), pictures);
        TreeNode optimus = new DefaultTreeNode("picture", new Document("optimusprime.png", "96 KB", "PNG Image"), pictures);
         
        //Movies
        TreeNode pacino = new DefaultTreeNode(new Document("Al Pacino", "-", "Folder"), movies);
        TreeNode deniro = new DefaultTreeNode(new Document("Robert De Niro", "-", "Folder"), movies);
         
        TreeNode scarface = new DefaultTreeNode("mp3", new Document("Scarface", "15 GB", "Movie File"), pacino);
        TreeNode carlitosWay = new DefaultTreeNode("mp3", new Document("Carlitos' Way", "24 GB", "Movie File"), pacino);
         
        TreeNode goodfellas = new DefaultTreeNode("mp3", new Document("Goodfellas", "23 GB", "Movie File"), deniro);
        TreeNode untouchables = new DefaultTreeNode("mp3", new Document("Untouchables", "17 GB", "Movie File"), deniro);
         
        return root;
    }
     
    public TreeNode createCheckboxDocuments() {
        TreeNode root = new CheckboxTreeNode(new Document("Files", "-", "Folder"), null);
         
        TreeNode name1 = new CheckboxTreeNode(new Document("Name1", "-", "Folder"), root);
        TreeNode pictures = new CheckboxTreeNode(new Document("Pictures", "-", "Folder"), root);
        TreeNode movies = new CheckboxTreeNode(new Document("Movies", "-", "Folder"), root);
         
        TreeNode work = new CheckboxTreeNode(new Document("Work", "-", "Folder"), name1);
        TreeNode primefaces = new CheckboxTreeNode(new Document("PrimeFaces", "-", "Folder"), name1);
         
        //Documents
        TreeNode expenses = new CheckboxTreeNode("document", new Document("what.doc", "30 KB", "Word Document"), work);
        TreeNode resume = new CheckboxTreeNode("document", new Document("Resume.doc", "10 KB", "Word Document"), work);
        TreeNode refdoc = new CheckboxTreeNode("document", new Document("RefDoc.pages", "40 KB", "Pages Document"), primefaces);
         
        //Pictures
        TreeNode barca = new CheckboxTreeNode("picture", new Document("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
        TreeNode primelogo = new CheckboxTreeNode("picture", new Document("logo.jpg", "45 KB", "JPEG Image"), pictures);
        TreeNode optimus = new CheckboxTreeNode("picture", new Document("optimusprime.png", "96 KB", "PNG Image"), pictures);
         
        //Movies
        TreeNode pacino = new CheckboxTreeNode(new Document("Al Pacino", "-", "Folder"), movies);
        TreeNode deniro = new CheckboxTreeNode(new Document("Robert De Niro", "-", "Folder"), movies);
         
        TreeNode scarface = new CheckboxTreeNode("mp3", new Document("Scarface", "15 GB", "Movie File"), pacino);
        TreeNode carlitosWay = new CheckboxTreeNode("mp3", new Document("Carlitos' Way", "24 GB", "Movie File"), pacino);
         
        TreeNode goodfellas = new CheckboxTreeNode("mp3", new Document("Goodfellas", "23 GB", "Movie File"), deniro);
        TreeNode untouchables = new CheckboxTreeNode("mp3", new Document("Untouchables", "17 GB", "Movie File"), deniro);
         
        return root;
    }
}
