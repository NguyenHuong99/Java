package fa.training.lambdademo.test;

import fa.training.lambdademo.FunctionalInterfaceExample;
import fa.training.lambdademo.SortingLambdaExample;

public class TestLambdaDemo {
    public static void main(String[] args) {
        SortingLambdaExample sortingLambda = new SortingLambdaExample();
        FunctionalInterfaceExample funcInterface = new FunctionalInterfaceExample();
        SortingLambdaExample sortLambda;
        sortLambda.showUserInfoSortByName();
        sortLambda.showUserInfoSortBySalary();
        sortLambda.showUserInfoSortBySalaryReverse();
        funcInterface.calculateSquare();
    }
}
