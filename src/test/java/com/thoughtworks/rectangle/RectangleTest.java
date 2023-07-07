package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class RectangleTest {
    @Test
    void areaOfRectangleWithLength2AndBreath3Is6(){
        
        Rectangle rectangle = new Rectangle(2,3);
        
        int area = rectangle.calculateArea();
        
        assertEquals(6,area);
    }
}
