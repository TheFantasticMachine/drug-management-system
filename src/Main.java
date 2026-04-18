//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // on boot ask load login
        // from login get usr name and load file in res/users
        // if pass matches input user is now selected
        // go into res/patients and load files with patients
        // all patients with the user as their doctor are loaded
        // from there I don't know ...

        // make a window
        GUI gui = new GUI();
        gui.createLogin();
    }
}