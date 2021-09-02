package com.example;

import java.io.IOException;

public class ProjectRunner {
    public static void main(String args[]) throws IOException {
      char[] _buf = new char[100];
      int _pos = 0;

      while (_buf[_pos] != '"') {
        final char curr = _buf[_pos];
        _pos++;

        switch (_buf[_pos]) {
          case '\"':
            _pos++;
            // fall through
          case '\'':
            _pos++;
            break;
        }

    }
}}
