(defproject {{fq-name}} "{{project-version}}"
  :description "FIXME"
  :dependencies [[org.clojure/clojure "{{clojure-version}}"]
                 [clojurewerkz/support "1.1.0"]]
  :profiles {:1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :master {:dependencies [[org.clojure/clojure "1.9.0-master-SNAPSHOT"]]}
             :dev {:resource-paths ["test/resources"]
                   :plugins [[codox "0.10.0"]]
                   :codox {:source-paths ["src/clojure"]}}}
  :aliases {"all" ["with-profile" "dev:dev,1.8:dev,master"]}
  :repositories {"sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :javac-options      ["-target" "1.6" "-source" "1.6"]
  :jvm-opts           ["-Dfile.encoding=utf-8"]
  :source-paths       ["src/clojure"]
  :java-source-paths  ["src/java"])
