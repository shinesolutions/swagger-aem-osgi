(ns adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-float
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def config-node-property-float-data
  {
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   (ds/opt :is_set) boolean?
   (ds/opt :type) int?
   (ds/opt :value) float?
   (ds/opt :description) string?
   })

(def config-node-property-float-spec
  (ds/spec
    {:name ::config-node-property-float
     :spec config-node-property-float-data}))
