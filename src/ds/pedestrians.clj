(ns ds.pedestrians
    (:use overtone.live))

(definst pedestrians [] (pan2 (* (sin-osc 2500) (lf-pulse 5) 0.2)))