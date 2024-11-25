package Tido;
public class TestPassingParameter {

    public static void main(String[] args) { // Fixed typo in 'args'
        // Create DigitalVideoDisc objects
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Swap DVD objects
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Change the title of jungleDVD
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle DVD title after change: " + jungleDVD.getTitle());
    }

    // Method to swap the references of two objects
    // public static void swap(Object obj1, Object obj2) {
    //     Object tmp = obj1;
    //     obj1 = obj2;
    //     obj2 = tmp;
    // }

    // Correct swap method that swaps titles of two DigitalVideoDisc objects
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        // Swap the titles of the two objects
        String temp = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(temp);
    }

    // Method to change the title of a DigitalVideoDisc object
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle); 
    }
}
