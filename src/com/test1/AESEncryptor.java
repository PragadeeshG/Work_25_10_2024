package com.test1;

public class AESEncryptor {
	private String encryptionMethod;
	private String aesModes;
	private boolean recommendedMode;
	private Integer electronicBookCode;
	private String cipherBlockChaining;
	private String cipherFeedback;
	private Integer outputFeedback;
	private Integer counter;
	private String counterMode;
	private Integer galiosMode;
	private String cipherSize;
	private String aesParams;
	private String inputData;

	public AESEncryptor() {

	}

	public AESEncryptor(String encryptionMethod, String aesModes, boolean recommendedMode, Integer electronicBookCode,
			String cipherBlockChaining, String cipherFeedback, Integer outputFeedback, Integer counter,
			String counterMode, Integer galiosMode, String cipherSize, String aesParams, String inputData) {
		super();
		this.encryptionMethod = encryptionMethod;
		this.aesModes = aesModes;
		this.recommendedMode = recommendedMode;
		this.electronicBookCode = electronicBookCode;
		this.cipherBlockChaining = cipherBlockChaining;
		this.cipherFeedback = cipherFeedback;
		this.outputFeedback = outputFeedback;
		this.counter = counter;
		this.counterMode = counterMode;
		this.galiosMode = galiosMode;
		this.cipherSize = cipherSize;
		this.aesParams = aesParams;
		this.inputData = inputData;
	}

	public String getEncryptionMethod() {
		return encryptionMethod;
	}

	public void setEncryptionMethod(String encryptionMethod) {
		this.encryptionMethod = encryptionMethod;
	}

	public String getAesModes() {
		return aesModes;
	}

	public void setAesModes(String aesModes) {
		this.aesModes = aesModes;
	}

	public boolean isRecommendedMode() {
		return recommendedMode;
	}

	public void setRecommendedMode(boolean recommendedMode) {
		this.recommendedMode = recommendedMode;
	}

	public Integer getElectronicBookCode() {
		return electronicBookCode;
	}

	public void setElectronicBookCode(Integer electronicBookCode) {
		this.electronicBookCode = electronicBookCode;
	}

	public String getCipherBlockChaining() {
		return cipherBlockChaining;
	}

	public void setCipherBlockChaining(String cipherBlockChaining) {
		this.cipherBlockChaining = cipherBlockChaining;
	}

	public String getCipherFeedback() {
		return cipherFeedback;
	}

	public void setCipherFeedback(String cipherFeedback) {
		this.cipherFeedback = cipherFeedback;
	}

	public Integer getOutputFeedback() {
		return outputFeedback;
	}

	public void setOutputFeedback(Integer outputFeedback) {
		this.outputFeedback = outputFeedback;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public String getCounterMode() {
		return counterMode;
	}

	public void setCounterMode(String counterMode) {
		this.counterMode = counterMode;
	}

	public Integer getGaliosMode() {
		return galiosMode;
	}

	public void setGaliosMode(Integer galiosMode) {
		this.galiosMode = galiosMode;
	}

	public String getCipherSize() {
		return cipherSize;
	}

	public void setCipherSize(String cipherSize) {
		this.cipherSize = cipherSize;
	}

	public String getAesParams() {
		return aesParams;
	}

	public void setAesParams(String aesParams) {
		this.aesParams = aesParams;
	}

	public String getInputData() {
		return inputData;
	}

	public void setInputData(String inputData) {
		this.inputData = inputData;
	}

}
