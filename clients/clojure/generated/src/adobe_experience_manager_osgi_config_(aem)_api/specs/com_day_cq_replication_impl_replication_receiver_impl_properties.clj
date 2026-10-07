(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-replication-receiver-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-replication-receiver-impl-properties-data
  {
   (ds/opt :receivertmpfilethreshold) config-node-property-integer-spec
   (ds/opt :receiverpackagesuseinstall) config-node-property-boolean-spec
   })

(def com-day-cq-replication-impl-replication-receiver-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-replication-receiver-impl-properties
     :spec com-day-cq-replication-impl-replication-receiver-impl-properties-data}))
