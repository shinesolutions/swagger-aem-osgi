(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-content-durbo-binary-less-content-builder-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-content-durbo-binary-less-content-builder-properties-data
  {
   (ds/opt :binarythreshold) config-node-property-integer-spec
   })

(def com-day-cq-replication-impl-content-durbo-binary-less-content-builder-properties-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-content-durbo-binary-less-content-builder-properties
     :spec com-day-cq-replication-impl-content-durbo-binary-less-content-builder-properties-data}))
