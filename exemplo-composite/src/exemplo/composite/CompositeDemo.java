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
public class CompositeDemo {
    public static void main( String[] args ) {
        
    	Component first  = new Composite( 1 );
        Component second = new Composite( 2 );
        Component third  = new Row( 3 );
        Component fourth = new Column( 4 );
        Component fifth  = new Row( 5 );
        
        try {
			first.add(second);
			first.add(third);
			second.add(fourth);
			second.add(fifth);
		} catch (AddToLeafException e) {
			e.printStackTrace();
		}
        
        first.traverse();
    }
}
