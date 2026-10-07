(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-group-impl-group-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-group-impl-group-service-impl-properties-data
  {
   (ds/opt :maxWaitTime) config-node-property-integer-spec
   (ds/opt :minWaitBetweenRetries) config-node-property-integer-spec
   })

(def com-adobe-cq-social-group-impl-group-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-group-impl-group-service-impl-properties
     :spec com-adobe-cq-social-group-impl-group-service-impl-properties-data}))
