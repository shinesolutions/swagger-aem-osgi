(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-hc-impl-disk-space-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-repository-hc-impl-disk-space-health-check-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   (ds/opt :diskspacewarnthreshold) config-node-property-integer-spec
   (ds/opt :diskspaceerrorthreshold) config-node-property-integer-spec
   })

(def com-adobe-granite-repository-hc-impl-disk-space-health-check-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-repository-hc-impl-disk-space-health-check-properties
     :spec com-adobe-granite-repository-hc-impl-disk-space-health-check-properties-data}))
