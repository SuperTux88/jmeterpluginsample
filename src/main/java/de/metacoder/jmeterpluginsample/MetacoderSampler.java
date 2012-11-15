package de.metacoder.jmeterpluginsample;

import org.apache.jmeter.samplers.AbstractSampler;
import org.apache.jmeter.samplers.Entry;
import org.apache.jmeter.samplers.SampleResult;

public class MetacoderSampler extends AbstractSampler {

	private static final long serialVersionUID = 1L;

	public SampleResult sample(Entry sampleEntry) {
		SampleResult sampleResult = new SampleResult();
		sampleResult.sampleStart();
		sampleResult.latencyEnd();
		
		try { Thread.sleep(getPropertyAsInt(MetacoderPluginGui.SLEEPTIME)); } catch(InterruptedException e) { } ;
		
		sampleResult.sampleEnd();
		sampleResult.setSuccessful(true);
		return sampleResult;
	}

}
