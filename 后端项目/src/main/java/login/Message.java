package login;

/**
 * ClassName: Message
 * <p>
 * Description:
 *
 * @Author lps
 * @Create 2024/6/9 10:20
 * @Version 1.0
 */
public class Message {
    //    flag 表示密码或用户名存在
//    mess:表示要返回的信息
    public boolean flag;
    public String mess;


    public Message() {
    }


    public Message(boolean flag, String mess) {
        this.flag = flag;
        this.mess = mess;
    }


    public boolean isFlag() {
        return flag;
    }


    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMess() {
        return mess;
    }


    public void setMess(String mess) {
        this.mess = mess;
    }
}
