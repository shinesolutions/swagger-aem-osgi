(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task-properties-data
  {
   (ds/opt :granitemaintenancemandatory) config-node-property-boolean-spec
   (ds/opt :jobtopics) config-node-property-string-spec
   })

(def com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task-properties
     :spec com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task-properties-data}))
