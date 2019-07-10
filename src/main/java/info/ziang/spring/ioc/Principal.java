package info.ziang.spring.ioc;


public class Principal {

    /**
     * 校长类，负责装配产品，关联教师类和通知类
     */
    public String notifyTeacher() {

        StringBuilder notifyReturn = new StringBuilder();

        EmailNotice emailNotice = (EmailNotice) NoticeFactory.getNotice("email");

        PhoneNotice phoneNotice = (PhoneNotice) NoticeFactory.getNotice("phone");

        // zhang
        Teacher teacher = new Teacher();
        teacher.setName("张老师");

        emailNotice.setTeacher(teacher);
        emailNotice.setMessage("8:45上语文课");
        emailNotice.sendMessage();
        notifyReturn.append(teacher.getNotice() + "\n");

        // wang
        Teacher teacherWang = new Teacher();
        teacherWang.setName("王老师");

        phoneNotice.setTeacher(teacherWang);
        phoneNotice.setMessage("9:50上数学课");
        phoneNotice.sendMessage();
        notifyReturn.append(teacherWang.getNotice() + "\n");

        // lee
        Teacher teacherLee = new Teacher();
        teacherLee.setName("李老师");

        phoneNotice.setTeacher(teacherLee);
        phoneNotice.setMessage("11:00上音乐课");
        phoneNotice.sendMessage();
        notifyReturn.append(teacherLee.getNotice() + "\n");

        return notifyReturn.toString();
    }
}
