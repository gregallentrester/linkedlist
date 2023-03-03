package net.greg.examples.salient;

import java.util.*;
import java.util.stream.*;


class Pilot {

  private static List<String> list =
    Arrays.asList("a", "b", "c");


  public static void main(String[] a) {

    String result =
      list.stream().
        map(x -> x.toUpperCase()).
        collect(Collectors.joining(","));

    System.err.println(result);
  }
}
