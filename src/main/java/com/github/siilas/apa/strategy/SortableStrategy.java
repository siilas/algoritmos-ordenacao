package com.github.siilas.apa.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;
import com.github.siilas.apa.exception.ServiceException;
import com.github.siilas.apa.service.BubbleSort;
import com.github.siilas.apa.service.BubbleSortMelhorado;
import com.github.siilas.apa.service.HeapSort;
import com.github.siilas.apa.service.InsertionSort;
import com.github.siilas.apa.service.MergeSort;
import com.github.siilas.apa.service.QuickSortPivoCentral;
import com.github.siilas.apa.service.QuickSortPivoPrimeiro;
import com.github.siilas.apa.service.SelectionSort;
import com.github.siilas.apa.service.ShellSort;
import com.github.siilas.apa.service.Sortable;

@Component
public class SortableStrategy {
    
    @Autowired
    private HeapSort heapSort;
    
    @Autowired
    private ShellSort shellSort;
    
    @Autowired
    private MergeSort mergeSort;
    
    @Autowired
    private BubbleSort bubbleSort;
    
    @Autowired
    private SelectionSort selectionSort;
    
    @Autowired
    private InsertionSort insertionSort;
    
    @Autowired
    private BubbleSortMelhorado bubbleSortMelhorado;
    
    @Autowired
    private QuickSortPivoCentral quickSortPivoCentral;
    
    @Autowired
    private QuickSortPivoPrimeiro quickSortPivoPrimeiro;

    public Sortable getStrategy(Algoritmos algoritmoEscolhido) {
        switch (algoritmoEscolhido) {
            case BUBBLE_SORT:
                return bubbleSort;
            case BUBBLE_SORT_MELHORADO:
                return bubbleSortMelhorado;
            case QUICK_SORT_PIVO_PRIMEIRO:
                return quickSortPivoPrimeiro;
            case QUICK_SORT_PIVO_CENTRAL:
                return quickSortPivoCentral;
            case INSERTION_SORT:
                return insertionSort;
            case SHELL_SORT:
                return shellSort;
            case SELECTION_SORT:
                return selectionSort;
            case HEAP_SORT:
                return heapSort;
            case MERGE_SORT:
                return mergeSort;
        }
        throw new ServiceException("Implementação inválida!");
    }
    
}
