import java.time.*;

public class D02_PeriodDifferenceDemo {
  public static void main(String[] args) {
        LocalDate march2003 = LocalDate.of(
          2003, 3, 1
        );
        LocalDate may2003 = LocalDate.of(
          2003, 5, 1
        );
        
        Period diff = Period.between(march2003, may2003); 

        System.out.println("Difference: " + diff);                  // P2M
    }
}
