package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImperialApiTester {
    ImperialApi imperialApi = new ImperialApi();
    @Test
    void centimeter(){
        double inch = 1;
        double expected = 2.54;
        double result = imperialApi.centimeter(inch);
        assertEquals(expected, result);

    }
    @Test
    void meter(){
        double yard = 1;
        double expected = 1/1.094;
        double result = imperialApi.meter(yard);
        assertEquals(expected, result);

    }
}
