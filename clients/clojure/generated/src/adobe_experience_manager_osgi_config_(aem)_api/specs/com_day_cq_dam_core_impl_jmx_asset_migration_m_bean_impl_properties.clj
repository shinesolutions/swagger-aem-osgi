(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl-properties-data
  {
   (ds/opt :jmxobjectname) config-node-property-string-spec
   })

(def com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl-properties
     :spec com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl-properties-data}))
