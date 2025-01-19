package Task_19thJan;

public class InDec2 {
    public static void main(String[] args) {
        int a= 20;

        System.out.println(--a + a++ + a--);
//19+20+19
        // first --a = 19
        // now 19 becomes a++ that is 20
        // then after 20 is dec by a__ is 19
        // so 19+20+19= 58

    }
}
