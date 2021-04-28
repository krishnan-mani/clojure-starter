(ns clojure-starter.another-test
  (:require [clojure.test :refer :all]
            [clojure-starter.core :refer :all]))


(deftest test-foo
  (is (= true (foo)))
  )

(deftest ^:skip example-skipped-test
  (is (= 47 (+ 1 2)))
  )

; change the meta to ":only" to focus on the test below
(deftest ^:not-only example-focus-test
  (is (= 21 (+ 7 3)))
  )