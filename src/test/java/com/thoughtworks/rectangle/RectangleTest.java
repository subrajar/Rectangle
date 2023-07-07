package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;



public class RectangleTest {
    @Test
    void shouldReturnAreaOfRectangleIs75WhenLength25AndBreath3(){
        
        Rectangle rectangle = new Rectangle(2.5,3);
        
        double area = rectangle.area();
        
        assertThat(area,is(closeTo(7.5,0.01)));
    }

    @Test
    void shouldReturnpPerimeterOfRectangleIs10WhenLength2AndBreath3(){

        Rectangle rectangle = new Rectangle(2,3);
        
        double area = rectangle.perimeter();
        
        assertThat(area,is(closeTo(10.0,0.01)));
        
    }
}
