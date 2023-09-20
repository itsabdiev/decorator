public class Model {
    private final View view;
    private ReversePolishNotation reversePolishNotation;
    public Model(View view) {
        this.view = view;
        reversePolishNotation = new ReversePolishNotation();
        System.out.println("Model is ready for transfer and modification");    
    }

    public void setSMth(String h) {
        view.setLabel(reversePolishNotation.getRandom(h));
    }
}