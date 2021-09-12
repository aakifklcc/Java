
package MVP_Ex_1;

import javax.swing.SwingUtilities;

public class MVP_Demo {
    
    // We assembleall the components of our MVP, Presenter and Model
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            View view =new View();
            view.setPresenter(new Presenter(view, new Model()));
        });
        
        
    }
}
