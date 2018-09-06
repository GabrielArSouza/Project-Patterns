/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.composite;

import java.util.ArrayList;

/**
 * Adapted from: https://sourcemaking.com/design_patterns/composite/java/3
 * @author gabriel & victor
 */
public class Composite implements Component {
     // 3. Couple to interface
    private ArrayList<Component>  children;
    private int value;
    public Composite(int val) {
        value = val;
        children = new ArrayList<Component>();
    }
    
    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void traverse() {
    	traverse(0);
    }
    
    @Override
    public void traverse(int nvl) {
        System.out.print(new String(new char[nvl]).replace("\0", " ") + value + "\n");
        for (Component sub : children) {
            // 4. Delegation and polymorphism
            sub.traverse(nvl + 2);
        }
    }
}
