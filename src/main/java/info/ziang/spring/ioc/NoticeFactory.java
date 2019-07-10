package info.ziang.spring.ioc;

public class NoticeFactory {

    public static NoticeInterface getNotice(String noticeType) {

        if (noticeType == null) {
            return null;
        }

        if (noticeType.equalsIgnoreCase("phone")) {
            return new PhoneNotice();
        } else if (noticeType.equalsIgnoreCase("email")) {
            return new EmailNotice();
        } else {
            return null;
        }

    }
}
