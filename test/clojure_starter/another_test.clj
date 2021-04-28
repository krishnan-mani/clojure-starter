(ns clojure-starter.another-test
  (:require [clojure.test :refer :all]
            [clojure-starter.core :refer :all]))


(deftest test-foo
  (is (= true (foo)))
  )