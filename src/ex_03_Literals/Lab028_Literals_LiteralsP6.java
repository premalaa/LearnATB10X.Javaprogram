package ex_03_Literals;

public class Lab028_Literals_LiteralsP6 {
    public static void main(String[] args) {

        char carriage_return = '\r';
        char new_line = '\n';
        char tab_line = '\t';
                char back_space = '\b';
        System.out.println("Premala" + new_line + "Anand");
        System.out.println("premala" + tab_line + "anand");
        System.out.println("premala" + back_space + "anand");
        System.out.println("premala" +  carriage_return + "anand");
        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (india, jap, china) - Rupees - ₹
        char rupees = '₹';
        System.out.println("pramod has "+rupees+10);
    }
}
