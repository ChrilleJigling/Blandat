 package examManager;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class Main {

    public static void main(String[] args) {

        ToDoubleFunction<List<Double>>average = myScores -> {
            Double sum = 0d;

            for (Double nextScore : myScores) {
                sum += nextScore;
            }
            return sum / myScores.size();

        };

        ToDoubleFunction<List<Double>>  highestScore = myScores -> {
            Double highest = 0d;
            for (Double nextScore : myScores) {
                highest = Math.max(highest, nextScore);
            }
            return highest;
        };

        ExamManager examManager = new ExamManager();
        System.out.println("The average score is " + examManager.customCalculation(average));
        System.out.println("The highest score is " + examManager.customCalculation(highestScore));
        System.out.println("The first score is "+examManager.customCalculation(myScores->myScores.get(0)));
        examManager.printScores();
        System.out.println("---");
        examManager.printSelectedScores(examManager::isItLowerThan50);
        System.out.println("The total score of all is: "+ examManager.getTotalOfAllScores());
        List<Double> doubledScores = examManager.doubleAllScores();
        doubledScores.forEach(System.out::println);
    }

}
