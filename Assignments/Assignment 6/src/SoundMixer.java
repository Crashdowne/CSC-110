/*
 * Bryan Kesteloo
 * V00718963
 * July 21, 2014
 * Sound Mixer
 * Models a sound wave using arrays. The arrays are modified according to different methods.
 * Frequency arrays have their volume adjusted and scaled, added together, reversed, spliced and have their frequency increased or decreased.
 */

import java.security.InvalidParameterException;
import java.util.*;


public class SoundMixer {

	public static void main(String[] args)
	{
		
		double[] generatedFreqs1 = soundGenerator(20);
		
		double[] generatedFreqs2 = soundGenerator(20);
		//Frequency array 1
		System.out.println("Generated frequency array 1:\n"+Arrays.toString(generatedFreqs1));
		//Frequency array 2
		System.out.println("\nGenerated frequency array 2:\n"+Arrays.toString(generatedFreqs1));
		adjustVolume(generatedFreqs1, 0, 20, 5.22);
		add(generatedFreqs1, generatedFreqs2);
		reverse(generatedFreqs2);
		splice(generatedFreqs1, 0, 25, generatedFreqs2, 0);
		adjustFrequency(generatedFreqs1, 0.7);
	}
	
	//Generates an array of length x made up of random numbers between -1,1
	public static double[] soundGenerator(int length)
	{
		double[] randFreqs = new double[length];
		for (int i=0; i<randFreqs.length; i++)
		{
			Random r = new Random();
			double randomValue = -1 + (1 - -1) * r.nextDouble();
			double number = Math.round(randomValue*100.0)/100.0;
			randFreqs[i] = number;
		}
		return randFreqs;
	}
	
	//Adjusts the volume of the frequency array by a factor of x
	public static void adjustVolume(double[] samples, int startIndex, int endIndex, double factor)
	{
		double highestPosValue = -1;
		double highestNegValue = 1;
		int i = startIndex;
		
		System.out.println("\nArray to have its volume increased:\n"+Arrays.toString(samples));
		//Adjust the volume from the start index to the end index
		//Finds the highest positive and negative values
		while(i!=endIndex)
		{
			samples[i] = samples[i]*factor;
			
			if(samples[i]>highestPosValue)
			{
				highestPosValue=samples[i];
			}
			else if(samples[i]<highestNegValue)
			{
				highestNegValue=samples[i];
			}
			i++;
		}
		System.out.println("\nArray with its volume increased:\n"+Arrays.toString(samples));
		//Scales all of the frequencies proportionally to the highest pos/neg numbers
		for(int j=0; j<samples.length; j++)
		{
			if(j<=endIndex)
			{
				if(samples[j]>0)
				{
					double scaled = samples[j]/highestPosValue;
					samples[j]=scaled;
				}
				else if(samples[j]<0)
				{
					double scaled = (samples[j]/highestNegValue)*-1;
					samples[j]=scaled;
				}
			}
		}
		System.out.println("\nArray with its volume increased and scaled:\n"+Arrays.toString(samples));
	}
	
	//Adds two frequency arrays together
	public static void add(double[] samples1, double[] samples2)
	{
		boolean outOfRange=false;
		
		System.out.println("\nArrays to be spliced:\n"+Arrays.toString(samples1));
		System.out.println(Arrays.toString(samples2));
		//Checks to see which array is larger, the adds the values together
		int i = 0;
		while(i<(samples1.length-1))
		{
			double value = samples1[i];
			
			if(i < (samples2.length-1))
			{
				value += samples2[i];
			}
			
			//Checks to see if the addition causes a number to be higher than 1,-1
			samples1[i] = value;
			
			if(value > 1.0 || value < -1.0)
			{
				outOfRange = true;
			}
			
			i++;
		}
		//If there is a number greater than 1,-1, it calls adjustvolume to normalize the frequencies
		if(outOfRange)
		{
			adjustVolume(samples1, 0, samples1.length, 1);
		}
		
		System.out.println("\nSpliced array:\n"+Arrays.toString(samples1));
	}
	
	//Reverses a frequency array
	public static void reverse(double[] samples)
	{
		double[] reversedSamples = new double[samples.length];
		System.out.println("\nArray to be reversed:\n"+Arrays.toString(samples));
		//Copies the values of samples into the back of the reversed array
		for(int i=0; i<samples.length; i++)
		{
			reversedSamples[(samples.length-1)-i]=samples[i];
		}
		System.out.println("\nReversed array:\n"+Arrays.toString(reversedSamples));
	}

	//Splices an array into another
	public static void splice(double[] source, int sourceStart, int sourceStop, double[] destination, int destStart)
	{
		System.out.println("\nSplice Source Array:\n"+Arrays.toString(source));
		int pos=sourceStart;
		int destPos=destStart;
		
		//Splices the arrays, stops the splice before it goes out of bounds on the destination array
		while(pos<sourceStop && destPos<destination.length)
		{
			destination[destPos]=source[pos];
			pos++;
			destPos++;
		}
		System.out.println("\nSpliced Array:\n"+Arrays.toString(destination));
	}
	
	//Adjusts the frequency of the array by causing the array to grow or shrink
	public static double[] adjustFrequency(double[] samples, double factor)
	{
		//Gives an error if the factor is <0
		if(factor <= 0)
		{
			throw new InvalidParameterException();
		}
		System.out.println("\nArray to be adjusted:\n"+Arrays.toString(samples));
		//forces newSamples.length to act as a double in order to get a more accurate result from the division, and sets the length to emulate
		//an increase / decrease in frequency (a factor of 0.5 will decrease the frequency by 2)
		double newSampleLength = (double)samples.length / factor;
		//Forces newWamples.length back into an int for the creation of the array
		double[] newSamples = new double[(int)newSampleLength];
		double samplesIndex=0;
		
		//Populates the newSamples frequency array with values
		for(int i=0; i<newSamples.length; i++)
		{
			//Because samplesIndex and factor are doubles, it forces the samplesIndex into an int so it can properly select a location in the array
			newSamples[i] = samples[(int)samplesIndex];
			samplesIndex = samplesIndex+factor;
		}
		System.out.println("\nFrequency adjusted array:\n"+Arrays.toString(newSamples));
		return newSamples;
	}
}
