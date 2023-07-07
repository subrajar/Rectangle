package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;



public class RectangleTest {
    @Test
    void shouldReturnAreaOfRectangleIs6WhenLength2AndBreath3(){
        
        Rectangle rectangle = new Rectangle(2,3);
        
        int area = rectangle.calculateArea();
        
        assertThat(area,is(equalTo(6)));
    }
}
