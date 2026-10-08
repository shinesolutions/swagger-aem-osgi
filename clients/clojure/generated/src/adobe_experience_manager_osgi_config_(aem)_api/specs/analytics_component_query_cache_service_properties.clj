(ns adobe-experience-manager-osgi-config-(aem)-api.specs.analytics-component-query-cache-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def analytics-component-query-cache-service-properties-data
  {
   (ds/opt :cqanalyticscomponentquerycachesize) config-node-property-integer-spec
   })

(def analytics-component-query-cache-service-properties-spec
  (ds/spec
    {:name ::analytics-component-query-cache-service-properties
     :spec analytics-component-query-cache-service-properties-data}))
