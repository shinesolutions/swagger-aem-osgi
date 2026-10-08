(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-reporting-impl-r-log-analyzer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-reporting-impl-r-log-analyzer-properties-data
  {
   (ds/opt :requestlogoutput) config-node-property-string-spec
   })

(def com-day-cq-reporting-impl-r-log-analyzer-properties-spec
  (ds/spec
    {:name ::com-day-cq-reporting-impl-r-log-analyzer-properties
     :spec com-day-cq-reporting-impl-r-log-analyzer-properties-data}))
