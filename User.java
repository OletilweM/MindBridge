public class User {
    private String username; //Stores your name
    private boolean requestListener; //tracks if the listener wants to connect to a human

    public User(String username){ //Runs when we create a new user
        this.username = username; //Sets their name
        this.requestListener = false; //The default is false cause getting a listener is a choice
    }
    public String getUsername() {
        return username; //enables other classes to ask for the user name
    }
    public boolean isRequestListener () {
        return requestListener; //Checks if the user has requested a listener
    }
    public void requestListener () { //A setter style method
        this.requestListener = true; //changes the state if yes
    }
    public void cancelsListenerRequest() {
        this.requestListener = false; //returns it to defalut if the user was canceled
    }
}