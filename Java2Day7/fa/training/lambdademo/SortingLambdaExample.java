package fa.training.lambdademo;

import fa.training.model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingLambdaExample {
    
    private static List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Peter", 5000, 33));
        users.add(new User("Mary", 2000, 20));
        users.add(new User("John", 1500, 10));
        users.add(new User("Ivan", 2300, 55));
        return users;
    }

    public void showUserInfoSortByName() {
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("After Sort");
        users.sort((User user1, User user2) -> user1.getAge() - user2.getAge());
        System.out.println("Sort by name");
        users.sort((user1, user2) -> user1.getName().compareTo(user2.getName()));
        users.forEach((user) -> System.out.println(user));
    }

    public void showUserInfoSortBySalary() {
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("After Sort");
        Comparator<User> salaryComparetor = (o1,o2)->
                o1.getSalary().compareTo(o2.getSalary());
        System.out.println("Sort by salary");
        users.forEach((user) -> System.out.println(user));
    }
    public void showUserInfoSortBySalaryReverse() {
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("After Sort");
        Comparator<User> salaryComparator = (o1, o2)->
                o1.getSalary().compareTo(o2.getSalary());
        users.sort(salaryComparator.reversed());
        System.out.println("Sort by salary, reverse order");
        users.forEach((user) -> System.out.println(user));
    }
}
