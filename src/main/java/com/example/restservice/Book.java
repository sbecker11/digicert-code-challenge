package com.example.restservice;

public class Book {
  long id;
  String authorFirstName;
  String authorLastName;
  String title;
  String publishDate;

  public Book() {
  }

  public Book(long id, String authorFirstName, String authorLastName, String title, String publishDate) {
    this.id = id;
    this.authorFirstName = authorFirstName;
    this.authorLastName = authorLastName;
    this.title = title;
    this.publishDate = publishDate;
  }

  public long getId() {
    return this.id;
  }


  public String getAuthorFirstName() {
    return this.authorFirstName;
  }


  public String getAuthorLastName() {
    return this.authorLastName;
  }


  public String getTitle() {
    return this.title;
  }


  public String getPublishDate() {
    return this.publishDate;
  }


  // @Override
  //   public boolean equals(Object o) {
  //       if (o == this)
  //           return true;
  //       if (!(o instanceof Book)) {
  //           return false;
  //       }
  //       Book book = (Book) o;
  //       return (this.id == book.id) && 
  //         Objects.equals(this.authorFirstName, book.authorFirstName) && 
  //         Objects.equals(this.authorLastName, book.authorLastName) && 
  //         Objects.equals(this.title, book.title) && 
  //         Objects.equals(this.publishDate, book.publishDate);
  // }

  // @Override
  // public int hashCode() {
  //   return Objects.hash(id, authorFirstName, authorLastName, title, publishDate);
  // }

  @Override
  public String toString() {
    return "{" +
      " id='" + this.getId() + "'" +
      ", authorFirstName='" + this.getAuthorFirstName() + "'" +
      ", authorLastName='" + this.getAuthorLastName() + "'" +
      ", title='" + this.getTitle() + "'" +
      ", publishDate='" + this.getPublishDate() + "'" +
      "}";
  }

}
