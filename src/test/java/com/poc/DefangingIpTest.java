package com.poc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefangingIpTest {

    private DefangingIp defangingIp;

    @BeforeEach
    void setUp() {
        defangingIp = new DefangingIp();
    }

    @Test
    void defangIpAddressV1() {
        assertEquals("1[.]1[.]1[.]1",
                defangingIp.defangIpAddressV1("1.1.1.1"));
    }

    @Test
    void defangIpAddressV2() {
        assertEquals("1[.]1[.]1[.]1",
                defangingIp.defangIpAddressV2("1.1.1.1"));
    }
}