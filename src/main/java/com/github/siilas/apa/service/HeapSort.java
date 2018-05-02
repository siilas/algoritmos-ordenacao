package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class HeapSort implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        int tamanho = vetor.length;
        for (int i = (tamanho / 2) - 1; i >= 0; i--) {
            constroiHeap(vetor, tamanho, i);
        }
        for (int i = (tamanho - 1); i >= 0; i--) {
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
            constroiHeap(vetor, i, 0);
        }
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.HEAP_SORT;
    }

    private void constroiHeap(Integer[] vetor, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && vetor[l] > vetor[largest]) {
            largest = l;
        }
        if (r < n && vetor[r] > vetor[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = vetor[i];
            vetor[i] = vetor[largest];
            vetor[largest] = swap;
            constroiHeap(vetor, n, largest);
        }
    }

}
