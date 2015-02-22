(ns fitness.upper-body
  (:import
   [fitness.safety UnsafeResistanceException]))

(defn push-ups
  "Do up to target-reps push ups.

  Returns a results map containing:
    :exercise     keyword, :push-ups
    :target-reps  integer, reps attempted
    :actual-reps  integer, reps performed
    :seconds      number,  time in seconds to perform the reps"
  [target-reps]
  (let [actual-reps (min target-reps 75)]
    {:exercise :push-ups
     :target-reps target-reps
     :actual-reps actual-reps
     :seconds (* 1.5 actual-reps)}))

(defn pull-ups
  "Do up to target-reps pull ups.

  Returns a results map containing:
    :exercise     keyword, :pull-ups
    :target-reps  integer, reps attempted
    :actual-reps  integer, reps performed
    :seconds      number,  time in seconds to perform the reps"
  [target-reps]
  (let [actual-reps (min target-reps 20)]
    {:exercise :pull-ups
     :target-reps target-reps
     :actual-reps actual-reps
     :seconds (* 2.0 actual-reps)}))

(defn bench-presses
  "Do up to target-reps bench presses with the weight specified in pounds.

  Returns a results map containing:
    :exercise    keyword, :bench-presses
    :target-reps integer, reps attempted
    :actual-reps integer, reps performed
    :pounds      number,  weight on barbell
    :seconds     number,  time in seconds to perform the reps"
  [pounds target-reps]
  (when (>= pounds 200)
    (throw (UnsafeResistanceException.
            "bench press"
            (str pounds " lbs"))))
  (let [actual-reps (min target-reps (long (/ 5000 pounds)))]
    {:exercise :bench-presses
     :target-reps target-reps
     :actual-reps actual-reps
     :pounds pounds
     :seconds (* 3 actual-reps)}))
