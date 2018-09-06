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
public abstract class Primitive implements Component {

    private int value;

    public Primitive(int val) {
        value = val;
    }
    
    @Override
    public void traverse() {
    	System.out.print(" " + value + "\n" );
    }
    
    @Override
    public void add(Component c) throws AddToLeafException {
		throw new AddToLeafException();
	}
    
}
