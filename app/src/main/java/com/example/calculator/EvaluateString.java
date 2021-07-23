package com.example.calculator;

import java.util.Stack;


public class EvaluateString {

    public static Double evaluate(String expression) {


        expression = ModifyString.modify(expression);

        char[] tokens = expression.toCharArray();

        Stack<Double> values = new Stack<Double>();

        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i] == ' ')
                continue;

            if (((tokens[i] >= '0' && tokens[i] <= '9') || (tokens[i] == '.'))) {
                StringBuilder sbuf = new StringBuilder();

                while (i < tokens.length && ((tokens[i] >= '0' && tokens[i] <= '9') || (tokens[i] == '.')))
                    sbuf.append(tokens[i++]);
                values.push(Double.parseDouble(sbuf.toString()));

                i--;
            } else if (tokens[i] == '(')
                ops.push(tokens[i]);

            else if (tokens[i] == ')') {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), Double.parseDouble(values.pop().toString()),
                            Double.parseDouble(values.pop().toString())));
                ops.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {

                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    values.push(applyOp(ops.pop(), Double.parseDouble(values.pop().toString()),
                            Double.parseDouble(values.pop().toString())));

                ops.push(tokens[i]);
            }
        }

        while (!ops.empty())
            values.push(applyOp(ops.pop(), Double.parseDouble(values.pop().toString()),
                    Double.parseDouble(values.pop().toString())));

        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static Double applyOp(char op, Double b, Double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0.0;
    }
}
