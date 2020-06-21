(ns gen_art.core
  (:required [quil.core :as q]))

(defn vec*
  ([a] a)
  ([a b] (map * a b))
  ([a b & more] (reduce vec* (vec* a b) more)))

(defn vec-
  ([a] a)
  ([a b] (map - a b))
  ([a b & more] (reduce vec- (vec- a b) more)))
