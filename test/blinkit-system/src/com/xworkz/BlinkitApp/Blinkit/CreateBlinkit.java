package com.xworkz.BlinkitApp.Create;


    static String itemNames[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    static int index;
    public static boolean addItems (String items){
        boolean isbrand = false;
        if (index < itemNames.length) {
            if (items != null) {
                itemNames[index] = items;
                index++;
                isbrand = true;
            } else
                System.out.println("Items not found");
        } else {
            System.out.println("next time........");
        }
        return isbrand;
    }



