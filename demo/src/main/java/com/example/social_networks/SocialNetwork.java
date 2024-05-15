package com.example.social_networks;

import com.example.iterators.ProfileIterator;

public interface SocialNetwork {
  ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
