package com.github.siilas.apa.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InsertionSortTest {
    
    private InsertionSort service;
    
    @Before
    public void init() {
        service = new InsertionSort();
    }
    
    @Test
    public void deveOrdenarNumerosAleatorios() {
        Integer[] vetor = { 10, 5, 25, 17, 50, 89, 72 };
        Integer[] vetorOrdenado = service.specificSort(vetor);
        Assert.assertArrayEquals(new Integer[] { 5, 10, 17, 25, 50, 72, 89 }, vetorOrdenado); 
    }
    
    @Test
    public void deveOrdenarNumerosCrescentes() {
        Integer[] vetor = { 5, 10, 17, 25, 50, 72, 89 };
        Integer[] vetorOrdenado = service.specificSort(vetor);
        Assert.assertArrayEquals(new Integer[] { 5, 10, 17, 25, 50, 72, 89 }, vetorOrdenado); 
    }
    
    @Test
    public void deveOrdenarNumerosDecrescentes() {
        Integer[] vetor = { 89, 72, 50, 25, 17, 10, 5 };
        Integer[] vetorOrdenado = service.specificSort(vetor);
        Assert.assertArrayEquals(new Integer[] { 5, 10, 17, 25, 50, 72, 89 }, vetorOrdenado); 
    }

}
