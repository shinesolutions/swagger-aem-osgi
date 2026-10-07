(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-content-static-content-builder-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-content-static-content-builder-properties-data
  {
   (ds/opt :host) config-node-property-string-spec
   (ds/opt :port) config-node-property-integer-spec
   })

(def com-day-cq-replication-content-static-content-builder-properties-spec
  (ds/spec
    {:name ::com-day-cq-replication-content-static-content-builder-properties
     :spec com-day-cq-replication-content-static-content-builder-properties-data}))
