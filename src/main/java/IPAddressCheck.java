import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IPAddressCheck {

    public static boolean checkIpAdd(String ipAddr) {
        String[] arr = new String[4];
        if (ipAddr.contains(".")) {
            arr = ipAddr.split("[.]");
        }
        else {
            return false;
        }
        if (arr.length > 0) {
            boolean isNumRange = false;
            for (int i = 0; i < arr.length; i++) {
                if (parseInt(arr[i]) >= 0 && parseInt(arr[i]) < 255) {
                    isNumRange = true;
                } else {
                    isNumRange = false;
                }
            }
            if (arr.length == 4 && isNumRange) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkIpAdd(str));
    }
}
