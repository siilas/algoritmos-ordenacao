package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class QuickSortPivoPrimeiro implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.QUICK_SORT_PIVO_PRIMEIRO;
    }

}
