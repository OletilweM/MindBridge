package MindBridge.java;

public class Listener extends User{ //inheriting from the users class (every method it has)

    public Listener(String username) {
        super (username); //Calling the user's constuctor so we can reuse it
    }
    public String responds(String message) {
        return "Thank you for sharing that. I'm here to listen 💞";
    }
}
