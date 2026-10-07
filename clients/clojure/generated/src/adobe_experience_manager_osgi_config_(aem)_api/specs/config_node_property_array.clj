(ns adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def config-node-property-array-data
  {
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   (ds/opt :is_set) boolean?
   (ds/opt :type) int?
   (ds/opt :values) (s/coll-of string?)
   (ds/opt :description) string?
   })

(def config-node-property-array-spec
  (ds/spec
    {:name ::config-node-property-array
     :spec config-node-property-array-data}))
