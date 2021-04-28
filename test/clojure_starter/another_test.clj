(ns clojure-starter.another-test
  (:require [clojure.test :refer :all]
            [clojure-starter.core :refer :all]))


(deftest test-foo
  (is (= true (foo)))
  )

(deftest ^:kaocha/skip example-skipped-test
  (is (= 11 (+ 1 2)))
  )

