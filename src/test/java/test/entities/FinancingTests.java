package test.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jocile.banc.entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

  @Test
  public void constructorShouldCreateObjectWhenValidData() {
    Financing f = new Financing(100000.0, 2000.0, 80);
    assertEquals(100000.0, f.getTotalAmount());
    assertEquals(2000.0, f.getIncome());
    assertEquals(80, f.getMonths());
  }

  @Test
  public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        Financing f = new Financing(100000.0, 2000.0, 20);
      }
    );
  }

  @Test
  public void setTotalAmountShouldSetDataWhenValidData() {
    // arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // action
    f.setTotalAmount(90000.0);

    // assert
    assertEquals(90000.0, f.getTotalAmount());
  }

  @Test
  public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        Financing f = new Financing(100000.0, 2000.0, 80);
        f.setTotalAmount(110000.0);
      }
    );
  }

  @Test
  public void setIncomeShouldSetDataWhenValidData() {
    // arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // action
    f.setIncome(2100.0);

    // assert
    assertEquals(2100.0, f.getIncome());
  }

  @Test
  public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        Financing f = new Financing(100000.0, 2000.0, 80);
        f.setIncome(1900.0);
      }
    );
  }

  @Test
  public void setMonthsShouldSetDataWhenValidData() {
    // arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // action
    f.setMonths(81);

    // assert
    assertEquals(81, f.getMonths());
  }

  @Test
  public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        Financing f = new Financing(100000.0, 2000.0, 80);
        f.setMonths(79);
      }
    );
  }

  @Test
  public void entryShouldCalculateEntryCorrectly() {
    // arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // assert
    assertEquals(20000.0, f.entry());
  }

  @Test
  public void quotaShouldCalculateQuotaCorrectly() {
    // arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // assert
    assertEquals(1000.0, f.quota());
  }
}
