(ns fitness.upper-body-test
  (:require
   [fitness.upper-body :refer :all]
   [clojure.test       :refer :all]))

(deftest push-up-test
  (is (= 200 (:actual-reps (push-ups 50)))))
