package org.example.repository;

import org.example.domain.BlogEntry;

import javax.inject.Singleton;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
public class BlogEntryRepository
{
  private static final Map<Long, BlogEntry> STORE = new ConcurrentHashMap<>();

  public void delete(final BlogEntry entry)
  {
    if (entry != null && STORE.containsValue(entry))
    {
      STORE.remove(entry.getId());
    }
  }

  public Collection<BlogEntry> findAll()
  {
    return STORE.values();
  }

  public BlogEntry save(final BlogEntry entry)
  {
    if (entry != null)
    {
      if (entry.getId() == null)
      {
        entry.setId((long) (STORE.size() + 1));
      }

      if (!STORE.containsKey(entry.getId()))
      {
        STORE.put(entry.getId(), entry);
      }
    }

    return entry;
  }
}
