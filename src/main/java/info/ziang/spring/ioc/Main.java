package info.ziang.spring.ioc;

public class Main {
    public static void main(String[] args){
        String resp = new Principal().notifyTeacher();
        System.out.println(resp);
    }
}
