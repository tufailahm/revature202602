package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParticipantsList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Riya");
        names.add("Arafa");
        names.add("Neha");
        names.add("Harish");
        names.add("Karthik");
        names.remove("Neha");
        System.out.println(names.contains("Riya"));

        Collections.sort(names);

        System.out.println(names);

        List<String> selectedParticipants = Collections.unmodifiableList(names);        //created immutable collection

        selectedParticipants.add("Tufail");     //error because it is immutable

        System.out.println(selectedParticipants);
    }
}
