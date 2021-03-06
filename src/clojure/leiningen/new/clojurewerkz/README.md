# Project Name

{{name}} is ....


## Project Goals

TODO

## Project Maturity

{{name}} is *very* young.


## Artifacts

... artifacts are [released to Clojars](https://clojars.org/{{fq-name}}). If you are using Maven, add the following repository
definition to your `pom.xml`:

``` xml
<repository>
  <id>clojars.org</id>
  <url>http://clojars.org/repo</url>
</repository>
```

### The Most Recent Release

With Leiningen:

    [{{fq-name}} "1.0.0-alpha1"]


With Maven:

    <dependency>
      <groupId>clojurewerkz</groupId>
      <artifactId>{{name}}</artifactId>
      <version>1.0.0-alpha1</version>
    </dependency>


## Documentation & Examples

Our documentation site is not yet live, sorry.


## Community & Support

[{{Name}} has a mailing
list](https://groups.google.com/forum/#!forum/clojure-{{name}}). Feel
free to join it and ask any questions you may have.

To subscribe for announcements of releases, important changes and so on, please follow [@ClojureWerkz](https://twitter.com/clojurewerkz) on Twitter.



## Supported Clojure versions

{{name}} is built from the ground up for Clojure {{clojure-version}} and up.


## Continuous Integration Status

[![Continuous Integration status](https://secure.travis-ci.org/clojurewerkz/{{name}}.png)](http://travis-ci.org/clojurewerkz/{{name}})


## {{name}} Is a ClojureWerkz Project

{{name}} is part of the [group of Clojure libraries known as ClojureWerkz](http://clojurewerkz.org), together with

 * [Langohr](http://clojurerabbitmq.info)
 * [Elastisch](http://clojureelasticsearch.info)
 * [Neocons](http://clojureneo4j.info)
 * [Monger](http://clojuremongodb.info)  
 * [Cassaforte](http://clojurecassandra.info)

and several others.


## Development

{{name}} uses [Leiningen
2](https://github.com/technomancy/leiningen/blob/master/doc/TUTORIAL.md). Make
sure you have it installed and then run tests against supported
Clojure versions using

    lein all test

Then create a branch and make your changes on it. Once you are done
with your changes and all tests pass, submit a pull request on GitHub.



## License

Copyright (C) {{year}} Michael S. Klishin, Alex Petrov, and The ClojureWerkz Team.

Double licensed under the [Eclipse Public License](http://www.eclipse.org/legal/epl-v10.html) (the same as Clojure) or
the [Apache Public License 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
