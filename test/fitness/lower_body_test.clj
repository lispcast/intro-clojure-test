(ns fitness.lower-body-test
  (:require
   [fitness.lower-body :refer :all]
   [clojure.test       :refer :all]))

(deftest squat-test
  (let [results (squats 50)]
    (is (= 50 (:actual-reps results)))
    (is (<= (:seconds results) 60))))

(deftest frog-leap-test
  (let [results (frog-leaps 5)]
    (is (= 5 (:actual-reps results)))
    (is (<= (:seconds results) 30))))
