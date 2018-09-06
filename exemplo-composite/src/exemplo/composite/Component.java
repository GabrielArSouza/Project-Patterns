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
public interface Component {
	
    public void traverse();
    
    public void traverse(int nvl);
    
    public void add(Component c) throws AddToLeafException;

}
