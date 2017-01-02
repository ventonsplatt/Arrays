package com.company.calcengine2;

public class Main {

    public static void main(String[] args) {
	// arrays
        float [] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;

        float sum = 0.0f;
        float sum2 = 0.0f;


        for (int i = 0; i < theVals.length; i++)
            sum += theVals[i];

        System.out.println(sum);


     // shorthand array
        float [] theVals2 = {12.0f, 36.0f, 60.0f, 800.0f };
        for (int i = 0; i < theVals2.length; i++)
            sum2 += theVals2[i];

        System.out.println(sum2);


        System.out.println("complete");


    }
}
