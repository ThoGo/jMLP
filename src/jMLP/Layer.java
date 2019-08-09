package jMLP;

import java.util.ArrayList;
import java.util.List;

public class Layer
{
	private List<Neuron> neurons = new ArrayList<>();

	
	//Anzahl der Inputs == Anzahl der Ausgaenge des vorigen Layers
	public Layer( int numberOfNeurons, int numberOfInputs )
	{
		super();
		
		for ( int i=0; i<numberOfNeurons; i++ )
		{
			this.neurons.add( new Neuron(numberOfInputs) );
		}

	}
	
	
	public List<Float> feedForward(List<Float> inputs)
	{
		List<Float> outputs = new ArrayList<>();
		
		for(Neuron n : this.neurons)
		{
			outputs.add(n.feedForward(inputs));
		}
		
		return outputs;
	}

}
