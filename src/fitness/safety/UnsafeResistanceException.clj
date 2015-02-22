(ns fitness.safety.UnsafeResistanceException
  (:gen-class
   :extends RuntimeException
   :init init
   :constructors {[String String] [String]}))

(defn -init [exercise resistance]
  [[(str resistance " is an unsafe resistance for " exercise)] []])


