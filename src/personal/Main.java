package personal;

import personal.controllers.UserController;
import personal.model.*;
import personal.views.ViewUser;
import personal.utils.Validate;



public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
