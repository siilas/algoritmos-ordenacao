package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class BubbleSortMelhorado implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        return null;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.BUBBLE_SORT_MELHORADO;
    }

}
