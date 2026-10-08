(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-wcm-debug-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-wcm-debug-filter-properties-data
  {
   (ds/opt :wcmdbgfilterenabled) config-node-property-boolean-spec
   (ds/opt :wcmdbgfilterjspDebug) config-node-property-boolean-spec
   })

(def com-day-cq-wcm-core-impl-wcm-debug-filter-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-wcm-debug-filter-properties
     :spec com-day-cq-wcm-core-impl-wcm-debug-filter-properties-data}))
