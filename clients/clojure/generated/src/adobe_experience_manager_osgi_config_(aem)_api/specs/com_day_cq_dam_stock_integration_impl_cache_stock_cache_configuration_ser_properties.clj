(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-properties-data
  {
   (ds/opt :getCacheExpirationUnit) config-node-property-drop-down-spec
   (ds/opt :getCacheExpirationValue) config-node-property-integer-spec
   })

(def com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-properties
     :spec com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-properties-data}))
