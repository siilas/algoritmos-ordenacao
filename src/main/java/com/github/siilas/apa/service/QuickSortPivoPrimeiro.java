package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class QuickSortPivoPrimeiro implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        //Evitando estouro da pilha
        if (vetor.length <= 10000) {
            ordena(vetor, 0, (vetor.length - 1));
        }
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
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

}
