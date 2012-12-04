package com.example;


/**
 *
 */
public class Decision {

	public Decision(final ChoiceSender choiceSender) {
		this.choiceSender = choiceSender;
	}

	/**
	 * TODO refactor
	 */
	public void decide(final String input) {
		final Choice choice = new Choice(input);
		logSentTo(input, choice);
		this.choiceSender.send(choice);

	}

	/**
	 * Do the logging part. 
	 * It will print the  {@code choice} value and, given the {@code input}, whose the {@link Choice} is intended to.
	 * @param input
	 * @param choice
	 */
	private void logSentTo(final String input, final Choice choice) {
		StringBuilder builder = new StringBuilder().append(choice.getValue()).append(" for ");
		switch (input) {
		case "choice1":
		case "choice4":
			builder.append("roger");
			break;
		case "choice2":
			builder.append("robert");
			break;
		case "choice3":
			builder.append("patrick");
			break;
		case "choice5":
			builder.append("cléo");
			break;
		default:
			builder.append("anyone");
			break;
		}
		System.out.println(builder);
	}

	private final ChoiceSender choiceSender;

}
