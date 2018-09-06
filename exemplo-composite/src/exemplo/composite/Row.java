/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.composite;

/**
 * Adapted from: https://sourcemaking.com/design_patterns/composite/java/3
 * @author gabriel & victor
 */
public class Row extends Primitive{
	
    public Row(int val) {
        super(val);
    }

    @Override
    public void traverse() {
    	traverse(0);
    }
    
    @Override
    public void traverse(int nvl) {
        System.out.print(new String(new char[nvl]).replace("\0", " ") + "Row");
        super.traverse();
    }

}
