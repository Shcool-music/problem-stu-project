package principle.singlereponsibility;

public class Method {

    /*同时更新了userName和地址*/
    private void updateUserInfo(String userName, String address) {
        userName = "problem";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "problem";
    }


    /*单一起来*/
    private void updateUserName(String userName) {
        userName = "problem";
    }

    /*单一起来*/
    private void updateUserAddress(String address) {
        address = "beijing";
    }

    /*明显是2个职责，就需要将something1与something2拆开*/
    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }
        userName = "problem";
        address = "beijing";
    }
}
