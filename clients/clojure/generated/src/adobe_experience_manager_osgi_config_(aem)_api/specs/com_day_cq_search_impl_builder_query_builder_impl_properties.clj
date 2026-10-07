(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-search-impl-builder-query-builder-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-search-impl-builder-query-builder-impl-properties-data
  {
   (ds/opt :excerptproperties) config-node-property-array-spec
   (ds/opt :cachemaxentries) config-node-property-integer-spec
   (ds/opt :cacheentrylifetime) config-node-property-integer-spec
   (ds/opt :xpathunion) config-node-property-boolean-spec
   })

(def com-day-cq-search-impl-builder-query-builder-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-search-impl-builder-query-builder-impl-properties
     :spec com-day-cq-search-impl-builder-query-builder-impl-properties-data}))
