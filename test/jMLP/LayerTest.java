package jMLP;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class LayerTest 
{

	@Test
	void testFeedForward()
	{
		Layer layer;
		List<Float> inputs;
		List<Float> outputs;
		
		layer = new Layer(1,1);
		inputs = Arrays.asList(1F);
		outputs = layer.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(1, outputs.size());

		layer = new Layer(10,1);
		inputs = Arrays.asList(1F);
		outputs = layer.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(10, outputs.size());
		
		layer = new Layer(10,10);
		inputs = Arrays.asList(1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F);
		outputs = layer.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(10, outputs.size());
		
		layer = new Layer(1,10);
		inputs = Arrays.asList(1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F);
		outputs = layer.feedForward(inputs);
		System.out.println(outputs);
		assertEquals(1, outputs.size());
		
	}

}
