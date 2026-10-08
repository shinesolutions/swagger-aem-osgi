(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-replication-hc-impl-replication-queue-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-replication-hc-impl-replication-queue-health-check-properties-data
  {
   (ds/opt :numberofretriesallowed) config-node-property-integer-spec
   (ds/opt :hctags) config-node-property-array-spec
   })

(def com-adobe-granite-replication-hc-impl-replication-queue-health-check-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-replication-hc-impl-replication-queue-health-check-properties
     :spec com-adobe-granite-replication-hc-impl-replication-queue-health-check-properties-data}))
