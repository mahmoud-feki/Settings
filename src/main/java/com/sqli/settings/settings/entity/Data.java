/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sqli.settings.settings.entity;
/**
 *
 * @author mafeki
 */
public class Data {

    private String id;
    private Integer quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Data() {
    }

    public Data(String id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }
}
