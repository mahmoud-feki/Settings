/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sqli.settings.settings.controller;

import com.sqli.settings.settings.entity.Data;
import com.sqli.settings.settings.entity.Items;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Value("${env.url}")
    public String url;
    @Value("${env.port}")
    public String port;

    private final RestTemplate restTemplate;

    @Autowired
    public ItemController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/allItems")
    public List<Items> getAllItems() {
        List<Items> items = new ArrayList<>();
        Items i1 = new Items("001", "souris", 3);
        Items i2 = new Items("002", "clavier", 4);
        items.add(i2);
        items.add(i1);

        return items;

    }

    @GetMapping("/oneItem/{id}")
    public Items getOneItemWithInventoryQuantity(@PathVariable String id) {

        Items i1 = new Items("001", "souris", 3);
        Items i2 = new Items("002", "clavier", 4);

        ResponseEntity<Data> dataResponse
                = restTemplate.getForEntity("http://" + url + ":" + port+"/api/one/"+id, Data.class);
        if (dataResponse.getStatusCode() == HttpStatus.OK) {
            Optional.ofNullable(dataResponse.getBody());
            i1.setInventoryQuantity(Optional.ofNullable(dataResponse.getBody()).get().getQuantity());
            return i1 ;

        }

        return i1;

    }

}
