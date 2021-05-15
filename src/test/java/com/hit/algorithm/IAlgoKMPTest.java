package com.hit.algorithm;
import com.hit.algorithm.AlgoKMPImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IAlgoKMPTest {

//    @Test
//public void AlgoKMPReishaTest(){
//    AlgoKMPImpl algoKMP= new AlgoKMPImpl();
//    assert([],algoKMP.)
//    }
@Test
public void AlgoKMPTest(){
    AlgoKMPImpl algoKMP = new AlgoKMPImpl();
    assertEquals(true,algoKMP.k_m_p("monkey","a monkey went into the zoo")); // pattern is found so return is true
    assertEquals(false,algoKMP.k_m_p("monkey","a zebra went into the zoo")); // no pattern is found
}

}
