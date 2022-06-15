import java.io.Serializable;


public class Quote implements Serializable {
    private int id;
    private String content;
    private int authorId;
    private String author;

    public Quote(){}

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}