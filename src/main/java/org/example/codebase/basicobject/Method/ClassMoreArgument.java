package org.example.codebase.basicobject.Method;

import java.util.Arrays;

public class ClassMoreArgument {
    public static void main(String[] args) {
        MoreArg m = new MoreArg();
        m.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun");
        m.setNames2(new String[]{"Xiao Ming", "Xiao Hong"});
        m.getNames();
    }
}

class MoreArg {
    private String[] names;

    public void setNames(String... names) {
        this.names = names;
    }

    public void setNames2(String[] names) {
        this.names = names;
    }

    public void getNames() {
        System.out.println(Arrays.toString(this.names));
    }
}
