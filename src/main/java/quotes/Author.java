package quotes;

public class Author {
String author;
String text;
String likes;

    public Author(String author, String text, String likes){
        this.author = author;
        this.text = text;
        this.likes = likes;

    }
   public String toString(){

        return this.author + " " + this.text + " " + this.likes;
   }


}
