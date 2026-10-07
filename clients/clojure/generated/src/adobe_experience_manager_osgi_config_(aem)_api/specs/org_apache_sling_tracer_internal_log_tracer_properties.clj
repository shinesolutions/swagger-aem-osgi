(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-tracer-internal-log-tracer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-tracer-internal-log-tracer-properties-data
  {
   (ds/opt :tracerSets) config-node-property-array-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :servletEnabled) config-node-property-boolean-spec
   (ds/opt :recordingCacheSizeInMB) config-node-property-integer-spec
   (ds/opt :recordingCacheDurationInSecs) config-node-property-integer-spec
   (ds/opt :recordingCompressionEnabled) config-node-property-boolean-spec
   (ds/opt :gzipResponse) config-node-property-boolean-spec
   })

(def org-apache-sling-tracer-internal-log-tracer-properties-spec
  (ds/spec
    {:name ::org-apache-sling-tracer-internal-log-tracer-properties
     :spec org-apache-sling-tracer-internal-log-tracer-properties-data}))
