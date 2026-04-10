// I used ChatGPT to help me understand how to override the toString() and equals() methods and make sure they were implemented correctly.

public class BaseballCard {
    String name; // the name of the player on the card.
    int year;    // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Baseball Card [Player: " + name + ", Year: " + year + "]";
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // same object
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // not same type
        }

        BaseballCard other = (BaseballCard) obj;

        return this.year == other.year && this.name.equals(other.name);
    }
}