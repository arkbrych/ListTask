package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Arkadiusz
 * class is adding numbers using recursion
 */
public class Logic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        Integer sum = 0;

        NumbersReader(list);

        for (Integer all : list
        ) {
            sum = sum + all;
        }
        for (int i = 0; i < list.size(); i++) {
            builder.append(i);
            if (i != (list.size() - 1)) {
                builder.append(" + ");
            }
        }
        System.out.println(builder.toString() + " = " + sum);
    }

    private static List<Integer> NumbersReader(List<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write number");
        String number = input.next();

        if (number.equalsIgnoreCase("exit")) {
            input.close();
            return list;
        } else {
            list.add(Integer.parseInt(number));
            NumbersReader(list);
        }
        input.close();
        return list;
    }
}
