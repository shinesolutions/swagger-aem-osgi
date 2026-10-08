(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-resourcestatus-impl-composite-status-type-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-resourcestatus-impl-composite-status-type-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :types) config-node-property-array-spec
   })

(def com-adobe-granite-resourcestatus-impl-composite-status-type-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-resourcestatus-impl-composite-status-type-properties
     :spec com-adobe-granite-resourcestatus-impl-composite-status-type-properties-data}))
