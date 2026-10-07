(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task-properties-data
  {
   (ds/opt :purgeCompleted) config-node-property-boolean-spec
   (ds/opt :completedAge) config-node-property-integer-spec
   (ds/opt :purgeActive) config-node-property-boolean-spec
   (ds/opt :activeAge) config-node-property-integer-spec
   (ds/opt :saveThreshold) config-node-property-integer-spec
   })

(def com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task-properties
     :spec com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task-properties-data}))
