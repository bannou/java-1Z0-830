package ps.control.m3;

import java.io.Serializable;

public class _3PatternMatchingSupportedTypes {

    public static void main(String[] args) {

        String input = null;

        if (input instanceof String i)  // false
            System.out.println(i.equals(""));


        Number distance = 123;
        if (distance instanceof Integer i) {} // lower level
        if (distance instanceof Double d) {} // lower level
        if (distance instanceof Number n) {}  // same level
        if (distance instanceof Object o) {}  // higher level
        if (distance instanceof Serializable s) {}  // higher level

//        if(distance instanceof String s) {} // incompatible

        Double dNum = 123.0;
//        if (dNum instanceof Integer i) {}
    }
}
