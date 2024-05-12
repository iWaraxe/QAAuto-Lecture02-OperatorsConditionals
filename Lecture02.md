# Lecture 2: Operators and If Statements

## Operators in Java
Java provides a rich set of operators for managing variables, which can be classified into the following groups:
- **Arithmetic operators**
- **Comparison operators**
- **Bitwise operators**
- **Logical operators**
- **Assignment operators**
- **Other operators**

### Arithmetic Operators
Arithmetic operators are used in mathematical expressions in the same way as they are used in algebra. For example, consider two integer variables `a` with a value of 10 and `b` with a value of 20. The following table lists the arithmetic operators in Java:

```java
int a = 10;
int b = 20;
int c = 25;
int d = 25;
System.out.println("a + b = " + (a + b));
System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b));
System.out.println("b / a = " + (b / a));
System.out.println("b % a = " + (b % a));
System.out.println("c % a = " + (c % a));
System.out.println("a++ = " + (a++));
System.out.println("b-- = " + (a--));
System.out.println("d++ = " + (d++));
System.out.println("++d = " + (++d));
```

**Results:**
```
a + b = 30
a - b = -10
a * b = 200
b / a = 2
b % a = 0
c % a = 5
a++ = 10
b-- = 11
d++ = 25
++d = 27
```

### Comparison Operators
Java supports several comparison operators, as shown in the table below:

```java
int a = 10;
int b = 20;
System.out.println("a == b = " + (a == b));
System.out.println("a != b = " + (a != b));
System.out.println("a > b = " + (a > b));
System.out.println("a < b = " + (a < b));
System.out.println("b >= a = " + (b >= a));
System.out.println("b <= a = " + (b <= a));
```

**Results:**
```
a == b = false
a != b = true
a > b = false
a < b = true
b >= a = true
b <= a = false
```

### Logical Operators
Consider a boolean variable `a` with the value true and `b` with the value false. The following table lists the logical operators:

```java
boolean a = true;
boolean b = false;
System.out.println("a && b = " + (a && b));
System.out.println("a || b = " + (a || b));
System.out.println("!(a && b) = " + !(a && b));
```

**Results:**
```
a && b = false
a || b = true
!(a && b) = true
```

### Assignment Operators
Java supports several assignment operators, as illustrated below:

```java
int a = 10;
int b = 20;
int c = 0;
c = a + b;
System.out.println("c = a + b = " + c);
c += a;
System.out.println("c += a = " + c);
c -= a;
System.out.println("c -= a = " + c);
c *= a;
System.out.println("c *= a = " + c);
c /= a;
System.out.println("c /= a = " + c);
c %= a;
System.out.println("c %= a = " + c);
```

**Results:**
```
c = a + b = 30
c += a = 40
c -= a = 30
c *= a = 300
c /= a = 1
c %= a = 5
```

### Ternary Operator
The ternary (conditional) operator in Java consists of three operands and is used to evaluate boolean expressions to decide what value should be assigned to a variable:

```java
int a, b;
a = 10;
b = (a == 1) ? 20 : 30;
System.out.println("Value of b: " + b);
b = (a == 10) ? 20 : 30;
System.out.println("Value of b: " + b);
```

### Operator Precedence in Java
Operator precedence determines how terms are grouped in an expression and affects how an expression is evaluated. For instance, multiplication (`*`) has a higher precedence than addition (`

+`). Here's an example:

```java
int x = 7 + 3 * 2; // Here x is assigned 13, not 20
```

## Decision Making with If in Java
The `if` statement in Java follows this syntax:

```java
if (logical_expression) {
   // Statements executed if true
}
```

If the logical expression is true, then the block of code inside the `if` statement will be executed. If it is false, the next block of code will be executed. Here is an example:

```java
public class Test {
   public static void main(String args[]) {
      int x = 10;
      if (x < 20) {
         System.out.print("This is an if statement");
      }
   }
}
```

**Result:**
```
This is an if statement
```

### Syntax for If-Else in Java
The `if..else` statement in Java is as follows:

```java
if (logical_expression) {
   // Executes if true
} else {
   // Executes if false
}
```

### If-Else-If Ladder
An `if` statement can be followed by an optional `else if...else`, which is very useful in handling multiple conditions:

```java
public class Test {
   public static void main(String args[]) {
      int x = 30;
      if (x == 10) {
         System.out.print("X value is 10");
      } else if (x == 20) {
         System.out.print("X value is 20");
      } else if (x == 30) {
         System.out.print("X value is 30");
      } else {
         System.out.print("This is the else statement");
      }
   }
}
```

**Result:**
```
X value is 30
```

### Common Mistakes in Homework:
1. **Variable Scope**: Variables should be declared outside the `if` block.
2. **Assigning max and min to zero**: What if the numbers are negative?
3. **When to declare vs. assign a variable**: Explain when it is enough to just declare a variable and assign its value later in the code, and when it should be assigned immediately.
4. **Code Block in If**: Even for single-line code, it is advisable to enclose it in braces.

---