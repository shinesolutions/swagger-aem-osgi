(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-distribution-to-replication-even-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-distribution-core-impl-distribution-to-replication-even-properties-data
  {
   (ds/opt :importername) config-node-property-array-spec
   })

(def com-adobe-granite-distribution-core-impl-distribution-to-replication-even-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-distribution-core-impl-distribution-to-replication-even-properties
     :spec com-adobe-granite-distribution-core-impl-distribution-to-replication-even-properties-data}))
