package jMLP;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class NeuronTest
{
	@Test
	void test()
	{
		Neuron neuron;
		
		neuron = new Neuron(1);
		neuron.printWeights();
		assertEquals( 1, neuron.getInputSize());
		
		neuron = new Neuron(15);
		neuron.printWeights();
		assertEquals( 15, neuron.getInputSize());
	}
	
	@Test
	void testFeedForward()
	{
		Neuron neuron;
		
		//trivialer Test: Neuron mit einem Eingang
		// und der input ist 1 => output == weight (wenn die Transferfunktion "id()" ist.)
		neuron = new Neuron(1);
		neuron.printWeights();
		Float weight = neuron.getInputWeights().get(0);

		List<Float> inputs = Arrays.asList(1F);
		Float output = neuron.feedForward(inputs);
		
		assertEquals( weight, output);
	}

}
