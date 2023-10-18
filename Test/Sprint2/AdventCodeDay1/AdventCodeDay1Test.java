package Sprint2.AdventCodeDay1;

import org.junit.jupiter.api.Test;

class AdventCodeDay1Test {
    int listOfData[] = {199,200,208,210,200,207,240,269,260,263};
    AdventCodeDay1 test = new AdventCodeDay1();

    @Test
    public void iterateOverArrayTest() {
        int counter = test.iterateOverArray(listOfData);
        assert(counter == 7);
    }
}