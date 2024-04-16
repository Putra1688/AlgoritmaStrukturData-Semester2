package Pertemuan8_Stack;

public class Postfix23 {
    int n, top;
    char stack [];

    // Postfix
    public Postfix23(int total) {
    n = total;
    top = -1;
    stack = new char[n];
    push('(');
    }

    // Push
    public void push (char c) {
        top++;
        stack[top] = c;
    }

    // Pop
    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    // mengecek apakah elemen data berupa operand
    public boolean IsOperand (char c) {
        if ((c >= 'A' && c <='Z') || (c >='a' && c <= 'z') || (c >= '0' && c <= '9') || c ==' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    // mengecek apakah elemen data berupa operator
    public boolean IsOperator (char c) {
        if (c =='^' || c == '%' || c == '/' || c == '*' || c == '+' || c == '-') {
            return true;
        } else {
            return false;
        }
    }

    public int derajat (char c) {
        switch (c) {
            case '^' :
                return 3;
            case '%' :
                return 2;
            case '/' :
                return 2;
            case '*' :
                return 2;
            case '-' :
                return 1;
            case '+' :
                return 1;
            default:
                return 0;
        }
    }

    // konversi notasi infix menjadi notasi postfix
    public String konversi (String Q) {
        String p = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                p = p + c;
            }
            if ( c == '(') {
                push(c);
            }
            if ( c == ')') {
                while (stack[top] != '(') {
                    p = p + pop();
                }
                pop();
            }
            if (IsOperator(c)) {
                while ((top >= 0 && derajat(stack[top]) >= derajat(c))) {
                p = p + pop();
            } 
            push(c);
            }
        }
        return p;
    }
}
