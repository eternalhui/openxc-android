package com.openxc.measurements;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import junit.framework.TestCase;

import com.openxc.units.Liter;

public class FuelConsumedTest extends TestCase {
    FuelConsumed measurement;

    @Override
    public void setUp() {
        measurement = new FuelConsumed(new Liter(1.0));
    }

    public void testGet() {
        assertThat(measurement.getValue().doubleValue(), equalTo(1.0));
    }

    public void testHasRange() {
        assertTrue(measurement.hasRange());
    }
}
