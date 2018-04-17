package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class BubbleSortMelhorado implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        boolean troca = true;
        for (int i = (vetor.length - 1); (i >= 1 && troca); i--) {
            troca = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    troca = true;
                }
            }
        }
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.BUBBLE_SORT_MELHORADO;
    }

}
