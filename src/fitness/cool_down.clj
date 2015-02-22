(ns fitness.cool-down)

(defn hurdler-stretch
  "Perform hurdler stretch for the given number of seconds on each
  leg."
  [seconds]
  (println "Doing hurdler stretch for" seconds "seconds on each leg.")
  {:exercise :hurdler-stretch
   :seconds (* 2 seconds)})

(defn arm-stretch
  "Perform arm stretch for the given number of seconds on each
  arm."
  [seconds]
  (println "Doing arm stretch for" seconds "seconds on each arm.")
  {:exercise :arm-stretch
   :seconds (* 2 seconds)})

(defn middle-split
  "Perform middle split for the given number of seconds."
  [seconds]
  (println "Doing a middle split for" seconds "seconds.")
  {:exercise :middle-split
   :seconds seconds})

(defn forward-bend
  "Perform forward bend for the given number of seconds."
  [seconds]
  (println "Doing a forward bend for" seconds "seconds.")
  {:exercise :forward-bend
   :seconds seconds})

(defn twist
  "Perform a twist for the given number of seconds on each side."
  [seconds]
  (println "Doing a twist for" seconds "seconds.")
  {:exercise :twist
   :seconds (* 2 seconds)})




