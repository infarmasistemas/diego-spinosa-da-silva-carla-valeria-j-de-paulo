/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProduto;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author elian
 */
public class ControllerProduto {
    
    DAOProduto daoproduto = new DAOProduto();
    
    public int salvarProduto(ModelProduto modelProduto){
        return this.daoproduto.salvarProdutosDAO(modelProduto);
    }
    
   
    
    
}
