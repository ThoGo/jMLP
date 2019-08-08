package jMLP;

import static org.junit.jupiter.api.Assertions.*;

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

}
