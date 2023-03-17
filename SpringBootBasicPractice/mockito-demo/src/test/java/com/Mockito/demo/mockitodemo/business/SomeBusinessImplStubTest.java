package com.Mockito.demo.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    void test(){
        DataserviceStub dataserviceStub = new DataserviceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataserviceStub);
        int result = businessImpl.ftg();
        assertEquals(25, result);
    }
}

class DataserviceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[] {25, 15, 5};
    }

}