package com.test1;

public class JasyptEncryptor {
	private String encryptionMethod;
	private String jasyptModes;
	private String appConfigForStarted;
	private String algorithm;
	private String keyObtentionIterations;
	private String providerName;
	private String saltGeneratorClassName;
	private Integer configCode;
	private String outputType;
	private String simpleStringMode;
	private String normalAssertions;

	public JasyptEncryptor() {

	}

	public JasyptEncryptor(String encryptionMethod, String jasyptModes, String appConfigForStarted, String algorithm,
			String keyObtentionIterations, String providerName, String saltGeneratorClassName, Integer configCode,
			String outputType, String simpleStringMode, String normalAssertions) {
		super();
		this.encryptionMethod = encryptionMethod;
		this.jasyptModes = jasyptModes;
		this.appConfigForStarted = appConfigForStarted;
		this.algorithm = algorithm;
		this.keyObtentionIterations = keyObtentionIterations;
		this.providerName = providerName;
		this.saltGeneratorClassName = saltGeneratorClassName;
		this.configCode = configCode;
		this.outputType = outputType;
		this.simpleStringMode = simpleStringMode;
		this.normalAssertions = normalAssertions;
	}

	public String getEncryptionMethod() {
		return encryptionMethod;
	}

	public void setEncryptionMethod(String encryptionMethod) {
		this.encryptionMethod = encryptionMethod;
	}

	public String getJasyptModes() {
		return jasyptModes;
	}

	public void setJasyptModes(String jasyptModes) {
		this.jasyptModes = jasyptModes;
	}

	public String getAppConfigForStarted() {
		return appConfigForStarted;
	}

	public void setAppConfigForStarted(String appConfigForStarted) {
		this.appConfigForStarted = appConfigForStarted;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getKeyObtentionIterations() {
		return keyObtentionIterations;
	}

	public void setKeyObtentionIterations(String keyObtentionIterations) {
		this.keyObtentionIterations = keyObtentionIterations;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getSaltGeneratorClassName() {
		return saltGeneratorClassName;
	}

	public void setSaltGeneratorClassName(String saltGeneratorClassName) {
		this.saltGeneratorClassName = saltGeneratorClassName;
	}

	public Integer getConfigCode() {
		return configCode;
	}

	public void setConfigCode(Integer configCode) {
		this.configCode = configCode;
	}

	public String getOutputType() {
		return outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

	public String getSimpleStringMode() {
		return simpleStringMode;
	}

	public void setSimpleStringMode(String simpleStringMode) {
		this.simpleStringMode = simpleStringMode;
	}

	public String getNormalAssertions() {
		return normalAssertions;
	}

	public void setNormalAssertions(String normalAssertions) {
		this.normalAssertions = normalAssertions;
	}

}
