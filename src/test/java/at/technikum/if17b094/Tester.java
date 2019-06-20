package at.technikum.if17b094;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class Tester {

    @Test
    public void test1(){
        assertTrue(true);
        assertEquals(1,1);
    }

    @Test
    public void testMock(){
        List i = Mockito.mock(List.class);
        when(i.size()).thenReturn(1);
        assertEquals(1, i.size());
    }

    @Test
    @Tag("integrationTest")
    public void testIntegration(){
        assertTrue(true);
    }


}
