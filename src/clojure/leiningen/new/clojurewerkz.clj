(ns leiningen.new.clojurewerkz
  "A Leiningen template for new ClojureWerkz project"
  (:require [leiningen.new.templates :refer [->files name-to-path sanitize-ns renderer year]]))

(def ^{:const true}
  project-version "1.0.0-SNAPSHOT")

(def render (renderer "clojurewerkz"))


;; main template entry point
(defn clojurewerkz
  "A Leiningen template for new ClojureWerkz project"
  [^String short-name & features]
  (let [fq-name (str "clojurewerkz/" short-name)
        data {:name            short-name
              :fq-name         fq-name
              :project-version project-version
              :clojure-version "1.7.0"
              :fs-path         (name-to-path fq-name)
              :sanitized-ns    (sanitize-ns fq-name)
              :year            (year)}]
    (->files data
             ["README.md"                        (render "README.md" data)]
             ["project.clj"                      (render "project.clj" data)]
             [".travis.yml"                      (render "travis.yml" {})]
             ["src/clojure/{{fs-path}}/core.clj" (render "core.clj" data)]
             ["test/{{fs-path}}/core_test.clj"   (render "test.clj" data)])))
