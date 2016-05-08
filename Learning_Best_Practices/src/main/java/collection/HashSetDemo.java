package collection;

import java.util.HashSet;

class HashSetDemo {
  public static void main(String args[]) {

    HashSet<String> hs = new HashSet<String>();

    hs.add("2");
    hs.add("3");
    hs.add("4");
    hs.add("5");
    hs.add("1");

    hs.add("4");

    System.out.println(hs);
  }
}
