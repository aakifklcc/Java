package MVP_Ex_1;

public class Presenter {
    private View view;
    private Model model;
    
    public Presenter(View view, Model model){
        this.view=view;
        this.model=model;
       
    }
    public void login(String password) {
        String result="Incorrect Password";
        
        if(model.getPassword().equals(password)) {
            result="Correct Password";
            view.hideInputField();
        }
        //here we are updating view in the Present
        view.updateStatusLabel(result);
    }
    
}
