(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-impl-store-properties-change-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-impl-store-properties-change-listener-properties-data
  {
   (ds/opt :cqstorelisteneradditionalStorePaths) config-node-property-array-spec
   })

(def com-day-cq-analytics-impl-store-properties-change-listener-properties-spec
  (ds/spec
    {:name ::com-day-cq-analytics-impl-store-properties-change-listener-properties
     :spec com-day-cq-analytics-impl-store-properties-change-listener-properties-data}))
