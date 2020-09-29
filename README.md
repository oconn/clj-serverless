[![Clojars Project](https://img.shields.io/clojars/v/dehli/serverless.svg)](https://clojars.org/dehli/serverless)

# Serverless

AWS serverless helpers targeting Cljs.

## Developing the Library

### Commands

```
clj -A:build (--watch)   # Build code
clj -A:test              # Run tests
```

### Publishing version

```
./scripts/pack_and_deploy
```

> Note: `settings.xml` must be set in ~/.m2/settings.xml

```xml
<settings>
  <servers>
    <server>
      <id>clojars</id>
      <username>username</username>
      <password>password</password>
    </server>
  </servers>
</settings>
```
