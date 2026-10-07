(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-security-hc-packages-impl-example-content-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-security-hc-packages-impl-example-content-health-check-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   })

(def com-adobe-cq-security-hc-packages-impl-example-content-health-check-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-security-hc-packages-impl-example-content-health-check-properties
     :spec com-adobe-cq-security-hc-packages-impl-example-content-health-check-properties-data}))
