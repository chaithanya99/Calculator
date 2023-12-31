package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private App cal;

    @Before
    public void setUP(){
        cal=new App();
    }

    @Test
    public void add_positive_numbers(){
        int a=52;
        int b=25;
        int result=77;
        assertEquals(result, cal.add(a, b));
    }

    @Test
    public void add_positive_negative(){
        int a=-52;
        int b=25;
        int result=-27;
        assertEquals(result, cal.add(a, b));
    }

    @Test
    public void add_negative_numbers(){
        int a=-52;
        int b=-25;
        int result=-77;
        assertEquals(result, cal.add(a, b));
    }



    @Test
    public void sub_positive_numbers(){
        int a=2;
        int b=5;
        int result=-3;
        assertEquals(result, cal.sub(a, b));
    }

    @Test
    public void sub_positive_negative(){
        int a=4;
        int b=-34;
        int result=38;
        assertEquals(result, cal.sub(a, b));
    }

    @Test
    public void sub_negative_numbers(){
        int a=-2;
        int b=-5;
        int result=3;
        assertEquals(result, cal.sub(a, b));
    }






    @Test
    public void mul_positive_numbers(){
        int a=3;
        int b=7;
        int result=21;
        assertEquals(result, cal.mul(a, b));
    }
    
    @Test
    public void mul_positive_negative(){
        int a=5;
        int b=-7;
        int result=-35;
        assertEquals(result, cal.mul(a, b));
    }

    @Test
    public void mul_negative_numbers(){
        int a=-5;
        int b=-20;
        int result=100;
        assertEquals(result, cal.mul(a, b));
    }


    @Test
    public void divide(){
        int a=10;
        int b=5;
        int result=2;
        assertEquals(result, cal.div(a,b));
    }

    @Test
    public void divide1(){
        int a=121;
        int b=11;
        int result=11;
        assertEquals(result, cal.div(a,b));
    }
   
}
