package centruAdoptie;

import centruAdoptie.servicii.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = UserService.getInstance();

        ///Afiseaza istoricul adoptiilor
        for(int i=0; i < userService.istoricAdoptii.size(); i++) {
            userService.printForm(userService.istoricAdoptii.get(i));
        }

    }
}
