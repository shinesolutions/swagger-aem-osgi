(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-version-purge-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-version-purge-task-properties-data
  {
   (ds/opt :versionpurgepaths) config-node-property-array-spec
   (ds/opt :versionpurgerecursive) config-node-property-boolean-spec
   (ds/opt :versionpurgemaxVersions) config-node-property-integer-spec
   (ds/opt :versionpurgeminVersions) config-node-property-integer-spec
   (ds/opt :versionpurgemaxAgeDays) config-node-property-integer-spec
   })

(def com-day-cq-wcm-core-impl-version-purge-task-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-version-purge-task-properties
     :spec com-day-cq-wcm-core-impl-version-purge-task-properties-data}))
