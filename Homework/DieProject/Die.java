// For this project I got some help from my classmate Philip and ChatGPT to help format the display method to make sure it is displaying the die in the correct way. 

public class Die {

    private int value;

    // Default constructor
    public Die() {
        value = 1;
    }

    // Overloaded constructor
    public Die(int initialValue) {
        if (initialValue >= 1 && initialValue <= 6) {
            value = initialValue;
        } else {
            value = 1;
        }
    }

    // Roll the die
    public void roll() {
        value = (int)(Math.random() * 6) + 1;
    }

    // Get the current value
    public int getValue() {
        return value;
    }

    // Display die
    public void display() {

        switch(value) {

            case 1:
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   0   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;

            case 2:
                System.out.println("+-------+");
                System.out.println("| 0     |");
                System.out.println("|       |");
                System.out.println("|     0 |");
                System.out.println("+-------+");
                break;

            case 3:
                System.out.println("+-------+");
                System.out.println("| 0     |");
                System.out.println("|   0   |");
                System.out.println("|     0 |");
                System.out.println("+-------+");
                break;

            case 4:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("|       |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;

            case 5:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("|   0   |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;

            case 6:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("| 0   0 |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;
        }
    }
}


