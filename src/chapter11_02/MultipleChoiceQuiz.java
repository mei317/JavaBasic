package chapter11_02;

public class MultipleChoiceQuiz extends Quiz {
	
	private String[] answers;

	public MultipleChoiceQuiz(String main, String[] answers) {
		super(main);
		this.answers = answers;
	}
	
	@Override
	public void displayHeader() {
		System.out.println("「次の問いについて、正しいものを４つの中から選びなさい」");
	}
	
	@Override
	public void displayMain() {
		super.displayMain();
		
		for(int i = 0; i < this.answers.length; i++) {
			System.out.println((i + 1) + ":" + answers[i]);
		}
	}
	
}
