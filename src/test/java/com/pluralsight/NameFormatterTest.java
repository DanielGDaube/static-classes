package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {
    @Test
    public void format_FiveParameters_NameFormatted(){

        assertEquals("Daube, Daniel", NameFormatter.format("","Daniel","","Daube",""));
        assertEquals("Daube, Dr. Daniel G", NameFormatter.format("Dr.", "Daniel", "G","Daube", ""));
        assertEquals("Daube, Daniel G, PHD", NameFormatter.format("", "Daniel", "G","Daube", "PHD"));

    }

    @Test
    public void format_FirstAndLast_NameFormatted(){

        assertEquals("Daube, Daniel", NameFormatter.format("Daniel", "Daube"));

    }
}