package Day5.object;

public class TestBox {
    public static void main(String[] args){
        Box box = new Box();
        System.out.println(box);

        Box box2 = box;
        box2.setLength(15);
        System.out.println(box2.getLength());
        System.out.println(box.getLength());
        System.out.println(box==box2);//hashcode of both the objects are same
        //object equality, is about if address same or not
        //object equivalence, is about if the values are same or not, equivalence is subjective

    }
}
