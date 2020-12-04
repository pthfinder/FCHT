import java.util.*;


class Scratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        ArrayList<String> traits = new ArrayList<String>(Arrays.asList(str.split(" ")));



        for(int i =0; i<traits.size();i++) {

            if (i == 0) {
                System.out.println("\nif = { \n\tlimit = { \n\t\tAND = { \n\t\t\thas_trait = " + traits.get(i) + " \n\t\t\tscope:tournament_friend = { \n\t\t\t\thas_trait = " + traits.get(i) + "   \n\t\t\t}\n\t\t}\n\t}");
                System.out.println("\tset_variable = {\n\t\tname = "+ traits.get(i) +"\n\t\tvalue = yes\n\t}\n}");
            }
            else {
                System.out.println("\nelse_if = { \n\tlimit = { \n\t\tAND = { \n\t\t\thas_trait = " + traits.get(i) + " \n\t\t\tscope:tournament_friend = { \n\t\t\t\thas_trait = " + traits.get(i) + "   \n\t\t\t}\n\t\t}\n\t}");
                System.out.println("\tset_variable = {\n\t\tname = "+ traits.get(i) +"\n\t\tvalue = yes\n\t}\n}");


            }

        }
    }
}