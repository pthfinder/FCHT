public class prowess {
    public static void main(String [] args) {
        for (int prowessValue = 0; prowessValue <= 100; prowessValue++) {
            if ( prowessValue == 0 ) {
                System.out.println("if = { \n limit = {\n prowess > " + prowessValue + "\n } \n add = " + prowessValue + "\n }");
            }
            else {
                System.out.println("else_if = { \n limit = {\n prowess > " + prowessValue + "\n } \n add = " + prowessValue + "\n }");

            }
        }
    }
}
