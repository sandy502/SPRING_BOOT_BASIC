package com.Mockito.demo.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    // Mocks are simpler and easier to write well i didnt understand it but i will comeback to it.

    // Some easy ways to do the same mocking thing
    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void test(){
//        DataService dataServiceMock = mock(DataService.class);

        // dataServiceMock.retrieveAllData -> new int[] {25, 15, 5}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
//        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(25, businessImpl.ftg());
    }


}
