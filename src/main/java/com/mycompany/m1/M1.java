/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.m2.M2Helper;

/**
 *
 * @author Marcin
 */
public class M1 {

    public static void main(String... args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println( M2Helper.help(gson.toJson(new C1("kot", 33))));

    }

}
