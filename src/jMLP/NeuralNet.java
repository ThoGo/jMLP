package jMLP;

import java.util.ArrayList;
import java.util.List;

/**
 * a multi-layer-perceptron
 *
 */
public class NeuralNet
{
	private List<Layer> layers = new ArrayList<>();

	public NeuralNet( int ... layers )
	{
		super();
		
		for ( int i=1; i<layers.length; i++ )
		{
			this.layers.add( new Layer(layers[i], layers[i-1]) );
		}

	}
	
	
	public List<Float> feedForward(List<Float> inputs)
	{
		// next Layer's input is last Layer's output
		List<Float> nextInputs = inputs;
		
		for(Layer layer : this.layers)
		{
			nextInputs = layer.feedForward(nextInputs);
		}
		
		//last Layer's output (still named nextInput) is the Networks output
		return nextInputs;
	}
}
