package org.example.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class BlogEntry
{
  @NotNull
  @Size(min = 10, max = 40)
  private String author;
  @NotNull
  @Size(max = 50000, min = 10)
  private String content;
  @NotNull
  @Size(max = 100, min = 10)
  private String title;
  private Date   created = new Date();
  private Long   id;

  public String getAuthor()
  {
    return author;
  }

  public String getContent()
  {
    return content;
  }

  public Date getCreated()
  {
    return created;
  }

  public Long getId()
  {
    return id;
  }

  public String getTitle()
  {
    return title;
  }

  public void setAuthor(String author)
  {
    this.author = author;
  }

  public void setContent(String content)
  {
    this.content = content;
  }

  public void setCreated(Date created)
  {
    this.created = created;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }
}
