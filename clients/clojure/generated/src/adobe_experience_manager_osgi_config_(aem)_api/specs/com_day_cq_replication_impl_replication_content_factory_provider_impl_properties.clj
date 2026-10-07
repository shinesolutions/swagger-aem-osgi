(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-replication-content-factory-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-replication-content-factory-provider-impl-properties-data
  {
   (ds/opt :replicationcontentuseFileStorage) config-node-property-boolean-spec
   (ds/opt :replicationcontentmaxCommitAttempts) config-node-property-integer-spec
   })

(def com-day-cq-replication-impl-replication-content-factory-provider-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-replication-content-factory-provider-impl-properties
     :spec com-day-cq-replication-impl-replication-content-factory-provider-impl-properties-data}))
