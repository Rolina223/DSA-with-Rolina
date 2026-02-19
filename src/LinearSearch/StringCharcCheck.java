package LinearSearch;

public class StringCharcCheck {

    public static void main(String[] args) {

        String s = "Rolina";
        char target = 'i';
        System.out.println(checkChar(s,target));

    }

    static boolean checkChar(String str, char ch)
    {

        if(str == null)
        {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }

}
