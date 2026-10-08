(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   })

(def com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-properties
     :spec com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-properties-data}))
