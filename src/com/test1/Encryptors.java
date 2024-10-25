package com.test1;

public class Encryptors {
	private String encryptionMethod;
	private String keypairGen;
	private String initializeKey;
	private String generateKeyPair;
	private String getPublic;
	private String cipherObject;
	private String cipherInstance;
	private Integer cipherMode;
	private String doFinal;
	private String badPaddingException;
	private String signature;

	public Encryptors() {

	}

	public Encryptors(String encryptionMethod, String keypairGen, String initializeKey, String generateKeyPair,
			String getPublic, String cipherObject, String cipherInstance, Integer cipherMode, String doFinal,
			String badPaddingException, String signature) {
		super();
		this.encryptionMethod = encryptionMethod;
		this.keypairGen = keypairGen;
		this.initializeKey = initializeKey;
		this.generateKeyPair = generateKeyPair;
		this.getPublic = getPublic;
		this.cipherObject = cipherObject;
		this.cipherInstance = cipherInstance;
		this.cipherMode = cipherMode;
		this.doFinal = doFinal;
		this.badPaddingException = badPaddingException;
		this.signature = signature;
	}

	public String getEncryptionMethod() {
		return encryptionMethod;
	}

	public void setEncryptionMethod(String encryptionMethod) {
		this.encryptionMethod = encryptionMethod;
	}

	public String getKeypairGen() {
		return keypairGen;
	}

	public void setKeypairGen(String keypairGen) {
		this.keypairGen = keypairGen;
	}

	public String getInitializeKey() {
		return initializeKey;
	}

	public void setInitializeKey(String initializeKey) {
		this.initializeKey = initializeKey;
	}

	public String getGenerateKeyPair() {
		return generateKeyPair;
	}

	public void setGenerateKeyPair(String generateKeyPair) {
		this.generateKeyPair = generateKeyPair;
	}

	public String getGetPublic() {
		return getPublic;
	}

	public void setGetPublic(String getPublic) {
		this.getPublic = getPublic;
	}

	public String getCipherObject() {
		return cipherObject;
	}

	public void setCipherObject(String cipherObject) {
		this.cipherObject = cipherObject;
	}

	public String getCipherInstance() {
		return cipherInstance;
	}

	public void setCipherInstance(String cipherInstance) {
		this.cipherInstance = cipherInstance;
	}

	public Integer getCipherMode() {
		return cipherMode;
	}

	public void setCipherMode(Integer cipherMode) {
		this.cipherMode = cipherMode;
	}

	public String getDoFinal() {
		return doFinal;
	}

	public void setDoFinal(String doFinal) {
		this.doFinal = doFinal;
	}

	public String getBadPaddingException() {
		return badPaddingException;
	}

	public void setBadPaddingException(String badPaddingException) {
		this.badPaddingException = badPaddingException;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}
