(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-monitor-distribution-queue-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-monitor-distribution-queue-health-check-properties-data
  {
   (ds/opt :hcname) config-node-property-string-spec
   (ds/opt :hctags) config-node-property-array-spec
   (ds/opt :hcmbeanname) config-node-property-string-spec
   (ds/opt :numberOfRetriesAllowed) config-node-property-integer-spec
   })

(def org-apache-sling-distribution-monitor-distribution-queue-health-check-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-monitor-distribution-queue-health-check-properties
     :spec org-apache-sling-distribution-monitor-distribution-queue-health-check-properties-data}))
