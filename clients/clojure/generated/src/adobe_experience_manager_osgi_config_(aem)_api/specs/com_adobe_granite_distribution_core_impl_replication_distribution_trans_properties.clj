(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-replication-distribution-trans-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-distribution-core-impl-replication-distribution-trans-properties-data
  {
   (ds/opt :forwardrequests) config-node-property-boolean-spec
   })

(def com-adobe-granite-distribution-core-impl-replication-distribution-trans-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-distribution-core-impl-replication-distribution-trans-properties
     :spec com-adobe-granite-distribution-core-impl-replication-distribution-trans-properties-data}))
