/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.ModelProduto;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author diego
*/
public class DAOProduto extends ConexaoMySql {

    /**
    * grava Produtos
    * @param pModelProdutos
    * return int
    */
    public int salvarProdutosDAO(ModelProduto pModelProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_produto ("
                    + "pro_nome,"
                    + "pro_descricao,"
                    + "pro_quantidade"
                + ") VALUES ("
                    + "'" + pModelProdutos.getPro_nome() + "',"
                    + "'" + pModelProdutos.getPro_descricao() + "',"
                    + "'" + pModelProdutos.getPro_quantidade() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    
    
    
    
       
}

