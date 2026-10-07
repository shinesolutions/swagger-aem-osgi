(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-history-impl-history-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-history-impl-history-service-impl-properties-data
  {
   (ds/opt :historyserviceresourceTypes) config-node-property-array-spec
   (ds/opt :historyservicepathFilter) config-node-property-array-spec
   })

(def com-adobe-cq-history-impl-history-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-history-impl-history-service-impl-properties
     :spec com-adobe-cq-history-impl-history-service-impl-properties-data}))
