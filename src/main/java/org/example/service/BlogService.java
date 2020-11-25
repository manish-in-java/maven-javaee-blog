package org.example.service;

import org.example.domain.BlogEntry;
import org.example.repository.BlogEntryRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class BlogService
{
  @Inject
  private BlogEntryRepository repository;

  public void delete(final BlogEntry entry)
  {
    repository.delete(entry);
  }

  public List<BlogEntry> getAll()
  {
    return repository.findAll()
                     .stream()
                     .sorted((first, second) -> second.getCreated().compareTo(first.getCreated()))
                     .collect(Collectors.toList());
  }

  public BlogEntry save(final BlogEntry entry)
  {
    return repository.save(entry);
  }
}
