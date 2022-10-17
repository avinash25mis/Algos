package com;

import java.util.*;

public class Test {

    /*
    * Input-[1,2,3,4,5,6]
     Output-[2,1,4,3,6,5]
    *
    * */



    public static void main(String[] args) {
   List<Integer> list= new ArrayList<>();
   list.stream().filter(n -> n % 2 == 0).distinct()
    }


}
