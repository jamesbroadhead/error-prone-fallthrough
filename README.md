# error-prone-fallthrough

This repo exists to demo the problem described in https://github.com/google/error-prone/issues/2546

## Repro

To repro, run

```bazelisk build //...```

To repro with bazel 5:

```mv -i .bazelversion5 .bazelversion```
