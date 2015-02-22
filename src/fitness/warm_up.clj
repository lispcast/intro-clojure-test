(ns fitness.warm-up)

(defn jogging
  "Jog in place for the given number of seconds."
  [seconds]
  (println "Jogging for" seconds "seconds.")
  {:exercise :jogging
   :seconds seconds})

(defn cross-toe-touches
  "Perform cross toe touches for the given number of reps."
  [reps]
  (println "Cross toe touches:" reps "on the left and" reps "on the right.")
  {:exercise :cross-toe-touches
   :reps reps
   :seconds (* 2 reps)})

(defn jumping-jacks
  "Perform jumping jacks for the given number of reps."
  [reps]
  (println "Doing" reps "jumping jacks.")
  {:exercise :jumping-jacks
   :reps reps
   :seconds (* 1.7 reps)})

(defn knee-raises
  "Perform knee-raises for the given number of reps."
  [reps]
  (println "Doing" reps "knee raises.")
  {:exercise :knee-raises
   :reps reps
   :seconds (* 0.7 reps)})

(defn high-kicks
  "Perform high-kicks for the given number of reps."
  [reps]
  (println "Doing" reps "high kicks.")
  {:exercise :high-kicks
   :reps reps
   :seconds (* 0.5 reps)})

(defn situps
  "Perform situps for the given number of reps."
  [reps]
  (println "Doing" reps "situps.")
  {:exercise :situps
   :reps reps
   :seconds (* 1.9 reps)})





