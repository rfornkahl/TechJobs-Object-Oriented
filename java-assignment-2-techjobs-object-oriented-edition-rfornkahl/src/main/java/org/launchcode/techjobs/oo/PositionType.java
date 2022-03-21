package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    //Code now contained in JobField
    // private int id;
    //private static int nextId = 1;
    //private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }


    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }



}
