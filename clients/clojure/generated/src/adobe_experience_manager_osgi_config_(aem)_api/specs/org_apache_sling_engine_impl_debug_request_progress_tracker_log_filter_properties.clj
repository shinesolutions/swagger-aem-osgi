(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-properties-data
  {
   (ds/opt :extensions) config-node-property-array-spec
   (ds/opt :minDurationMs) config-node-property-integer-spec
   (ds/opt :maxDurationMs) config-node-property-integer-spec
   (ds/opt :compactLogFormat) config-node-property-boolean-spec
   })

(def org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-properties-spec
  (ds/spec
    {:name ::org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-properties
     :spec org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-properties-data}))
