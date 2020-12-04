import java.util.*;


class Scratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        ArrayList<String> traits = new ArrayList<String>(Arrays.asList(str.split(" ")));


        for (int i = 0; i < traits.size(); i++) {
            System.out.println("name = { \n\ttrigger = {  \n\t\t has_variable = " + traits.get(i) + " \n\t} \n\ttext = tournament.08.option." + i + "\n}");
        }
    }
}
