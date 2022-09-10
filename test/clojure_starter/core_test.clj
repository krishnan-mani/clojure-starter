(ns clojure-starter.core-test
  (:require [clojure.test :refer :all]
            [clojure-starter.core :refer :all]))

(deftest my-add-test
  (testing "basic test"
    (is (= 5 (my-add 2 3)))))

(deftest parameterised-tests-with-are
  (are [expected x y]
    (= expected (my-add x y))
      10, 4 6
      13, 6 7))

(deftest ^:skip example-skipped-test
  (is (= 3 (+ 1 2))))

; change the meta to ":only" to focus on the test below
(deftest ^:not-only example-focus-test
         (is (= 10 (+ 7 3))))
