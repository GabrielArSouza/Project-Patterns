/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.composite;

/**
 * Copy from: https://sourcemaking.com/design_patterns/composite/java/3
 * @author gabriel
 */
public abstract class Composite implements Component {
     // 3. Couple to interface
    private Component[] children = new Component[9];
    private int total = 0;
    private int value;
    public Composite(int val) {
        value = val;
    }

    // 3. Couple to interface
    public void add(Component c) {
        children[total++] = c;
    }

    @Override
    public void traverse() {
        System.out.print(value + "  ");
        for (int i=0; i < total; i++) {
            // 4. Delegation and polymorphism
            children[i].traverse();
        }
    }
}
