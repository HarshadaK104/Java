package Day7.lambda;

public class TestChef {
    public static void main(String[] args) {
        Recipe recipe=new Chef();

        Recipe InstantRecipe = new Recipe() {
            public void Chef(){
                System.out.println("Instant Recipe");
            }
        };//this is a class
        //it has no name (anonymous)
        //it is an anonymous inner class as it is inside TestChef
        //most important line is 9 because it is the actual logic

       //Recipe lambdaRecipe = ()-> System.out.println("Instant Recipe");
    }
}
