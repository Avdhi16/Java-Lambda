package lambda;

public class Practice {
    Practical lambda1 = (String s) -> s.length();
    System.out.print(lambda1.lenofString("avdhi"));
}

interface Practical {
    int lenofString(String s);
}
