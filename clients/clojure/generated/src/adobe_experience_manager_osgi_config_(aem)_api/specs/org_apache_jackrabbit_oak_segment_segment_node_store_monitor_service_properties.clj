(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service-properties-data
  {
   (ds/opt :commitsTrackerWriterGroups) config-node-property-array-spec
   })

(def org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service-properties
     :spec org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service-properties-data}))
