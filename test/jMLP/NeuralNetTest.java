package jMLP;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class NeuralNetTest
{

	@Test
	void test()
	{
		NeuralNet nn;
		List<Float> inputs;
		List<Float> outputs;

		nn= new NeuralNet(1, 1);
		inputs = Arrays.asList(1F);
		outputs = nn.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(1, outputs.size());
		
		nn= new NeuralNet(1, 1, 1);
		inputs = Arrays.asList(1F);
		outputs = nn.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(1, outputs.size());
		
		nn= new NeuralNet(1, 5, 10, 1);
		inputs = Arrays.asList(1F);
		outputs = nn.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(1, outputs.size());
		
		nn= new NeuralNet(2,2);
		inputs = Arrays.asList(1F, 1F);
		outputs = nn.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(2, outputs.size());
		
		nn= new NeuralNet(2, 7, 5);
		inputs = Arrays.asList(1F, 1F);
		outputs = nn.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(5, outputs.size());
		
		nn= new NeuralNet(1, 2, 3, 4);
		inputs = Arrays.asList(1F);
		outputs = nn.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(4, outputs.size());
	}

}
