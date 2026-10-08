(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle-properties-data
  {
   (ds/opt :flushagents) config-node-property-array-spec
   })

(def com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle-properties
     :spec com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle-properties-data}))
