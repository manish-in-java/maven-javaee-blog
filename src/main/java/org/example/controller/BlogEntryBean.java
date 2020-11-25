package org.example.controller;

import org.example.domain.BlogEntry;
import org.example.service.BlogService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "blogEntryBean")
@RequestScoped
public class BlogEntryBean
{
  @Inject
  private BlogService service;

  private BlogEntry blogEntry = new BlogEntry();

  public void delete(final BlogEntry entry)
  {
    service.delete(entry);
  }

  public BlogEntry getBlogEntry()
  {
    return blogEntry;
  }

  public List<BlogEntry> list()
  {
    return service.getAll();
  }

  public String save()
  {
    service.save(blogEntry);

    return "success";
  }

  public void setBlogEntry(final BlogEntry blogEntry)
  {
    this.blogEntry = blogEntry;
  }
}
