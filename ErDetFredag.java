package com.example.hellospring.services;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ErDetFredag {

public static String svar;

  public static String IsItFriday() {
    SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");
    String stringDate2 = sdf2.format(new Date());


    if (stringDate2.equals("fredag"))  {
      svar = "Ja det er fredag!";
      System.out.println(svar);
    } else {
      svar = "Nej det er " + stringDate2;
      System.out.println(svar);
    }
    return svar;
  }
}
