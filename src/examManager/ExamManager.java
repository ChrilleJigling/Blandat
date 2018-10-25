package examManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExamManager {

    public boolean isItLowerThan50(Double d) {
        return (d < 50);
    }
    
    
    
    
    private List<Double> myScores;

    public ExamManager() {
        myScores = new ArrayList<Double>();
        myScores.add(78.3);
        myScores.add(69.2);
        myScores.add(44.7);
        myScores.add(61.6);
        myScores.add(80.2);
        myScores.add(66.9);
        myScores.add(54.1);
       // myScores.sort(t1,t2 -> t1-t2);
      //  Collections.sort(myScores, t1,t2->t1-t2);
    
      
      
    }

    public Double customCalculation(ToDoubleFunction<List<Double>> calculator) {
        return calculator.applyAsDouble(myScores);
    }

    public void printScores() {
        myScores.forEach(s -> System.out.println(s));
    }

    public void printSelectedScores(Predicate<Double> testCriteria) {
       //  myScores.stream().filter(s -> s>=50);
       myScores.stream().filter(testCriteria).forEach(s -> System.out.println(s));
    }
    public double getTotalOfAllScores() {
          return myScores.stream().reduce(0d, (a,b) -> a+b);
    }
    public List<Double> doubleAllScores() {
        return myScores.stream().map(e -> e*2).collect(Collectors.toList());
    }
}
