(ns bad-with-patterns.core)

;; Should FAIL because it doesn't have a docstring
(defn foo
  [x]
  (println x "Hello, World!"))
