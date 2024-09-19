class Artist {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInformation() {
        System.out.println("Artist: " + name);
    }
}

class Artwork {
    private String title;
    private int year;
    private Artist artist;

    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public Artwork(String title, int year) {
        this(title, year, new Artist("Unknown Artist"));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void displayInformation() {
        System.out.println("Artwork: " + title + " (" + year + ") by " + artist.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist("Famous Artist");

        Artwork artwork1 = new Artwork("Masterpiece", 2023, artist);
        Artwork artwork2 = new Artwork("Second Artwork", 2022);

        // Encapsulation
        artwork2.setTitle("Updated Title");
        artwork2.setYear(2024);

        // Print details
        artwork1.displayInformation();
        artwork2.displayInformation();

        // shallow copy 
        artist.setName("Modified Artist");
        artwork1.displayInformation();
        artwork2.displayInformation();
    }
}