package com.fredericoffs.dslearn.services.exceptions;

public class ForbiddenException extends RuntimeException {

  public ForbiddenException(String message) {
    super(message);
  }
}
