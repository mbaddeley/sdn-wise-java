/*
 * Copyright (C) 2016 Seby
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.sdnwiselab.sdnwise.packet;

import com.github.sdnwiselab.sdnwise.util.NodeAddress;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests for the BeaconPacket class.
 *
 * @author Sebastiano Milardo
 */
public final class BeaconPacketTest {

    /**
     * Test of getDistance method, of class BeaconPacket.
     */
    @Test
    public void testGetDistance() {
        BeaconPacket instance = new BeaconPacket(1, new NodeAddress("0.2"),
                new NodeAddress("0.0"), 1, 1);
        int expResult = 1;
        int result = instance.getDistance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBattery method, of class BeaconPacket.
     */
    @Test
    public void testGetBattery() {
        BeaconPacket instance = new BeaconPacket(1, new NodeAddress("0.2"),
                new NodeAddress("0.0"), 1, 1);
        int expResult = 1;
        int result = instance.getBattery();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSinkAddress method, of class BeaconPacket.
     */
    @Test
    public void testGetSinkAddress() {
        BeaconPacket instance = new BeaconPacket(1, new NodeAddress("0.2"),
                new NodeAddress("0.0"), 1, 1);
        NodeAddress expResult = new NodeAddress("0.0");
        NodeAddress result = instance.getSinkAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of toByteArray method, of class BeaconPacket.
     */
    @Test
    public void testToByteArray() {
        BeaconPacket instance = new BeaconPacket(1, new NodeAddress("0.2"),
                new NodeAddress("0.0"), 1, 1);
        String expResult = "[1, 12, -1, -1, 0, 2, 1, 100, 0, 0, 1, 1]";
        String result = Arrays.toString(instance.toByteArray());
        assertEquals(expResult, result);
    }
}
