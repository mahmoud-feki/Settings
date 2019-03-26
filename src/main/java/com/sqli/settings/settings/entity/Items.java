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
public class Items {

    private String id;
    private String designation;
    private Integer realQuantity;
    private Integer inventoryQuantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getRealQuantity() {
        return realQuantity;
    }

    public void setRealQuantity(Integer realQuantity) {
        this.realQuantity = realQuantity;
    }

    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    @Override
    public String toString() {
        return "Items{" + "id=" + id + ", designation=" + designation + ", realQuantity=" + realQuantity + ", inventoryQuantity=" + inventoryQuantity + '}';
    }

    public Items() {
        this.inventoryQuantity = 0;

    }

    public Items(String id, String designation, Integer realQuantity) {
        this.id = id;
        this.designation = designation;
        this.realQuantity = realQuantity;
        this.inventoryQuantity = 0;
    }
    
    

}
