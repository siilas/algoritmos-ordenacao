package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class ShellSort implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        int h = 1;
        int n = vetor.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = h / 3;
        int c, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = vetor[i];
                j = i;
                while (j >= h && vetor[j - h] > c) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = c;
            }
            h = h / 2;
        }
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.SHELL_SORT;
    }

}
