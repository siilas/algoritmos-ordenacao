package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class InsertionSort implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int aux = i - 1;
            while (aux >= 0 && chave < vetor[aux]) {
                vetor[aux + 1] = vetor[aux];
                vetor[aux] = chave;
                aux = aux - 1;
            }
        }
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.INSERTION_SORT;
    }

}
