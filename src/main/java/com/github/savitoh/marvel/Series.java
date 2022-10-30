package com.github.savitoh.marvel;

import com.github.savitoh.Content;
import com.github.savitoh.ContentType;

public record Series(String title, String urlImage, String rating, String year) implements Content {
  @Override
  public ContentType contentType() {
    return ContentType.SERIES;
  }
}
