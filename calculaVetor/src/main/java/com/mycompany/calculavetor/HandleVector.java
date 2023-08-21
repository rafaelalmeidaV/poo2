/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculavetor;

import java.util.ArrayList;

/**
 *
 * @author rafap
 */
public class HandleVector {

    public ArrayList<Integer> vector = new ArrayList<Integer>();

    public HandleVector(ArrayList<Integer> vector) {
        this.vector = vector;
    }

    public int retornaMaior(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty");
        }

        int maior = list.get(0);
        int multiplicação = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maior) {
                maior = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            multiplicação = maior * list.get(i);
        }

        return multiplicação;
    }

}
