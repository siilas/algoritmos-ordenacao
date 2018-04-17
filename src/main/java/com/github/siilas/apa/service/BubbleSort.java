package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class BubbleSort implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    
                }
            }
        }
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.BUBBLE_SORT;
    }

}
