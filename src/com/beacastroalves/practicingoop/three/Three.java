package com.beacastroalves.practicingoop.three;

import java.util.ArrayList;
import java.util.List;

public class Three  {
  public static void sayHi(Father father) {
    father.hi();
  }

  public static void sayHi(Child child) {
    child.hi();
    child.play();
  }
  public static void sayHi(Sibling sibling) {
    sibling.hi();
    sibling.read();
  }

  public static void main(String[] args) {
    Father father = new Father();
    Father father2 = new Father();
    Child child = new Child();
    Child child2 = new Child();
    Sibling sibling = new Sibling();
    Sibling sibling2 = new Sibling();


    /////////////////// Approach 1 /////////////////////
    List<Father> fathers = new ArrayList<>();
    fathers.add(father);
    fathers.add(father2);

    List<Child> children = new ArrayList<>();
    children.add(child);
    children.add(child2);

    List<Sibling> siblings = new ArrayList<>();
    siblings.add(sibling);
    siblings.add(sibling2);

    for (Father f : fathers) {
      sayHi(f);
    }

    for (Child c : children) {
      sayHi(c);
    }

    for (Sibling s : siblings) {
      sayHi(s);
    }

    /////////////////// Approach 2 /////////////////////
    List<Father> compound = new ArrayList<>();
    compound.add(father);
    compound.add(father2);
    compound.add(child);
    compound.add(child2);
    compound.add(sibling);
    compound.add(sibling2);

    for (Father item : compound) {
      sayHiCompound(item);
    }
  }
  public static void sayHiCompound(Father father) {
    father.hi();

    if (father instanceof Child) {
      ((Child) father).play();
    }

    if (father instanceof Sibling) {
      ((Sibling) father).read();
    }
  }
}
