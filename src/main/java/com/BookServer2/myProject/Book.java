package com.BookServer2.myProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="books")
public class Book {

    private @Id @GeneratedValue Long id;
    private String imageUrl;
    private String title;
    private String text;
    private int price;
    private String link;

    public Book(String title, String text, int price, String link, String imageUrl) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.text = text;
        this.price = price;
        this.link = link;
    }

    public Book() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price &&
                Objects.equals(id, book.id) &&
                Objects.equals(imageUrl, book.imageUrl) &&
                Objects.equals(title, book.title) &&
                Objects.equals(text, book.text) &&
                Objects.equals(link, book.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageUrl, title, text, price, link);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", price=" + price +
                ", link='" + link + '\'' +
                '}';
    }
}
