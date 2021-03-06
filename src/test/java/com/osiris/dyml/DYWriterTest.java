/*
 *  Copyright Osiris Team
 *  All rights reserved.
 *
 *  This software is licensed work.
 *  Please consult the file "LICENSE" for details.
 */

package com.osiris.dyml;

import com.osiris.dyml.utils.UtilsForModules;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DYWriterTest {

    @Test
    void alreadyExists() {
        DYModule queryModule1 = new DYModule().setKeys("p1","c2"); // Should be found
        DYModule queryModule2 = new DYModule().setKeys("random","not matching stuff"); // Should not be found
        List<DYModule> list = new ArrayList<>();
        list.add(new DYModule().setKeys("p1","c1"));
        list.add(new DYModule().setKeys("p1","c2"));

        assertNotNull(new UtilsForModules().getExisting(queryModule1, list));
        assertNull(new UtilsForModules().getExisting(queryModule2, list));
    }
}