(ns fitness.cardio
  (:import
   [fitness.safety UnsafeResistanceException]))

(defn running
  "Run up to given miles.

  Returns a results map containing:
    :exercise      keyword, :running
    :target-miles  number,  distance attempted
    :actual-miles  number,  distance run
    :seconds       number,  time in seconds to run"
  [target-miles]
  (let [actual-miles (min target-miles 10)]
    {:exercise :running
     :target-miles target-miles
     :actual-miles actual-miles
     :seconds (* actual-miles 60 9)}))

(defn spinning
  "Stationary bike for given number of seconds with bike dialed to
  given resistance.

  Returns a results map containing:
    :exercise        keyword, :spinning
    :resistance      integer, resistance setting (1-10)
    :target-seconds  number,  time attempted
    :actual-seconds  number,  time performed"
  [resistance target-seconds]
  (when (>= resistance 9)
    (throw (UnsafeResistanceException.
            "stationary biking"
            (str "Level " resistance " resistance"))))
  (let [actual-seconds (min target-seconds (/ (* 60 120) resistance))]
    {:exercise :spinning
     :resistance resistance
     :target-seconds target-seconds
     :actual-seconds actual-seconds}))
