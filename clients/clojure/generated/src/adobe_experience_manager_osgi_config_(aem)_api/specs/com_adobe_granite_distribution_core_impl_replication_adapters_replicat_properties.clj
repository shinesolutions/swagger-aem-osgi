(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-replication-adapters-replicat-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-distribution-core-impl-replication-adapters-replicat-properties-data
  {
   (ds/opt :providerName) config-node-property-string-spec
   (ds/opt :forwardrequests) config-node-property-boolean-spec
   })

(def com-adobe-granite-distribution-core-impl-replication-adapters-replicat-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-distribution-core-impl-replication-adapters-replicat-properties
     :spec com-adobe-granite-distribution-core-impl-replication-adapters-replicat-properties-data}))
