public class Activity {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.setName("aso nya");
        puppy.bark();

        puppy.addPuppy("kes");
        puppy.addPuppy("beb");

        System.out.println("Number of puppies: " + puppy.showNumOfPuppies()); 
        puppy.showPuppies(); 
    }
}