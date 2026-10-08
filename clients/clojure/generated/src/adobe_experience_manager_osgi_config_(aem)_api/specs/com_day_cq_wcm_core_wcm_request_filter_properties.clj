(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-wcm-request-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-wcm-request-filter-properties-data
  {
   (ds/opt :wcmfiltermode) config-node-property-drop-down-spec
   })

(def com-day-cq-wcm-core-wcm-request-filter-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-wcm-request-filter-properties
     :spec com-day-cq-wcm-core-wcm-request-filter-properties-data}))
