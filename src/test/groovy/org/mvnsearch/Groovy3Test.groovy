package org.mvnsearch

import org.junit.jupiter.api.Test

/**
 * Groovy 3 test
 *
 * @author linux_china
 */
class Groovy3Test {

  @Test
  void testLoop() {
    def count = 5
    def fact = 1
    do {
      fact *= count--
    } while (count > 1)
    assert fact == 120
  }

  @Test
  void testLambda() {
    (0..5).forEach(e -> println(e))
  }

  @Test
  void testVar() {
    def name ="Jacky"
    
  }
}
