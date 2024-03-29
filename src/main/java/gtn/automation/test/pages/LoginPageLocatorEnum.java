package gtn.automation.test.pages;

public enum LoginPageLocatorEnum {
	
	tf_UserInputs("//label[text()='<>']/following::input[1]"),
	btn_Submit("//button");
	
	private final String text;
	
	public String getText() {
		return text;
	}

	private LoginPageLocatorEnum(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
}
