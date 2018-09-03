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
public class Column extends Composite {
    public Column(int val) {
        super(val);
    }

    @Override
    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}
