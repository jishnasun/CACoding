package use_case.clear_users;

// TODO Complete me


import use_case.signup.SignupOutputBoundary;
import use_case.signup.SignupOutputData;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    private final ClearOutputBoundary clearOutput;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                            ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearDataAccessInterface;
        this.clearOutput = clearOutputBoundary;
    }

    @Override
    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.userList());
        clearOutput.prepareUserList(clearOutputData);
        userDataAccessObject.clearUsers();
    }
}
