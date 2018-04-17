package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class SelectionSort implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int min = i;
            for (int j = (i + 1); j < vetor.length; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            if (vetor[i] != vetor[min]) {
                int aux = vetor[i];
                vetor[i] = vetor[min];
                vetor[min] = aux;
            }
        }
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.SELECTION_SORT;
    }

}
