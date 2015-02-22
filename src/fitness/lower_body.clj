(ns fitness.lower-body
  (:import
   [fitness.safety UnsafeResistanceException]))

(defn squats
  "Do up to target-reps squats.

  Returns a results map containing:
    :exercise     keyword, :squats
    :target-reps  integer, reps attempted
    :actual-reps  integer, reps performed
    :seconds      number,  time in seconds to perform the reps"
  [target-reps]
  (let [actual-reps (min target-reps 100)]
    {:exercise :squats
     :target-reps target-reps
     :actual-reps actual-reps
     :seconds (* 1.0 actual-reps)}))

(defn frog-leaps
  "Do up to target-reps frog leaps.

  Returns a results map containing:
    :exercise     keyword, :frog-leaps
    :target-reps  integer, reps attempted
    :actual-reps  integer, reps performed
    :seconds      number,  time in seconds to perform the reps"
  [target-reps]
  (let [actual-reps (min target-reps 10)]
    {:target-reps target-reps
     :actual-reps actual-reps
     :seconds (* 4.0 actual-reps)}))

(defn weighted-squats
  "Do up to target-reps weighted squats with the weight specified in pounds.

  Returns a results map containing:
    :exercise    keyword, :weighted-squats
    :target-reps integer, reps attempted
    :actual-reps integer, reps performed
    :pounds      number,  weight on barbell
    :seconds     number,  time in seconds to perform the reps"
  [pounds target-reps]
  (when (>= pounds 300)
    (throw (UnsafeResistanceException.
            "weighted squats"
            (str pounds " lbs"))))
  (let [actual-reps (min target-reps (long (/ 2000 pounds)))]
    {:target-reps target-reps
     :actual-reps actual-reps
     :pounds pounds
     :seconds (* 4.0 actual-reps)}))
