(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory-properties-data
  {
   (ds/opt :cqanalyticsadapterfactorycontextstores) config-node-property-array-spec
   })

(def com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory-properties-spec
  (ds/spec
    {:name ::com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory-properties
     :spec com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory-properties-data}))
