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

(deftest weighted-squat-too-heavy-test
  (is (thrown? fitness.safety.UnsafeResistanceException
               (weighted-squats 500 10))))

(deftest weighted-squat-test
  (let [results (weighted-squats 100 20)]
    (is (= 20 (:actual-reps results)))
    (is (<= (:seconds results) 120))))
