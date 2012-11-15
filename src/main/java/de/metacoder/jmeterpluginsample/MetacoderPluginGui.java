package de.metacoder.jmeterpluginsample;

import javax.swing.JTextField;

import org.apache.jmeter.samplers.gui.AbstractSamplerGui;
import org.apache.jmeter.testelement.TestElement;

public class MetacoderPluginGui extends AbstractSamplerGui {

	private static final long serialVersionUID = 1L;
	private JTextField sleepTimeInputField;

	public static final String SLEEPTIME = "sleepTime";
	
	public TestElement createTestElement() {
		MetacoderSampler metacoderSampler = new MetacoderSampler();
		modifyTestElement(metacoderSampler);
		return metacoderSampler;
	}

	public String getLabelResource() {
		return "MetacoderSampler";
	}

	public void modifyTestElement(TestElement sampler) {
		System.out.println("Modify test element called - set gui values to sampler / test element here?");
        sampler.clear();
        sampler.setProperty(SLEEPTIME, sleepTimeInputField.getText());
        this.configureTestElement(sampler);
	}
	
	public MetacoderPluginGui() {
		sleepTimeInputField = new JTextField();
		this.add(sleepTimeInputField);
	}
	
	@Override
	public void configure(TestElement element) {
		super.configure(element);
		sleepTimeInputField.setText(element.getPropertyAsString(SLEEPTIME));
	}

}
