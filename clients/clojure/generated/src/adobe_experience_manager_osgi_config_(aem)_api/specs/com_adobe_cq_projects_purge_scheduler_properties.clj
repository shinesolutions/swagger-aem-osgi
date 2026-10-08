(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-projects-purge-scheduler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-projects-purge-scheduler-properties-data
  {
   (ds/opt :scheduledpurgename) config-node-property-string-spec
   (ds/opt :scheduledpurgepurgeActive) config-node-property-boolean-spec
   (ds/opt :scheduledpurgetemplates) config-node-property-array-spec
   (ds/opt :scheduledpurgepurgeGroups) config-node-property-boolean-spec
   (ds/opt :scheduledpurgepurgeAssets) config-node-property-boolean-spec
   (ds/opt :scheduledpurgeterminateRunningWorkflows) config-node-property-boolean-spec
   (ds/opt :scheduledpurgedaysold) config-node-property-integer-spec
   (ds/opt :scheduledpurgesaveThreshold) config-node-property-integer-spec
   })

(def com-adobe-cq-projects-purge-scheduler-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-projects-purge-scheduler-properties
     :spec com-adobe-cq-projects-purge-scheduler-properties-data}))
