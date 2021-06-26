package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatTripleItUp.tripleUp;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTripleItUpTest {

  private int[][] tripleParams = {
      {1, 4, 5, 6, 2},
      {1, 2, 3},
      {1, 2, 4},
      {1, 2, 4, 5, 7, 6, 5, 6, 7, 6},
      {1, 2, 4, 5, 7, 6, 5, 7, 7, 6},
      {1, 2},
      {1},
      {},
      {10, 9, 8, -100, -99, -98, 100},
      {10, 9, 8, -100, -99, 99, 100},
      {-100, -99, -99, 100, 101, 102},
      {2, 3, 5, 6, 8, 9, 2, 3}
  };

  private boolean[] tripleExpected = {true, true, false, true, false, false, false, false, true,
      false, true, false};


  @Test
  void tripleTest() {
    for (int i = 0; i < tripleParams.length; i++) {
      boolean actual = tripleUp(tripleParams[i]);
      Assertions.assertEquals(actual, tripleExpected[i]);
    }
  }

}