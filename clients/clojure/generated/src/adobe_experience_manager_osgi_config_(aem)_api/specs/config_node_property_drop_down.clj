(ns adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down-type :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def config-node-property-drop-down-data
  {
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   (ds/opt :is_set) boolean?
   (ds/opt :type) config-node-property-drop-down-type-spec
   (ds/opt :value) any-type-spec
   (ds/opt :description) string?
   })

(def config-node-property-drop-down-spec
  (ds/spec
    {:name ::config-node-property-drop-down
     :spec config-node-property-drop-down-data}))
