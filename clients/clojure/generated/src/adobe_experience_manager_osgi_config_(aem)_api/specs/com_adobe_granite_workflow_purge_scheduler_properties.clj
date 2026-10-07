(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-purge-scheduler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-purge-scheduler-properties-data
  {
   (ds/opt :scheduledpurgename) config-node-property-string-spec
   (ds/opt :scheduledpurgeworkflowStatus) config-node-property-drop-down-spec
   (ds/opt :scheduledpurgemodelIds) config-node-property-array-spec
   (ds/opt :scheduledpurgedaysold) config-node-property-integer-spec
   })

(def com-adobe-granite-workflow-purge-scheduler-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-purge-scheduler-properties
     :spec com-adobe-granite-workflow-purge-scheduler-properties-data}))
