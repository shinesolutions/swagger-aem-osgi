(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hc-core-impl-executor-health-check-executor-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-hc-core-impl-executor-health-check-executor-impl-properties-data
  {
   (ds/opt :timeoutInMs) config-node-property-integer-spec
   (ds/opt :longRunningFutureThresholdForCriticalMs) config-node-property-integer-spec
   (ds/opt :resultCacheTtlInMs) config-node-property-integer-spec
   })

(def org-apache-sling-hc-core-impl-executor-health-check-executor-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-hc-core-impl-executor-health-check-executor-impl-properties
     :spec org-apache-sling-hc-core-impl-executor-health-check-executor-impl-properties-data}))
