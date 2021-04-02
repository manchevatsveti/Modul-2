package demo;

import java.util.TreeSet;

public class test {
	public static void main(String args[])
    {
        TreeSet<Integer> tree = new TreeSet<Integer>();
  
        // Add elements to this TreeSet
        tree.add(10);
        tree.add(5);
        tree.add(8);
        tree.add(1);
        tree.add(11);
        tree.add(3);
        tree.add(14);
        tree.add(16);
  
        System.out.println(tree.lower(15));
        System.out.println(tree.higher(15));
    }
}
