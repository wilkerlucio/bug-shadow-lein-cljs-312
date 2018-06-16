(ns my-app.core
  (:require [clojure.test.check.generators]
            [cljs.spec.alpha :as s]))

; the timeout is just for it to fail "after" reloading, not during it
(js/setTimeout
  (fn []
    (js/console.log (s/gen nil?)))
  1000)
