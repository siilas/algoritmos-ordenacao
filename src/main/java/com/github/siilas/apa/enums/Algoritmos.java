package com.github.siilas.apa.enums;

public enum Algoritmos {

    BUBBLE_SORT("Bubble Sort"), 
    BUBBLE_SORT_MELHORADO("Bubble Sort Melhorado"), 
    QUICK_SORT_PIVO_PRIMEIRO("Quick Sort (Primeiro elemento como pivô)"), 
    QUICK_SORT_PIVO_CENTRAL("Quick Sort (Elemento central como pivô)"), 
    INSERTION_SORT("Insertion Sort"), 
    SHELL_SORT("Shell Sort"), 
    SELECTION_SORT("Selection Sort"), 
    HEAP_SORT("Heap Sort"), 
    MERGE_SORT("Merge Sort");

    private final String descricao;

    private Algoritmos(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
