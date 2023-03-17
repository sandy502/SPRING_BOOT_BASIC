package com.Mockito.demo.mockitodemo.list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void test(){

        List listmock = mock(List.class);

        when(listmock.size()).thenReturn(3);

        assertEquals(3, listmock.size());
    }
}
