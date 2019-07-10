package info.ziang.spring.ioc;

public class EmailNotice implements NoticeInterface {

    private Teacher teacher;
    private String message;

    public void sendMessage() {
        teacher.setClassTime(message + "_邮件发送");
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
