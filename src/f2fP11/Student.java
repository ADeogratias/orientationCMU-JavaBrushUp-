package f2fP11;

import java.util.*;
import java.io.*;
/**
 *
 * @author Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */

public class Student
{
    private String name;
    private int joiningYear;
    private String program;
    private String country;
    private String phoneNumber; // assuming they use country codes i.e.: +250

    public Student(String name, int joiningYear, String program, String country, String phoneNumber) {
        this.name = name;
        this.joiningYear = joiningYear;
        this.program = program;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    // For a student without a phone number
    public Student(String name, int joiningYear, String program, String country) {
        this.name = name;
        this.joiningYear = joiningYear;
        this.program = program;
        this.country = country;
        this.phoneNumber = "N/A";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\n Student Registered as " + name +
                "\n Student is from " + country +
                "\n Student joined in the year " + joiningYear +
                "\n Student is doing " + program  +
                "\n Student phone number is " + phoneNumber ;
    }

}
