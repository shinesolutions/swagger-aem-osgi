(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-jcrclustersupport-cluster-start-level-controller-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-jcrclustersupport-cluster-start-level-controller-properties-data
  {
   (ds/opt :clusterlevelenable) config-node-property-boolean-spec
   (ds/opt :clustermasterlevel) config-node-property-integer-spec
   (ds/opt :clusterslavelevel) config-node-property-integer-spec
   })

(def com-day-cq-jcrclustersupport-cluster-start-level-controller-properties-spec
  (ds/spec
    {:name ::com-day-cq-jcrclustersupport-cluster-start-level-controller-properties
     :spec com-day-cq-jcrclustersupport-cluster-start-level-controller-properties-data}))
