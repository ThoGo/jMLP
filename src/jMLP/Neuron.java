package jMLP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Neuron
{
//	private List<Float> inputs = new ArrayList<>();
	private List<Float> inputWeights = new ArrayList<>();
	
//	private float bias;
//	private float biasWeights;
	
	/**
	 * Constructor containing the number of inputs	
	 */
	public Neuron( int numberOfInputs )
	{
		super();
		
		Random rand = new Random();
		for ( int i=0; i<numberOfInputs; i++ )
		{
			inputWeights.add( rand.nextFloat() );
		}
	}


//	public void adapt()
//	{
//		
//	}


	public void printWeights()
	{
		String outStr = "weights: ";
		
		for (Float weight : inputWeights)
		{
			outStr += weight.toString() + " * ";
		}
		
		System.out.println( outStr.substring(0, outStr.length()-3) );
	}


	public int getInputSize()
	{
		// Anzahl der inputs = Anzahl der weights,
		// weights sind aber auf jeden Fall initialisiert
		return this.inputWeights.size();
	}

}
