package com.example.iterators;

import com.example.profile.Profile;

public interface ProfileIterator {
  boolean hasNext();

  Profile getNext();

  void reset();
}
