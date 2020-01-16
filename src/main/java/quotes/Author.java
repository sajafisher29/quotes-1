package quotes;

public class Author {
String name;
String body;
String likes;

    public Author(String name, String body, String likes){
        this.name = name;
        this.body = body;
        this.likes = likes;

    }
   public String toString(){

        return this.name;
   }


}
