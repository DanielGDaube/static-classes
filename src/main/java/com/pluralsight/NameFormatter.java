package com.pluralsight;

import java.util.ArrayList;

public class NameFormatter {
    private NameFormatter(){}


   public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        ArrayList<String> name = new ArrayList<>();
        lastName = lastName + ",";
        name.add(lastName);

        if (!prefix.isBlank()){
            name.add(prefix);
        }

        name.add(firstName);

        if (!middleName.isBlank()){
            if (!suffix.isBlank()){
                middleName = middleName + ",";
            }
            name.add(middleName);
        }

        if (!suffix.isBlank()){
            name.add(suffix);
        }
        String formattedName = lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;

        for (String ignored : name){
            formattedName = String.join(" ", name);
        }

        return formattedName;

    }

    public static String format(String firstName, String lastName){
        return NameFormatter.format("",firstName,"",lastName,"");
    }
}
