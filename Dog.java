package corgiAndDog;
public class Dog {
	
    // instance variables
    private String type;
    private String breed;
    private String name; 
    private String topTrick;

    // constructor - type breed and name
    public Dog(String dogType, String dogBreed, String dogName) { 
    	type = dogType;
		breed = dogBreed;
		name = dogName;
        
     }



    // method
    public void setTopTrick(String trick) { 
        topTrick = trick;
     }


    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }
	    
	    
	    
	    
	    
    
}