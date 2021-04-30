(ns clojure-starter.core-test
  (:require [clojure.test :refer :all]
            [clojure-starter.core :refer :all]))


(defn describe-string-run [coll]
  (let [char (first coll)
        count (count coll)]
    {:char (str char) :count count}))

(defn collect-runs [x]
  (let [string-split-by-same-character (partition-by identity x)]
    (map describe-string-run string-split-by-same-character)))

(deftest describe-run-test
  (is (= {:char "T" :count 3} (describe-string-run [\T \T \T])))
  )

(deftest collect-runs-test
  (is (= [{:char "z" :count 2} {:char "T" :count 3} {:char "y" :count 1}] (collect-runs "zzTTTy")))
  (is (= [{:char "T" :count 3}] (collect-runs "TTT")))
  )


;(deftest a-test
;  (testing "FIXME! I fail!"
;    (is (= 0 1))))
;
;
;(deftest ^:kaocha/pending another-test
;  (is (= 73 (my-add 1 2))))