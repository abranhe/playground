

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 1 && args[0].equals("test")) {
            System.out.println("Project 3");
        } else {
            CreativeScene.launch(CreativeScene.class);
        }
    }
}