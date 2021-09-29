package net.sdruskat.ci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  /**
   * Passing test
   */
  @Test
  public void testAddPass() {
    App app = new App();
    assertEquals(2, app.add(1, 1));
  }

}
