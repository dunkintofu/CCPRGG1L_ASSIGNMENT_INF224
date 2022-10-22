public class Assignment2 {
    public static void main(String[] args) throws Exception {
    int count1 = 0;
    while (count1 !=3){
    System.out.println("MARIELLE KYLA");
    count1 ++;
    }
    int count2 = 0;
    do {
        System.out.println("VILLENA");
        count2 ++;
    } while (count2 != 4);
    for (int count3 = 0; count3  != 5;  count3 ++) {
    System.out.println("VILLENA");
    }
    char [] myFirstName = {'M', 'A', 'R', 'I', 'E', 'L', 'L', 'E', 'K', 'Y', 'L", 'A'};
    for (int i = 0; i < myFirstName.length; i++){
    System.out.println(myFirstName[i]);
    }  
    for (int i = myFirstName.length - 1; i >= 0; i--) {
    System.out.println(myFirstName[i]);
        }
    }
}
