/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */
import java.util.stream.*;
import java.util.*;

public class Addition {

    public Addition(){}

    public Integer add(Integer ...values) {
        return new ArrayList<Integer>(Arrays.asList(values)).stream().reduce(0, (sum, val) -> sum+val);
    }

    /* Didn't work */
//    public Float add(Float ...values) {
//        return new ArrayList<Float>(Arrays.asList(values)).stream().reduce(0.0f, (sum, val) -> sum+val);
//    }

    public Float add(float a, float b, float c) {
        return a + b + c;
    }
}

