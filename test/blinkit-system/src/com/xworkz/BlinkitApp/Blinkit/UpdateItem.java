package com.xworkz.BlinkitApp.Update;

public static boolean updateItems(String oldName,String newName){
    boolean isupdateItems=false;
    for(int index=0;index<itemNames.length;index++)
        if(oldName==itemNames[index]){
            itemNames[index]=newName;
            isupdateItems=true;
        }else{
            System.out.println("not updated");
        }
    return isupdateItems;
}