(ns fitness.upper-body-test
  (:require
   [fitness.upper-body :refer :all]
   [clojure.test       :refer :all]))

(deftest push-up-test
  (let [results (push-ups 50)]
    (is (= 50 (:actual-reps results)))
    (is (<= (:seconds results) (* 4 60)))))

(deftest pull-up-test
  (let [results (pull-ups 10)]
    (is (= 10 (:actual-reps results)))
    (is (<= (:seconds results) 60))))

(deftest bench-press-too-heavy-test
  (is (thrown? fitness.safety.UnsafeResistanceException
               (bench-presses 300 10))))

(deftest bench-press-test
  (let [results (bench-presses 100 20)]
    (is (= 20 (:actual-reps results)))
    (is (<= (:seconds results) 60))))
