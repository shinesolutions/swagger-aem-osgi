(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-replicator-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-replicator-impl-properties-data
  {
   (ds/opt :distribute_events) config-node-property-boolean-spec
   })

(def com-day-cq-replication-impl-replicator-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-replicator-impl-properties
     :spec com-day-cq-replication-impl-replicator-impl-properties-data}))
