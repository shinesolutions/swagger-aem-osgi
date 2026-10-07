(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-history-impl-history-request-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-history-impl-history-request-filter-properties-data
  {
   (ds/opt :historyrequestFilterexcludedSelectors) config-node-property-array-spec
   (ds/opt :historyrequestFilterexcludedExtensions) config-node-property-array-spec
   })

(def com-adobe-cq-history-impl-history-request-filter-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-history-impl-history-request-filter-properties
     :spec com-adobe-cq-history-impl-history-request-filter-properties-data}))
