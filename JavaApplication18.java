package javaapplication18;

import java.util.*;

class Input {

    int first_num;
    double first_num2;
    String opration;
    String opration2;
    String opration3;
    int sum;
    int answer;
    int mines;
    int next_num;
    int multiplication;
    int divison;
    int pow;
    int fact;
    int sqrt;
    int abs;
    int max;
    int min;
    ArrayList list;

    public void get_input() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first num : ");
        first_num = input.nextInt();

    }

    public void get_input2() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your  num : ");
        first_num2 = input.nextDouble();
    }

    public void get_list() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your list count : ");
        int list_count = input.nextInt();
        list = new ArrayList(list_count);
        for (int i = 0; i < list_count; i++) {
            System.out.println("enter your number :");
            int m = input.nextInt();
            list.add(m);

        }

    }

    public void max_or_min() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your choise between(max, min) :");
        opration3 = input.nextLine();
        switch (opration3) {
            case ("max"):
                max();
                break;
            case ("min"):
                min();
                break;
        }
    }

    public void choose_block() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 for +, -, /, *, ^, !, //, || ");
        System.out.println("enter 2 for [], [-1] ");
        System.out.println("enter 3 for find max or min in list ");
        System.out.println("enter your block :");
        int block = input.nextInt();
        switch (block) {
            case 1:
                get_input();
                opration();
                break;
            case 2:
                get_input2();
                Opration2();
                break;
            case 3:
                get_list();
                max_or_min();
                break;

        }
    }

    public void Opration2() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your opration between([], [-1]) :");
        opration2 = input.nextLine();
        switch (opration2) {
            case ("[]"):
                Ceil();
                break;
            case ("[-1]"):
                Floor();
                break;
        }
    }

    public void opration() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your opration between "
                + "(+, -, /, *, ^, !, //, || ):");
        opration = input.nextLine();

        switch (opration) {
            case ("+"):
                sum();
                break;
            case ("-"):
                mines();
                break;
            case ("*"):
                multiplication();
                break;
            case ("/"):
                divison();
                break;
            case ("^"):
                Pow();
                break;
            case ("!"):
                factoriel();
                break;
            case ("//"):
                Sqrt();
                break;
            case ("||"):
                abs();
                break;
            case ("="):
                System.out.println("your final answer : " + answer);

        }
    }

    public void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your next num : ");
        next_num = input.nextInt();
        boolean isRun = true;

        if (mines == 0 && sum == 0 && multiplication == 0 && divison == 0
                && pow == 0 && fact == 0 && abs == 0 && sqrt == 0) {
            sum = first_num + next_num;
            answer = sum;
        }
        if (pow == answer) {
            sum = pow + next_num;
            answer = sum;
        }
        if (fact == answer) {
            sum = fact + next_num;
            answer = sum;
        }
        if (abs == answer) {
            sum = abs + next_num;
            answer = sum;
        }
        if (sqrt == answer) {
            sum = sqrt + next_num;
            answer = sum;
        }

        if (mines == answer) {
            sum = mines + next_num;
            answer = sum;

        }
        if (multiplication == answer) {
            sum = multiplication + next_num;
            answer = sum;

        }
        if (divison == answer) {
            sum = divison + next_num;
            answer = sum;
        }
        System.out.println("........................");
        System.out.println(" answer : " + answer);
        System.out.println("........................");

        while (isRun) {
            System.out.println("enter your opration :");
            input.nextLine();
            opration = input.nextLine();

            switch (opration) {
                case ("+"):

                    System.out.println("enter your next num : ");
                    next_num = input.nextInt();
                    sum = sum + next_num;
                    answer = sum;
                    System.out.println("........................");
                    System.out.println(" answer : " + answer);
                    System.out.println("........................");

                    break;

                case ("-"):
                    mines();
                    break;
                case ("*"):
                    multiplication();
                    break;
                case ("/"):
                    divison();
                    break;
                case ("^"):
                    Pow();
                    break;
                case ("!"):
                    factoriel();
                    break;
                case ("//"):
                    Sqrt();
                    break;
                case ("||"):
                    abs();
                    break;

                case ("="):
                    answer = sum;
                    System.out.println("........................");

                    System.out.println(" answer : " + answer);
                    System.out.println("........................");

                    isRun = false;
            }

        }

    }

    public void mines() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your next num : ");
        next_num = input.nextInt();
        if (mines == 0 && sum == 0 && multiplication == 0 && divison == 0
                && pow == 0 && fact == 0 && abs == 0 && sqrt == 0) {
            mines = first_num - next_num;
            answer = mines;
        }
        if (pow == answer) {
            mines = pow - next_num;
            answer = mines;
        }
        if (fact == answer) {
            mines = fact - next_num;
            answer = mines;
        }
        if (abs == answer) {
            mines = abs - next_num;
            answer = mines;
        }
        if (sum == answer) {
            mines = sum - next_num;
            answer = mines;
        }
        if (sqrt == answer) {
            mines = sqrt - next_num;
            answer = sum;
        }
        if (multiplication == answer) {
            mines = multiplication - next_num;
            answer = mines;

        }
        if (divison == answer) {
            mines = divison - next_num;
            answer = mines;
        }
        System.out.println("........................");

        System.out.println(" answer : " + answer);
        System.out.println("........................");

        boolean isRun = true;
        while (isRun) {
            System.out.println("enter your opration :");
            input.nextLine();
            opration = input.nextLine();
            switch (opration) {
                case ("+"):
                    sum();
                    break;
                case ("-"):
                    System.out.println("enter your next num : ");
                    next_num = input.nextInt();
                    mines = mines - next_num;
                    answer = mines;
                    System.out.println("........................");

                    System.out.println(" answer : " + answer);
                    System.out.println("........................");

                    break;
                case ("*"):
                    multiplication();
                    break;
                case ("/"):
                    divison();
                    break;
                case ("^"):
                    Pow();
                    break;
                case ("!"):
                    factoriel();
                    break;
                case ("||"):
                    abs();
                    break;
                case ("//"):
                    Sqrt();
                    break;
                case ("="):
                    System.out.println("........................");

                    System.out.println("your final answer : " + answer);
                    System.out.println("........................");

                    isRun = false;

            }
        }
    }

    public void multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your next num : ");
        next_num = input.nextInt();
        if (mines == 0 && sum == 0 && multiplication == 0 && divison == 0
                && pow == 0 && fact == 0 && abs == 0 && sqrt == 0) {
            multiplication = first_num * next_num;
            answer = multiplication;
        }
        if (pow == answer) {
            multiplication = pow * next_num;
            answer = multiplication;
        }
        if (fact == answer) {
            multiplication = fact * next_num;
            answer = multiplication;
        }
        if (abs == answer) {
            multiplication = abs * next_num;
            answer = multiplication;
        }

        if (sum == answer) {
            multiplication = sum * next_num;
            answer = multiplication;

        }
        if (sqrt == answer) {
            multiplication = sqrt * next_num;
            answer = multiplication;
        }
        if (mines == answer) {
            multiplication = mines * next_num;
            answer = multiplication;

        }
        if (divison == answer) {
            multiplication = divison * next_num;
            answer = multiplication;
        }
        System.out.println("........................");
        System.out.println("answer : " + answer);
        System.out.println("........................");

        boolean isRun = true;
        while (isRun) {
            System.out.println("enter your opration :");
            input.nextLine();
            opration = input.nextLine();
            switch (opration) {
                case ("+"):
                    sum();
                    break;
                case ("-"):
                    mines();
                    break;
                case ("*"):
                    System.out.println("enter your next num : ");
                    next_num = input.nextInt();
                    multiplication = multiplication * next_num;
                    answer = multiplication;
                    System.out.println("........................");
                    System.out.println(" answer : " + answer);
                    System.out.println("........................");

                    break;
                case ("/"):
                    divison();
                    break;
                case ("^"):
                    Pow();
                    break;
                case ("!"):
                    factoriel();
                    break;
                case ("||"):
                    abs();
                    break;
                case ("//"):
                    Sqrt();
                    break;
                case ("="):
                    System.out.println("........................");

                    System.out.println("your final answer : " + answer);
                    System.out.println("........................");

                    isRun = false;

            }
        }

    }

    public void Ceil() {
        double ceil_answer = Math.ceil(first_num2);
        answer = (int) ceil_answer;
        System.out.println("........................");

        System.out.println("answer : " + answer);
        System.out.println("........................");

    }

    public void Floor() {
        double floor_answer = Math.floor(first_num2);
        answer = (int) floor_answer;
        System.out.println("........................");

        System.out.println("answer : " + answer);
        System.out.println("........................");

    }

    public void Pow() {
        Scanner input = new Scanner(System.in);
        boolean isRun = true;
        System.out.println("enter your next num : ");
        next_num = input.nextInt();
        if (mines == 0 && sum == 0 && multiplication == 0 && divison == 0
                && pow == 0 && fact == 0 && abs == 0 && sqrt == 0) {
            pow = (int) Math.pow(first_num, next_num);
            answer = pow;
        }
        if (sum == answer) {
            pow = (int) Math.pow(sum, next_num);
            answer = pow;

        }
        if (abs == answer) {
            pow = (int) Math.pow(abs, next_num);
            answer = pow;
        }
        if (multiplication == answer) {
            pow = (int) Math.pow(multiplication, next_num);
            answer = pow;
        }
        if (sqrt == answer) {
            pow = (int) Math.pow(sqrt, next_num);
            answer = pow;
        }
        if (fact == answer) {
            pow = (int) Math.pow(fact, next_num);
            answer = pow;
        }
        if (mines == answer) {
            pow = (int) Math.pow(mines, next_num);
            answer = pow;

        }
        if (divison == answer) {
            pow = (int) Math.pow(divison, next_num);
            answer = pow;
        }
        System.out.println("........................");

        System.out.println("answer : " + answer);
        System.out.println("........................");

        while (isRun) {
            System.out.println("enter your opration :");
            input.nextLine();
            opration = input.nextLine();

            switch (opration) {
                case ("+"):
                    sum();
                    break;
                case ("-"):
                    mines();
                    break;
                case ("*"):
                    multiplication();
                    break;
                case ("/"):
                    divison();
                    break;
                case ("^"):
                    System.out.println("enter your next num : ");
                    next_num = input.nextInt();
                    pow = (int) Math.pow(pow, next_num);
                    answer = pow;
                    System.out.println("........................");

                    System.out.println("answer : " + answer);
                    System.out.println("........................");

                    break;
                case ("!"):
                    factoriel();
                    break;
                case ("||"):
                    abs();
                    break;
                case ("//"):
                    Sqrt();
                    break;

                case ("="):
                    answer = pow;
                    System.out.println("........................");
                    System.out.println(" answer : " + answer);
                    System.out.println("........................");

                    isRun = false;
                    break;

            }

        }

    }

    public void factoriel() {
        Scanner input = new Scanner(System.in);
        if (mines == 0 && sum == 0 && multiplication == 0 && divison == 0
                && pow == 0 && fact == 0 && abs == 0 && sqrt == 0) {
            fact = first_num;
            if (fact > 0) {
                for (int i = 1; i < first_num; i++) {
                    fact = fact * i;
                    answer = fact;

                }
            } else {
                System.out.println("can not to be factorial!!");
            }

        }
        if (sum == answer) {
            fact = sum;
            if (fact > 0) {
                for (int i = 1; i < sum; i++) {
                    fact = fact * i;
                    answer = fact;

                }
            } else {
                System.out.println("can not to be factorial!!");
            }

        }
        if (mines == answer) {
            fact = mines;
            if (fact > 0) {

                for (int i = 1; i < mines; i++) {
                    fact = fact * i;
                    answer = fact;

                }
            } else {
                System.out.println("can not to be factorial!!");
            }
        }
        if (sqrt == answer) {
            fact = sqrt;
            if (fact > 0) {

                for (int i = 1; i < sqrt; i++) {
                    fact = fact * i;
                    answer = fact;

                }
            } else {
                System.out.println("can not to be factorial!!");
            }
        }
        if (multiplication == answer) {
            fact = multiplication;
            if (fact > 0) {

                for (int i = 1; i < multiplication; i++) {
                    fact = fact * i;
                    answer = fact;

                }
            } else {
                System.out.println("can not to be factorial!!");
            }
        }
        if (pow == answer) {
            fact = pow;
            if (fact > 0) {

                for (int i = 1; i < pow; i++) {
                    fact = fact * i;
                    answer = fact;

                }
            } else {
                System.out.println("can not to be factorial!!");
            }
        }
        if (divison == answer) {
            fact = divison;
            if (fact > 0) {

                for (int i = 1; i < divison; i++) {
                    fact = fact * i;
                    answer = fact;

                }
            } else {
                System.out.println("can not to be factorial!!");
            }
        }
        if (abs == answer) {
            fact = abs;
            if (fact > 0) {

                for (int i = 1; i < abs; i++) {
                    fact = fact * i;
                    answer = fact;

                }
            } else {
                System.out.println("can not to be factorial!!");
            }
        }

        answer = fact;
        System.out.println("........................");

        System.out.println("answer : " + answer);
        System.out.println("........................");

        boolean isRun = true;
        while (isRun) {
            System.out.println("enter your opration :");
            opration = input.nextLine();

            switch (opration) {
                case ("+"):
                    sum();
                    break;
                case ("-"):
                    mines();
                    break;
                case ("*"):
                    multiplication();
                    break;
                case ("/"):
                    divison();
                    break;
                case ("^"):
                    Pow();
                    break;
                case ("!"):
                    for (int i = 1; i < fact; i++) {
                        fact = fact * i;
                        answer = fact;
                        System.out.println("........................");

                        System.out.println("answer : " + answer);
                        System.out.println("........................");

                        break;

                    }
                case ("//"):
                    Sqrt();
                    break;
                case ("="):
                    System.out.println("your final answer : " + answer);
                    isRun = false;

            }
        }

    }

    public void Sqrt() {
        Scanner input = new Scanner(System.in);
        if (mines == 0 && sum == 0 && multiplication == 0 && divison == 0
                && pow == 0 && fact == 0 && sqrt == 0 && abs == 0) {
            sqrt = (int) Math.sqrt(first_num);
            answer = sqrt;

        }
        if (sum == answer) {
            sqrt = (int) Math.sqrt(sum);
            answer = sqrt;

        }

        if (mines == answer) {
            sqrt = (int) Math.sqrt(mines);
            answer = sqrt;

        }
        if (multiplication == answer) {
            sqrt = (int) Math.sqrt(multiplication);
            answer = sqrt;

        }
        if (pow == answer) {
            sqrt = (int) Math.sqrt(pow);
            answer = sqrt;
        }
        if (divison == answer) {
            sqrt = (int) Math.sqrt(divison);
            answer = sqrt;
        }
        if (fact == answer) {
            sqrt = (int) Math.sqrt(fact);
            answer = sqrt;
        }

        answer = sqrt;
        System.out.println("........................");

        System.out.println("answer : " + answer);
        System.out.println("........................");

        boolean isRun = true;
        while (isRun) {
            System.out.println("enter your opration :");
            opration = input.nextLine();

            switch (opration) {
                case ("+"):
                    sum();
                    break;
                case ("-"):
                    mines();
                    break;
                case ("*"):
                    multiplication();
                    break;
                case ("/"):
                    divison();
                    break;
                case ("^"):
                    Pow();
                    break;
                case ("!"):
                    factoriel();
                    break;
                case ("//"):
                    System.out.println("enter your next num : ");
                    next_num = input.nextInt();
                    sqrt = (int) Math.pow(sqrt, next_num);
                    answer = sqrt;
                    System.out.println("........................");

                    System.out.println(" answer : " + answer);
                    System.out.println("........................");

                    break;

                case ("="):
                    System.out.println("........................");

                    System.out.println("your final answer : " + answer);
                    System.out.println("........................");

                    isRun = false;

            }
        }

    }

    public void abs() {
        Scanner input = new Scanner(System.in);
        if (mines == 0 && sum == 0 && multiplication == 0 && divison == 0
                && pow == 0 && fact == 0 && sqrt == 0 && abs == 0) {
            if (first_num < 0) {
                abs = -1 * first_num;
                answer = abs;

            } else {
                abs = first_num;
                answer = abs;
            }

        }
        if (sum == answer) {
            if (sum < 0) {
                abs = -1 * sum;
                answer = abs;

            } else {
                abs = sum;
                answer = abs;
            }
        }
        if (mines == answer) {
            if (mines < 0) {
                abs = -1 * mines;
                answer = abs;

            } else {
                abs = mines;
                answer = abs;
            }
        }
        if (multiplication == answer) {
            if (sum < 0) {
                abs = -1 * multiplication;
                answer = multiplication;

            } else {
                abs = multiplication;
                answer = abs;
            }
        }
        if (divison == answer) {
            if (divison < 0) {
                abs = -1 * divison;
                answer = abs;

            } else {
                abs = divison;
                answer = abs;
            }
        }
        if (pow == answer) {
            if (pow < 0) {
                abs = -1 * pow;
                answer = abs;

            } else {
                abs = pow;
                answer = abs;
            }
        }
        System.out.println("........................");
        System.out.println("answer : " + answer);
        System.out.println("........................");

        boolean isRun = true;
        while (isRun) {
            System.out.println("enter your opration :");
            opration = input.nextLine();

            switch (opration) {
                case ("+"):
                    sum();
                    break;
                case ("-"):
                    mines();
                    break;
                case ("*"):
                    multiplication();
                    break;
                case ("/"):
                    divison();
                    break;
                case ("^"):
                    Pow();
                    break;
                case ("!"):
                    factoriel();
                    break;
                case ("//"):
                    Sqrt();
                    break;

                case ("="):
                    answer = abs;
                    System.out.println("........................");

                    System.out.println(" answer : " + answer);
                    System.out.println("........................");

                    isRun = false;
            }

        }

    }

    public void divison() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your next num : ");
        next_num = input.nextInt();
        if (mines == 0 && sum == 0 && multiplication == 0 && divison == 0
                && pow == 0 && sqrt == 0 && pow == 0 && abs == 0) {
            divison = first_num / next_num;
            answer = divison;
        }
        if (pow == answer) {
            divison = pow / next_num;
            answer = divison;
        }
        if (sum == answer) {
            divison = sum / next_num;
            answer = divison;

        }
        if (mines == answer) {
            divison = mines / next_num;
            answer = divison;

        }
        if (abs == answer) {
            divison = abs / next_num;
            answer = divison;
        }
        if (sqrt == answer) {
            divison = sqrt / next_num;
            answer = divison;
        }
        if (fact == answer) {
            divison = fact / next_num;
            answer = divison;
        }
        if (multiplication == answer) {
            divison = multiplication / next_num;
            answer = divison;
        }
        System.out.println("........................");
        System.out.println(" answer : " + divison);
        System.out.println("........................");

        boolean isRun = true;
        while (isRun) {
            System.out.println("enter your opration :");
            input.nextLine();
            opration = input.nextLine();
            switch (opration) {
                case ("+"):
                    sum();
                    break;
                case ("-"):
                    mines();
                    break;
                case ("*"):
                    multiplication();
                    break;
                case ("/"):
                    System.out.println("enter your next num : ");
                    next_num = input.nextInt();
                    divison = divison / next_num;
                    answer = divison;
                    System.out.println(" answer : " + answer);
                    break;
                case ("//"):
                    Sqrt();
                    break;
                case ("!"):
                    factoriel();
                    break;
                case ("^"):
                    Pow();
                    break;
                case ("||"):
                    abs();
                    break;

                case ("="):
                    System.out.println("........................");

                    System.out.println("your final answer : " + answer);
                    System.out.println("........................");

                    isRun = false;
            }
        }

    }

    public void max() {
        System.out.println(list.size());
        for (int i = 0; i < list.size() - 1; i++) {
            max = Math.max((int) list.get(i), (int) list.get(i +1));
        }
        System.out.println("your maximum number in your list : " + max);
    }

    public void min() {
        for (int i = 0; i < list.size() - 1; i++) {
            min = Math.min((int) list.get(i), (int) list.get(i + 1));
        }
        System.out.println("your minimum number in your list : " + min);

    }
}

public class JavaApplication18 {

    public static void main(String[] args) {
        Input f = new Input();
        f.choose_block();

    }

}
