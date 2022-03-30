package ejb;

import javax.ejb.Stateless;

@Stateless(name = "SessionB")
public class SessionBBean {
    public SessionBBean() {
    }
    public String Salute(){
        return "Hello World";
    }
}
