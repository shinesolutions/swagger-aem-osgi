(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-queries-impl-hc-query-health-check-metrics-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-queries-impl-hc-query-health-check-metrics-properties-data
  {
   (ds/opt :getPeriod) config-node-property-integer-spec
   })

(def com-adobe-granite-queries-impl-hc-query-health-check-metrics-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-queries-impl-hc-query-health-check-metrics-properties
     :spec com-adobe-granite-queries-impl-hc-query-health-check-metrics-properties-data}))
