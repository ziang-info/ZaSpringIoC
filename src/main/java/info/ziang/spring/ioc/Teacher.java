package info.ziang.spring.ioc;

public class Teacher {
    private String name;
    private String classTime;

    public String getNotice() {
        return "在" + classTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }
}
