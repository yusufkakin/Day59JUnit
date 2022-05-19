import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class MethodReturnTypesTest {

    @Test
    void stringCaller() {
        assertEquals("StringInput", MethodReturnTypes.stringCaller("StringInput"));
    }

    @Test
    void intCaller() {
        assertEquals(2, MethodReturnTypes.intCaller(2));
    }

}