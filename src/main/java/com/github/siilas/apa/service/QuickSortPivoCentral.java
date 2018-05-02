package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class QuickSortPivoCentral implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        ordena(vetor, 0, (vetor.length - 1));
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.QUICK_SORT_PIVO_CENTRAL;
    }

    private void ordena(Integer vetor[], int inicio, int fim) {
        int index = particiona(vetor, inicio, fim);
        if (inicio < (index - 1)) {
            ordena(vetor, inicio, index - 1);
        }
        if (index < fim) {
            ordena(vetor, index, fim);
        }
    }

    private int particiona(Integer[] vetor, int inicio, int fim) {
        int i = inicio, j = fim;
        int pivot = vetor[(fim + inicio) / 2];
        while (i <= j) {
            while (vetor[i] < pivot) {
                i++;
            }
            while (vetor[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int tmp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = tmp;
                i++;
                j--;

          }
        }
        return i;
    }

}
