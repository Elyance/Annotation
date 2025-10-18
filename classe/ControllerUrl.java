package classe;

import annotation.*;

public class ControllerUrl {
    @Url("/test")
    public void sayHello() {
        System.out.println("C'est un test de salutation");
    }

    public void sayHi() {}
}
