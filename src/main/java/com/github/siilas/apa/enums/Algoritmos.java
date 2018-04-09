package com.github.siilas.apa.enums;

public enum Algoritmos {

    BUBBLE_SORT(1, "Bubble Sort"), 
    BUBBLE_SORT_MELHORADO(2, "Bubble Sort Melhorado"), 
    QUICK_SORT_PIVO_PRIMEIRO(3, "Quick Sort (Primeiro elemento como pivô)"), 
    QUICK_SORT_PIVO_CENTRAL(4, "Quick Sort (Elemento central como pivô)"), 
    INSERTION_SORT(5, "Insertion Sort"), 
    SHELL_SORT(6, "Shell Sort"), 
    SELECTION_SORT(7, "Selection Sort"), 
    HEAP_SORT(8, "Heap Sort"), 
    MERGE_SORT(9, "Merge Sort");

    private final Integer codigo;
    private final String descricao;

    private Algoritmos(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Algoritmos getFromCodigo(Integer codigo) {
        for (Algoritmos algoritmo : values()) {
            if (algoritmo.getCodigo().equals(codigo)) {
                return algoritmo;
            }
        }
        return null;
    }

}
