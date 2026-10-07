(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-reporting-impl-cache-cache-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-reporting-impl-cache-cache-impl-properties-data
  {
   (ds/opt :repcacheenable) config-node-property-boolean-spec
   (ds/opt :repcachettl) config-node-property-integer-spec
   (ds/opt :repcachemax) config-node-property-integer-spec
   })

(def com-day-cq-reporting-impl-cache-cache-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-reporting-impl-cache-cache-impl-properties
     :spec com-day-cq-reporting-impl-cache-cache-impl-properties-data}))
