package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int fact = 1;
        if (printToInclusive ==1){
            System.out.println(1);
        } else {
            System.out.println(1);
        }
        for (int i = 1; i <= printToInclusive; i++) {
            fact *= i;
            System.out.println(fact);
        }
    }
}



