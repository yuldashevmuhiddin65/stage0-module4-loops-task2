package school.mjc.stage0.loops.task2;

import java.sql.SQLOutput;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int result = 1;
        for (int i = 0; i < printToInclusive; i++) {
            System.out.println(result);
            result *= i;
        }
    }
}
