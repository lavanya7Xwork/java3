package com.xworkz.BlinkitApp.Delete;

import java.util.Arrays;

public static boolean deleteWineBrand(String itemDeleted){
    boolean isdeleted=false;
    int newindex,oldindex;
    for(newindex=0,oldindex=0;oldindex<itemNames.length;oldindex++){
        if(itemNames[oldindex]!=itemDeleted){
            itemNames[newindex]=itemNames[oldindex];
            newindex++;
        }
    }
    itemNames=Arrays.copyOf(itemNames,newindex);
    if(itemNames!=null){
        isdeleted=true;
    }
    if(isdeleted==false){
        System.out.println(itemDeleted+"not found");
    }
    return isdeleted;
}
}