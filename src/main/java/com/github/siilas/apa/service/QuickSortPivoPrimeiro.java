package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class QuickSortPivoPrimeiro implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        ordena(vetor, 0, (vetor.length - 1));
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.QUICK_SORT_PIVO_PRIMEIRO;
    }
    
    private void ordena(Integer vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int pi = particiona(vetor, inicio, fim);
            ordena(vetor, inicio, pi - 1);
            ordena(vetor, pi + 1, fim);
        }
    }

    private int particiona(Integer[] vetor, int inicio, int fim) {
        int pivot = vetor[inicio];
        int i = (inicio + 1);
        for (int j = (inicio + 1); j <= fim; j++) {
            if (vetor[j] < pivot) {
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
                i++;
            }
        }
        vetor[inicio] = vetor[i - 1];
        vetor[i - 1] = pivot;
        return i - 1;
    }

}
