/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author elian
 */
public class ModelProduto {
    private int id_produto;
    private String pro_nome;
    private String pro_descricao;
    private int pro_quantidade;

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the pro_nome
     */
    public String getPro_nome() {
        return pro_nome;
    }

    /**
     * @param pro_nome the pro_nome to set
     */
    public void setPro_nome(String pro_nome) {
        this.pro_nome = pro_nome;
    }

    /**
     * @return the pro_descricao
     */
    public String getPro_descricao() {
        return pro_descricao;
    }

    /**
     * @param pro_descricao the pro_descricao to set
     */
    public void setPro_descricao(String pro_descricao) {
        this.pro_descricao = pro_descricao;
    }

    /**
     * @return the pro_quantidade
     */
    public int getPro_quantidade() {
        return pro_quantidade;
    }

    /**
     * @param pro_quantidade the pro_quantidade to set
     */
    public void setPro_quantidade(int pro_quantidade) {
        this.pro_quantidade = pro_quantidade;
    }
    
    

}
