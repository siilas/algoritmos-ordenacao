package com.github.siilas.apa.model;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GeradorCrescenteTest implements GeradorDeInformacoesTest {
    
    private GeradorCrescente gerador;
    
    @Before
    public void init() {
        gerador = new GeradorCrescente();
    }
    
    @Test
    @Override
    public void deveValidarVetorGerado() {
        Vetores vetores = gerador.gerarVetores();
        for (Vetor vetor : vetores.getVetores()) {
            Integer[] expected = vetor.getVetorOriginal().clone();
            Arrays.sort(expected);
            Assert.assertArrayEquals(expected, vetor.getVetorOriginal());
        }
    }

}
