package com.syntax.groupExercise2;
/*
We have to calculate the average of marks obtained
in three subjects by student A and by student B.
Create   class   'Marks'   with   an   abstract   method
'getPercentage' that will be returning the average
percentage   of   marks.   Provide   implementation   of
abstract   method   in   classes   'A'   and   'B'.   The
constructor of student A takes the marks in three
subjects as its parameters and the marks in four
subjects as its parameters for student B. Test your
code
 */
public abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks{
    double sub1, sub2, sub3;

    public A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    double getPercentage() {
        return (sub1+sub2+sub3)/3;
    }
}

class B extends Marks{
    double sub1, sub2, sub3, sub4;

    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    double getPercentage() {
        return (sub1+sub2+sub3+sub4)/4;
    }
}

class MarksTest{
    public static void main(String[] args) {
        Marks A = new A(87, 98, 92);
        System.out.println(A.getPercentage());

        Marks B = new B(54, 67, 75, 80);
        System.out.println(B.getPercentage());
    }
}