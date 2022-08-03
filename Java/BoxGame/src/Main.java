public class Main {
    public static void main(String[] args)
    {
        Fighter f1 = new Fighter("Conor",5,100,95,25);
        Fighter f2 = new Fighter("Ali",3,100,95,15);
        Match m1= new Match(100,80,f1,f2);
        m1.run();
    }
}
